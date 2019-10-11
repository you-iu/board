package com.khrd.handler;

import java.sql.Connection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.khrd.controller.CommandHandler;
import com.khrd.dao.MemberDAO;
import com.khrd.dto.Member;
import com.khrd.jdbc.ConnectionProvider;
import com.khrd.jdbc.JDBCUtil;

public class ChangePwdHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getMethod().equalsIgnoreCase("get")) {
			return "/WEB-INF/view/changePwdForm.jsp";
		}else if(request.getMethod().equalsIgnoreCase("post")) {
			request.setCharacterEncoding("utf-8");
			String memberId = request.getParameter("memberid");
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String confirmPassword = request.getParameter("confirmPassword");
			Connection conn = null;
			try {
				conn = ConnectionProvider.getConnection();
				MemberDAO dao = MemberDAO.getInstance();
				Member member = new Member(memberId, name, confirmPassword, new Date());
				Member dbm = dao.selectById(conn, memberId);
				if(password.equals(dbm.getPassword())==true) {
					int result = dao.update(conn, member);
					request.setAttribute("result", result);
					return "/WEB-INF/view/changePwdSuccess.jsp";
				}else {
					request.setAttribute("notMatch",true );
					return "/WEB-INF/view/changePwdForm.jsp";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn);
			}
		}
		
		return null;
	}

}
