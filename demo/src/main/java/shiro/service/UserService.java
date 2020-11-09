package shiro.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shiro.dao.UserDao;
import shiro.entity.User;

@Service
public class UserService {

    private static Logger logger = Logger.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    public List<User> getAllUser() {

        logger.info("Start");

        List<User> userList = userDao.findAllList(new User());

        for (User user: userList) {
            System.out.println(user.toString());
        }

        logger.info("End");
        return userList;
    }


}
