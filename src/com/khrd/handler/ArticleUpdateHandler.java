package com.khrd.handler;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khrd.controller.CommandHandler;
import com.khrd.dao.ArticleDAO;
import com.khrd.dto.Article;
import com.khrd.jdbc.ConnectionProvider;
import com.khrd.jdbc.JDBCUtil;

public class ArticleUpdateHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getMethod().equalsIgnoreCase("get")) {
			
			String No = request.getParameter("no");
			Connection conn = null;
			int no = Integer.parseInt(No);
			try {
				conn = ConnectionProvider.getConnection();
				ArticleDAO dao = ArticleDAO.getInstance();
				Article article =dao.selectByNo(conn, no);
				request.setAttribute("article", article);
				return "/WEB-INF/view/articleUpdate.jsp";
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn);
			}
			
		}else if(request.getMethod().equalsIgnoreCase("post")){
			//request.setCharacterEncoding("utf-8");
			String No = request.getParameter("no");
			int no = Integer.parseInt(No);
			String title = request.getParameter("title");
			String content = request.getParameter("content");
					
			Connection conn = null;
			try {
				conn = ConnectionProvider.getConnection();
				ArticleDAO dao = ArticleDAO.getInstance();
				Article ar = new Article(no, null, null, title, null, null, 0, content);
				dao.updateArticle(conn, ar);
				dao.updateArticleContent(conn, ar);
				response.sendRedirect(request.getContextPath()+"/article/list.do");
				return null;
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(conn);
			}
		}
		
		
		return null;
	}

}
