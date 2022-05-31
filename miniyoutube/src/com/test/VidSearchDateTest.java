package com.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.VidService;
import com.vo.VidVO;

public class VidSearchDateTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		VidService service = 
				(VidService) factory.getBean("vservice");
		
		Date d = Date.valueOf("2022-05-05");
		
		List<VidVO> list = null;
		try {
			list = service.searchdate(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (VidVO vidVO : list) {
			System.out.println(vidVO);
		}
	}
}
