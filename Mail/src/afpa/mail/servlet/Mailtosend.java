package afpa.mail.servlet;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import afpa.mail.services.Services;

/**
 * Servlet implementation class Mailtosend
 */
//@WebServlet("/Mailtosend")
public class Mailtosend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mailtosend() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String email = request.getParameter("dest");
		String objet = request.getParameter("obj");
		String message = request.getParameter("mess");
		Services ser = new Services();
		RequestDispatcher dispatcher ;
		try {
			ser.sendMail(email, objet, message);
			dispatcher = request.getRequestDispatcher("confirmedSent.jsp");
		    dispatcher.forward(request, response);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			dispatcher = request.getRequestDispatcher("MailForm.jsp");
		    dispatcher.forward(request, response);
			e.printStackTrace();
		}
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
