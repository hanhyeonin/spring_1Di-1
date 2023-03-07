package org.iclass.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	private ProductDao dao;
	
	//2)생성자 주입
	@Autowired
	public ProductService(ProductDao dao) {
		System.out.println("::::: ProductService 생성자 - ProductDao bean 주입 :::");
		this.dao=dao;
	}
	
	public void product() {
		System.out.println("---- ProductService product() 메소드 ----");
		dao.product();
	}
}
