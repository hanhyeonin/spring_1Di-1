package org.iclass.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductApp {

	public static void main(String[] args) {
		ApplicationContext context
		= new AnnotationConfigApplicationContext(ProductConfig.class);
		
//		ProductDao dao = context.getBean(ProductDao.class);
//		dao.product();
		
//		ProductService service = context.getBean(ProductService.class);
//		service.product();
	}

}
