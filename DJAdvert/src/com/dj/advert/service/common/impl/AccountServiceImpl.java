package com.dj.advert.service.common.impl;
/**
 * 商品接口实现类
 */
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.advert.dao.common.AccountDao;
import com.dj.advert.entity.common.Account;
import com.dj.advert.service.common.AccountService;
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public int add(Account account) {
		// TODO Auto-generated method stub
		return accountDao.add(account);
	}

	@Override
	public int edit(Account account) {
		// TODO Auto-generated method stub
		return accountDao.edit(account);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return accountDao.delete(id);
	}

	@Override
	public List<Account> findList(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return accountDao.findList(queryMap);
	}

	@Override
	public Integer getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return accountDao.getTotal(queryMap);
	}

	@Override
	public Account findById(Long id) {
		// TODO Auto-generated method stub
		return accountDao.findById(id);
	}

	@Override
	public Account findByName(String name) {
		// TODO Auto-generated method stub
		return accountDao.findByName(name);
	}


	@Override
	public int editBalance(Account account) {
		// TODO Auto-generated method stub
		return accountDao.editBalance(account);
	}
	
	

}
