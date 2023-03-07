package org.iclass.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductController {
	
	private ProductService service;
	
	//3) setter 주입을 위해서 기본생성자 정의
	public ProductController() {
		System.out.println("::::: ProductController 기본 생성자 :::::");
	}
	
	@Autowired
	public void setService(ProductService service) {
		System.out.println("---- ProductController setter 메소드 ----");
		this.service = service;
	}
	
	
	//2)생성자 주입
	//	@Autowired   //3)setter 주입할 때 주석처리
	public ProductController(ProductService service) {
		System.out.println("::::: ProductController 생성자 - ProductService bean 주입 :::");
		this.service=service;
	}
	
	public void product() {
		System.out.println("---- ProductController product() 메소드 ----");
		service.product();
	}
}
