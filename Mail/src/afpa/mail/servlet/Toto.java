package afpa.mail.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import afpa.mail.services.Services;

/**
 * Servlet implementation class Toto
 */
//@WebServlet("/Toto")
public class Toto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Toto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		Services ser = new Services();
		boolean valid = ser.readFile(login, mdp);
		RequestDispatcher dispatcher ;
		if (! valid) {
			dispatcher = request.getRequestDispatcher("index.jsp?erreur=True");
	        dispatcher.forward(request, response);
		}
		else {
			dispatcher = request.getRequestDispatcher("MailForm.jsp");
	        dispatcher.forward(request, response);
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
