package com.dj.advert.dao.home;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import com.dj.advert.entity.home.Address;

/**
 * 收货地址dao层
 * @author Administrator
 *
 */
@Repository
public interface AddressDao {
	/**
	 * 添加收货地址
	 * @param address
	 * @return
	 */
	public int add(Address address);
	
	/**
	 * 编辑收货地址
	 * @param address
	 * @return
	 */
	public int edit(Address address);
	
	/**
	 * 删除收货地址
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 多条件搜索词查询收货地址
	 * @param queMap
	 * @return
	 */
	public List<Address> findList(Map<String, Object> queryMap);
	
	/**
	 * 获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 根据id查询收货地址
	 * @param id
	 * @return
	 */
	public Address findById(Long id);
}
