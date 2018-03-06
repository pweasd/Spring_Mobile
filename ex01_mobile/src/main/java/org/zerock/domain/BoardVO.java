package org.zerock.domain;


import java.util.Date;

public class BoardVO {

	//테이블의 각종 컬럼 정보들을 받아와서 저장할 변수들
	private Integer id;	//아이디
	private String title;	//제목
	private Date date;	//날짜
	private String content;	//내용
	private Integer view;	//조회수
	private String path1,path2,path3;	//path의 경우 파일업로드에만 사용하는 컬럼. 현재는 사용안함
	

	//get...set...
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getView() {
		return view;
	}
	public void setView(Integer view) {
		this.view = view;
	}
	public String getPath1() {
		return path1;
	}
	public void setPath1(String path1) {
		this.path1 = path1;
	}
	public String getPath2() {
		return path2;
	}
	public void setPath2(String path2) {
		this.path2 = path2;
	}
	public String getPath3() {
		return path3;
	}
	public void setPath3(String path3) {
		this.path3 = path3;
	}

}
