package br.com.fundamentos.tipos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Exercicio1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    	String num1 = request.getParameter("num1");
    	String num2 = request.getParameter("num2");
    	int x = Integer.parseInt(num1);
    	int y = Integer.parseInt(num2);
    	
    	Metodos metodos = new Metodos();
    	
		/*
		if(x > y) {
			mensagemExibida = "O primeiro número é o maior.";
		} else {
			mensagemExibida = "O segundo número é o maior.";
		}
    	*/
    	
		PrintWriter writer = response.getWriter();
		writer.write("<html><body>");
		writer.write(metodos.getVerificaMaior(x, y));
		
		
		writer.write("<br><br><a href=\"javascript:window.history.go(-1)\">Voltar</a></body></html>");
    }
}
