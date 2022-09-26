package com.sist.myapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.MemberDAO;
import com.sist.dao.MemberVO;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
		
		MemberDAO dao = (MemberDAO)app.getBean("memberDAO");
		List<MemberVO> list = dao.memberListData();
		for(MemberVO vo:list)
		{
			System.out.println(vo.getNo() + " " + vo.getName() + " " + vo.getSex() + " " + vo.getContent());
		}
	}
}
