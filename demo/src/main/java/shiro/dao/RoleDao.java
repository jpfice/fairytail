package shiro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import base.AbstractDao;
import base.IDao;
import shiro.entity.Role;

@Repository
public class RoleDao extends AbstractDao implements IDao<Role>{

    @Override
    public Role get(String id) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public Role get(Role entity) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public List<Role> findList(Role entity) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public List<Role> findAllList(Role entity) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    @Override
    public int insert(Role entity) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public int update(Role entity) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

    @Override
    public int delete(Role entity) {
        // TODO 自動生成されたメソッド・スタブ
        return 0;
    }

}
