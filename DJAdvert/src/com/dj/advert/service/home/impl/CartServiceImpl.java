package com.dj.advert.service.home.impl;
/**
 * 购物车接口实现类
 */
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dj.advert.dao.home.CartDao;
import com.dj.advert.entity.home.Cart;
import com.dj.advert.service.home.CartService;


@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;
	
	@Override
	public int add(Cart cart) {
		return cartDao.add(cart);
	}

	@Override
	public int edit(Cart cart) {
		return cartDao.edit(cart);
	}

	@Override
	public int delete(Long id) {
		return cartDao.delete(id);
	}

	@Override
	public List<Cart> findList(Map<String, Object> queMap) {
		return cartDao.findList(queMap);
	}

	@Override
	public Integer getTotal(Map<String, Object> queryMap) {
		return cartDao.getTotal(queryMap);
	}

	@Override
	public Cart findById(Long id) {
		return cartDao.findById(id);
	}

	@Override
	public Cart findByIds(Map<String, Long> queryMap) {
		return cartDao.findByIds(queryMap);
	}

	@Override
	public int deleteByUid(Long userId) {
		return cartDao.deleteByUid(userId);
	}

}
