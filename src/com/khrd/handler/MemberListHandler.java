package com.khrd.handler;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khrd.controller.CommandHandler;
import com.khrd.dao.MemberDAO;
import com.khrd.dto.Member;
import com.khrd.jdbc.ConnectionProvider;



public class MemberListHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
			Connection conn = null;
			conn = ConnectionProvider.getConnection();
			MemberDAO dao = MemberDAO.getInstance();
			List<Member> list = dao.selectList(conn);
			request.setAttribute("list", list);
		return "/WEB-INF/view/memberList.jsp";
	}

}
