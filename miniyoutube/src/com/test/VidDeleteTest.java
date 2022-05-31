package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.VidVO;

public class VidDeleteTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,VidVO> service = 
				(Service<Integer, VidVO>) factory.getBean("vservice");
		
		try{
			service.remove(21);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
