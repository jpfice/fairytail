package com.dj.advert.service.home.impl;
/**
 * 收藏接口实现类
 */
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dj.advert.dao.home.FavoriteDao;
import com.dj.advert.entity.home.Favorite;
import com.dj.advert.service.home.FavoriteService;


@Service
public class FavoriteServiceImpl implements FavoriteService {

	@Autowired
	private FavoriteDao favoriteDao;
	
	@Override
	public int add(Favorite favorite) {
		return favoriteDao.add(favorite);
	}

	@Override
	public int delete(Long id) {
		return favoriteDao.delete(id);
	}

	@Override
	public List<Favorite> findList(Map<String, Object> queMap) {
		return favoriteDao.findList(queMap);
	}

	@Override
	public Integer getTotal(Map<String, Object> queryMap) {
		return favoriteDao.getTotal(queryMap);
	}

	@Override
	public Favorite findById(Long id) {
		return favoriteDao.findById(id);
	}

	@Override
	public Favorite findByIds(Map<String, Long> queryMap) {
		return favoriteDao.findByIds(queryMap);
	}

}
