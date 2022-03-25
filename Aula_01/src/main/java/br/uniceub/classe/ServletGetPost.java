package br.uniceub.classe;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGetPost
 */
@WebServlet("/ServletGetPost")
public class ServletGetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter saida = response.getWriter();

	    saida.write("<HTML> <BODY> olá ");
		saida.write("Resposta do GET");
		saida.write("</BODY><HTML>");
		saida.close(); 
   }
   
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter saida = response.getWriter();
		
		saida.write("<HTML> <BODY> olá ");
		saida.write("Resposta do metodo POST");
		saida.write("</BODY><HTML>");
		saida.close(); 
   }

}
