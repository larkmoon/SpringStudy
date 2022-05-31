package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.VidVO;

public class VidUpdateTest {
	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String,VidVO> service = 
				(Service<String, VidVO>) factory.getBean("vservice");
		

		VidVO v = new VidVO(30, "Peekaboo MV");
	
		try{
			service.modify(v);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
