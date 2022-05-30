package com.test;

import java.sql.Date;
import java.text.SimpleDateFormat;

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
		
		SimpleDateFormat sysdate = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = new java.util.Date();
		
		Date d = Date.valueOf(sysdate.format(date));
		VidVO v = new VidVO(4, "Feel My Rhythm MV", d);
		try{
			service.modify(v);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
