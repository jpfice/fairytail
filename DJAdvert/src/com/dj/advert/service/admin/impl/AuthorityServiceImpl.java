package com.dj.advert.service.admin.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dj.advert.dao.admin.AuthorityDao;
import com.dj.advert.entity.admin.Authority;
import com.dj.advert.service.admin.AuthorityService;


@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityDao authorityDao;
	
	@Override
	public int add(Authority authority) {
		return authorityDao.add(authority);
	}

	@Override
	public int deleteByRoleId(Long roleId) {
		return authorityDao.deleteByRoleId(roleId);
	}

	@Override
	public List<Authority> findListByRoleId(Long roleId) {
		return authorityDao.findListByRoleId(roleId);
	}

}
