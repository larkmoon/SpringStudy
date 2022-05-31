package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.VidVO;

public class VidSelecttTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,VidVO> service = 
				(Service<Integer, VidVO>) factory.getBean("vservice");
		
		
		VidVO v = null;
		
		try {
			v = service.get(30);
			VidVO v2 = new VidVO(v.getId(), v.getViews() + 1);
			service.increaseview(v2);
			System.out.println(v2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
