package sys.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import base.AbstractDao;
import sys.entity.User;
import sys.service.LoginService;

@Repository
public class LoginDao extends AbstractDao{

    private static Logger logger = Logger.getLogger(LoginService.class);

    public List<User> getAllUser(){
        logger.info("LoginDao getAllUser Start");

        SqlSession sqlsession = sqlSessionFactory.openSession();
        List<User> userList = sqlsession.selectList("sys.mapper.selectAllUser");
        sqlsession.close();

        logger.info("LoginDao getAllUser End");
        return userList;
    }



}
