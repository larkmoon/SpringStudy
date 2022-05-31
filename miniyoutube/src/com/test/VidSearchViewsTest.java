package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.VidService;
import com.vo.VidVO;

public class VidSearchViewsTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		VidService service = 
				(VidService) factory.getBean("vservice");
		
		List<VidVO> list = null;
		try {
			list = service.searchviews(20000.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (VidVO vidVO : list) {
			System.out.println(vidVO);
		}
	}
}
