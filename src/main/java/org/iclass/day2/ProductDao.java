package org.iclass.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {
	
	private int count;
	
	//3) 기본생성자 정의
	public ProductDao() {
		System.out.println("::::: ProductDao 기본 생성자 :::::");
	}
	
	public void setCount(@Value("22") int count) {
		System.out.println("---- ProductDao setter 메소드 ----");
		this.count = count;
	}
	
	public ProductDao(@Value("10") int count) {
		System.out.println("::::: ProductDao 생성자 - int value 전달 :::");
		this.count=count;
	}
	
	public void product() {
		System.out.println("---- ProductDao product() 메소드 ----");
		System.out.println("----- 수량 : " + count + " 생산합니다.");
	}
}
