package com.dj.advert.service.home.impl;
/**
 * 收货地址接口实现类
 */
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dj.advert.dao.home.AddressDao;
import com.dj.advert.entity.home.Address;
import com.dj.advert.service.home.AddressService;


@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao addressDao;
	
	@Override
	public int add(Address address) {
		return addressDao.add(address);
	}

	@Override
	public int edit(Address address) {
		return addressDao.edit(address);
	}

	@Override
	public int delete(Long id) {
		return addressDao.delete(id);
	}

	@Override
	public List<Address> findList(Map<String, Object> queMap) {
		return addressDao.findList(queMap);
	}

	@Override
	public Integer getTotal(Map<String, Object> queryMap) {
		return addressDao.getTotal(queryMap);
	}

	@Override
	public Address findById(Long id) {
		return addressDao.findById(id);
	}

}
