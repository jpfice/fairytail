package sys.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sys.dao.LoginDao;
import sys.entity.User;

@Service
public class LoginService {

    private static Logger logger = Logger.getLogger(LoginService.class);

    @Autowired
    private LoginDao loginDao;

    public List<User> getAllUser() {

        logger.info("Start");

        List<User> userList = loginDao.getAllUser();

        logger.info("End");
        return userList;
    }



}
