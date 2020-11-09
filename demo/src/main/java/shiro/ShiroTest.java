package shiro;

import org.springframework.stereotype.Repository;

import shiro.service.UserService;

@Repository
public class ShiroTest {

    public static void main(String[] args) {


//        ShiroMain sm = new ShiroMain();
//        sm.shiroDbOpen();

        UserService us = new UserService();
        us.getAllUser();

    }

}
