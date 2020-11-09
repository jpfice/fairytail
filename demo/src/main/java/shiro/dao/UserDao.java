package shiro.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import base.AbstractDao;
import base.IDao;
import shiro.entity.User;

@Repository
public class UserDao  extends AbstractDao implements IDao<User>{

    @Override
    public User get(String id) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public User get(User entity) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public List<User> findList(User entity) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public List<User> findAllList(User entity) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User>  listUser = sqlSession.selectList("");
        sqlSession.close();
        return listUser;
    }

    @Override
    public int insert(User entity) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public int update(User entity) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public int delete(User entity) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

}
