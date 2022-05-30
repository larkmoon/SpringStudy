package com.test;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.VidVO;

public class VidInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,VidVO> service = 
				(Service<Integer, VidVO>) factory.getBean("vservice");
		
		
		SimpleDateFormat sysdate = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = new java.util.Date();
		
		Date d = Date.valueOf(sysdate.format(date));
		VidVO v = new VidVO(6, "Summer Feelings", d);
		
		
		try{
			service.register(v);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
