package com.jx372.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jx372.guestbook.action.Action;
import com.jx372.web.util.WebUtils;

public class DeleteformAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		WebUtils.forward("/deleteform.jsp", request, response);
	}
	
}
