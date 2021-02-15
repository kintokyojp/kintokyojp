package sprin01;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Peo peo = classPathXmlApplicationContext.getBean("peo",Peo.class);
				
		System.out.println(peo);
	}

}
