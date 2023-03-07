package org.iclass.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductController {
	
	private ProductService service;
	
	//2)생성자 주입
	@Autowired
	public ProductController(ProductService service) {
		System.out.println("::::: ProductController 생성자 - ProductService bean 주입 :::");
		this.service=service;
	}
	
	public void product() {
		System.out.println("---- ProductController product() 메소드 ----");
		service.product();
	}
}
