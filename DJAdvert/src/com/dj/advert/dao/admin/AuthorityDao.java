package com.dj.advert.dao.admin;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.dj.advert.entity.admin.Authority;

/**
 * 权限实现类dao
 * @author llq
 *
 */
@Repository
public interface AuthorityDao {
	public int add(Authority authority);
	public int deleteByRoleId(Long roleId);
	public List<Authority> findListByRoleId(Long roleId);
}
