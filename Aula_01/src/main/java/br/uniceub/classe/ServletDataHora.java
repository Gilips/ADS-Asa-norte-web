package br.uniceub.classe;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDataHora
 */
@WebServlet("/ServletDataHora")
public class ServletDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss ");
    
    @Override
    public void init() throws ServletException {
    	log("A servlet iniciou em: "+format.format(new Date()));
    	super.init();
    	
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML> <BODY> olá");
		saida.write("A data e hora atual é:<br>" +format.format(new Date()));
		saida.write("</BODY><HTML>");
		saida.close(); 
	}
	
	@Override
	public void destroy() {
		log("A servlet iniciou em: "+format.format(new Date()));
		super.destroy();
	}
	

}
