package com.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.VidVO;

public class VidConsoleTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,VidVO> service = 
				(Service<Integer, VidVO>) factory.getBean("vservice");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.printf("Welcome to Youtube!\n"
					+ "To Upload: u / To Delete: d\n"
					+ "To Modify: m / To Watch: w\n"
					+ "To Get Playlist: l / To quit: q\n"
					+ "------------\n");
			String cmd = sc.nextLine();
			
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("u")) {
				System.out.println("Enter your video title");
				String title = sc.nextLine();
				
				SimpleDateFormat sysdate = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = new java.util.Date();
				
				Date d = Date.valueOf(sysdate.format(date));
				VidVO v = new VidVO(null, title, d, 0.0, 0.0);
				
				try{
					service.register(v);
					System.out.println("Uploaded Video " + v + "\n"
							+ "------------\n");
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
		
			}else if(cmd.equals("d")) {
				System.out.println("Enter Video ID");
				String stid = sc.next();
				int id = Integer.parseInt(stid);
				
				try{
					service.remove(id);
					System.out.println("Deleted Video ID" + id + "\n" + "------------\n");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			
			}else if(cmd.equals("m")) {
				System.out.println("Enter Video ID");
				String strid = sc.nextLine();
				int id = Integer.parseInt(strid);
				
				System.out.println("Enter Video Title");
				String title = sc.nextLine();
				
				VidVO v = new VidVO(id, title);
				try{
					service.modify(v);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
			}else if(cmd.equals("w")) {
				System.out.println("Enter Video ID");
				String stid = sc.nextLine();
				int id = Integer.parseInt(stid);
				
				VidVO v = null;
	
				try{
					service.watch(id);
					System.out.println("Playing " + (service.get(id)).getTitle() + "\n" + "------------\n");
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}else if(cmd.equals("l")) {
				List<VidVO> list = null;
				try {
					list = service.get();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.printf("My Playlist\n" + "------------\n");
				for (VidVO vidVO : list) {
					System.out.println(vidVO);
				}
				System.out.printf("------------\n");
			}
			
		}

			sc.close();
		
	}

}
