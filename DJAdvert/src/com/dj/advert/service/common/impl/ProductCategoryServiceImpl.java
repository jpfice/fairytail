package com.dj.advert.service.common.impl;
/**
 * 商品分类接口实现类
 */
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dj.advert.dao.common.ProductCategoryDao;
import com.dj.advert.entity.common.ProductCategory;
import com.dj.advert.service.common.ProductCategoryService;


@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	@Override
	public int add(ProductCategory productCategory) {
		return productCategoryDao.add(productCategory);
	}

	@Override
	public int edit(ProductCategory productCategory) {
		return productCategoryDao.edit(productCategory);
	}

	@Override
	public int delete(Long id) {
		return productCategoryDao.delete(id);
	}

	@Override
	public List<ProductCategory> findList(Map<String, Object> queMap) {
		return productCategoryDao.findList(queMap);
	}

	@Override
	public Integer getTotal(Map<String, Object> queryMap) {
		return productCategoryDao.getTotal(queryMap);
	}

	@Override
	public ProductCategory findById(Long id) {
		return productCategoryDao.findById(id);
	}

}
