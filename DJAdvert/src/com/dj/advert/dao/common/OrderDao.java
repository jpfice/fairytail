package com.dj.advert.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dj.advert.entity.common.Order;
import com.dj.advert.entity.common.OrderItem;

/**
 * 订单dao层
 * @author Administrator
 *
 */
@Repository
public interface OrderDao {
	/**
	 * 添加订单
	 * @param order
	 * @return
	 */
	public int add(Order order);
	
	/**
	 * 添加订单子项
	 * @param orderItem
	 * @return
	 */
	public int addItem(OrderItem orderItem);
	
	/**
	 * 编辑订单
	 * @param order
	 * @return
	 */
	public int edit(Order order);
	
	/**
	 * 删除订单
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 多条件搜索词查询订单
	 * @param queMap
	 * @return
	 */
	public List<Order> findList(Map<String, Object> queryMap);
	
	/**
	 * 获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 根据id查询订单
	 * @param id
	 * @return
	 */
	public Order findById(Long id);
	
	/**
	 * 根据订单号查询所属的订单子项
	 * @param orderId
	 * @return
	 */
	public List<OrderItem> findOrderItemList(Long orderId);
	
	/**
	 * 获取统计信息
	 * @param queryMap
	 * @return
	 */
	public List<Map<String,String>> getStats(Map<String, Object> queryMap);
}
