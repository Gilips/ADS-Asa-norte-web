package br.uniceub.classe;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletListNomeParametros
 */
@WebServlet("/ServletListNomeParametros")
public class ServletListNomeParametros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListNomeParametros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();

	    saida.write("<HTML> <BODY>");
		saida.write("Olá, os paeâmetros recebidos por essa requisição são: <BR>");
		
		Enumeration<String> nomesParametros = req.getParameterNames();
		
		while (nomesParametros.hasMoreElements()) {
			String parametro = nomesParametros.nextElement().toString();
			saida.write(parametro);
			saida.write("=");
			saida.write(req.getParameter(parametro));
			saida.write(", ");
		}
		
		saida.write("</BODY><HTML>");
		saida.close(); 
	}


}
