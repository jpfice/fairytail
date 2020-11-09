package sys.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sys.entity.User;
import sys.service.LoginService;

@Controller
public class LoginController {

    private static Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    //, method = RequestMethod.POST

    @ResponseBody
    @RequestMapping(value = "/Login.do", produces = { "application/json;charset=UTF-8" })
    public Map<String, Object> login() {
        logger.info("UserAction Login Start");

        List<User> userList = loginService.getAllUser();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", userList.size());
        map.put("data", userList);

        //String datas =  JsonUtil.Map2Json(map);

        //logger.info(datas);
        logger.info("UserAction Login End");
        return map;
    }
}
