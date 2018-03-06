package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardDAO {
	//insert method
	public void create(BoardVO vo)throws Exception;
	//select view
	public BoardVO read(Integer id)throws Exception;
	//update
	public void update(BoardVO vo)throws Exception;
	//delete
	public void delete(Integer id)throws Exception;
	//전체리스트
	public List<BoardVO> listAll()throws Exception;
	
//	public List<BoardVO> listPage(int page)throws Exception;
	//페이징
	public List<BoardVO> listCriteria(Criteria cri)throws Exception;
	//페이지 개수
	public int countPaging(Criteria cri)throws Exception;
	
	//조회수
	public void updateview(Integer id)throws Exception;
}
