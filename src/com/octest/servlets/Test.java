package com.octest.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Auteur;
import com.octest.beans.Voiture;
import com.octest.forms.ConnectionForm;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		 HttpSession session=request.getSession();
		 String prenom= (String) session.getAttribute("prenom");
		 String nom= (String) session.getAttribute("nom");
		 Cookie cookie=new Cookie("prenom",prenom);
		 cookie.setMaxAge(60);
		 response.addCookie(cookie);
		 
		 //response.addCookie(new Cookie("prenom",prenom));
		 this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom= request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		HttpSession session=request.getSession();	
		session.setAttribute("nom", nom);
		session.setAttribute("prenom", prenom);
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
		// TODO Auto-generated method stub
	//	doGet(request, response);
	}

}
