package com.dj.advert.dao.home;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.dj.advert.entity.home.Purse;

/**
 * �û���ֵdao��
 * @author Administrator
 *
 */
@Repository
public interface PurseDao {
	/**
	 * ��ֵ�ύ
	 * @param address
	 * @return
	 */
	public int add(Purse purse);
	
	/**
	 * ����id��ѯ��ֵ�û�
	 * @param id
	 * @return
	 */
	public List<Purse> findById(Long id);
	/**
	 * ��ѯ��ֵ��¼
	 * @param userId
	 * @return
	 */
	public List<Purse> findRecord(Map<String,Object> queryMap);
	
	/**
	 * ����Ҫ���ѯ��ֵ�б�
	 * @param map
	 * @return
	 */
	public List<Purse> findList(Map<String,Object> queryMap);
	
	/**
	 * ������
	 * @param queryMap
	 * @return
	 */
	public int getTotal(Map<String,Object> queryMap);
	
	/**
	 * ��̨��˽��
	 */
	public int examine(Purse purse);
	

	/**
	 * ����ids��ѯ��ֵ�б�
	 * @param queryMap
	 * @return
	 */
	public Purse findListByid(Integer id);

	
	/**
	 * ȷ�϶����� �����û����
	 * @param queryMap
	 * @return
	 */
	public int editBalance(Map<String,Object> paramMap);
	
}
