package com.dj.advert.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dj.advert.entity.common.Comment;

/**
 * 商品dao层
 * @author Administrator
 *
 */
@Repository
public interface CommentDao {
	/**
	 * 添加评论
	 * @param comment
	 * @return
	 */
	public int add(Comment comment);
	
	/**
	 * 编辑评论
	 * @param comment
	 * @return
	 */
	public int edit(Comment comment);
	
	/**
	 * 删除评论
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 多条件搜索词查询评论
	 * @param queMap
	 * @return
	 */
	public List<Comment> findList(Map<String, Object> queryMap);
	
	/**
	 * 获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 根据id查询评论
	 * @param id
	 * @return
	 */
	public Comment findById(Long id);
}
