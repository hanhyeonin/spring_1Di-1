package org.iclass.day1di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		//spring-context : bean에 접근하기위해 사용. bean 은 스프링 컨테이너에 저장.
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BuyConfig.class);
		
		//1)10~12라인 코딩하고 실행시키면 객체가 생성된것을 확인할 수 있습니다.
		//2)생성된 bean을 가져오겠습니다.
		Buy2Controller controller = context.getBean(Buy2Controller.class);		//type으로 가져오기
		//3)인스턴스 메소드 buy() 실행하기
		controller.buy();
		
		Buy2Controller controller2 = (Buy2Controller) context.getBean("controller");  
		 //bean 이름으로 가져오기 -> 캐스팅 필요함 convert from Object to Buy2Controller   
		controller2.buy();
		
		System.out.println("::: 스프링 컨테이너에 저자된 bean의 이름확인 :::");
		String[] beans = context.getBeanDefinitionNames();  //bean의 이름들 가져오기
		for(String bean : beans) {
			System.out.println(bean);
		}
		//bean의 이름은 자동으로 클래스이름(첫글자는 소문자)
		//bean의 이름은 @Component 에서 value 속성값으로 바꿀수 있음.
	}
}
//스프링에서는 의존객체 설정을 자동으로 합니다. 
// 1) 생성자 주입(커스텀생성자)  2) setter 주입 3) 기본생성자와 필드 주입
