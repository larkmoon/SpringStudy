package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.VidService;
import com.vo.VidVO;

public class VidSearchNameTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		VidService service = 
				(VidService) factory.getBean("vservice");
		
		List<VidVO> list = null;
		try {
			list = service.searchtitle("MV");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (VidVO vidVO : list) {
			System.out.println(vidVO);
		}
	}
}
