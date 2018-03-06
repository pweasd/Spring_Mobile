package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.HibernateUtil;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession session;
	//sql���� ����� xml mapper
	private static String namespace
	="org.zerock.mapper.BoardMapper";
	//insert ���� method
	@Override
	public void create(BoardVO vo) throws Exception {
		//namespace + id + �� 
		session.insert(namespace+".create",vo);
		
		
		//Hibernate insert
//		 Session sessions = HibernateUtil.getSessionFactory().openSession();
//		 Transaction tx = sessions.beginTransaction();
//		 sessions.persist(vo);		
//		
//		 tx.commit();
//		 sessions.close();
	}
	//select ���� method
	@Override
	public BoardVO read(Integer id) throws Exception {
	
		return session.selectOne(namespace+".read",id);
	}
	//update ���� method
	@Override
	public void update(BoardVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}
	//delete ���� method
	@Override
	public void delete(Integer id) throws Exception {
	
		session.delete(namespace+".delete",id);
	}
	//select * ���� method
	@Override
	public List<BoardVO> listAll() throws Exception {

		return session.selectList(namespace+".listAll");
	}
	//��ȸ�� update ���� method
	@Override
	public void updateview(Integer id)throws Exception{
		
		session.update(namespace+".updateview",id);
	}

//	@Override
//	public List<BoardVO> listPage(int page) throws Exception {
//		// TODO Auto-generated method stub
//		if (page <= 0) {
//			page= 1;
//		}
//		page = (page -1) * 10;
//		return session.selectList(namespace+".listPage",page);
//	}
	//paging method
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".listCriteria",cri);
	}
	//EndPage �ľ�
	@Override
	public int countPaging(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".countPaging",cri);
	}

}
