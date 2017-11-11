package br.com.fundamentos.tipos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Condicional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramUm = request.getParameter("paramUm");
		int x = Integer.parseInt(paramUm);
		String mensagemExibida;
		
		
		if(x == 1) { 
			mensagemExibida = "O número informado foi aceito.";
		} else { 
			mensagemExibida = "O sistema aceita somente o número 1.";
		}
		
		PrintWriter writer = response.getWriter();
		writer.write("<html><body>");
		writer.write(mensagemExibida);
		writer.write("</body></html>");
		
	}
}