package org.iclass.day1di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class Buy2Service {
	
	@Autowired   //다른 bean 이름 지정안하면 자동으로 일치하는 type으로 bean 가져오기
	private Buy2Dao dao;
	
//	public Buy2Service(Buy2Dao dao) {
//		System.out.println("::: Buy2Service 커스텀 생성자 :::");
//		this.dao = dao;
//	}
	
	public Buy2Service() {
		System.out.println("::: Buy2Service 기본 생성자 :::");
	}
	
	public void setDao(Buy2Dao dao) {
		System.out.println("::: Buy2Service 다오 setter :::");
		this.dao = dao;
	}
	
	public void buy() {
		System.out.println("--- Buy2Service buy() 메소드 ---");
		dao.buy();
	}

}
