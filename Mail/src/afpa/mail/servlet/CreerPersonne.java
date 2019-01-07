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
 * Servlet implementation class CreerPersonne
 */
//@WebServlet("/CreerPersonne")
public class CreerPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerPersonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Services ser = new Services();
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresseMail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		ser.writeFile(login, mdp, nom, prenom, adresseMail, tel);
		RequestDispatcher dispatcher ;
		dispatcher = request.getRequestDispatcher("index.jsp");
	      dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
