package br.com.fundamentos.tipos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exercicio3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String laco = request.getParameter("laco");
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);

		Metodos metodos = new Metodos();

		PrintWriter writer = response.getWriter();
		writer.write("<html><body>");
		if (laco == null) {
			writer.write("<b>Obrigatorio escolher uma opção de laço.</b>");
		} else {
			writer.write(metodos.getImprimiSequencialLaco(x, y, laco));
		}
		writer.write("<br><br><a href=\"javascript:window.history.go(-1)\">Voltar</a></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);

		Metodos metodos = new Metodos();

		PrintWriter writer = response.getWriter();
		writer.write("<html><body>");
		writer.write(metodos.getImprimiSequencial(x, y));

		writer.write("<br><br><a href=\"javascript:window.history.go(-1)\">Voltar</a></body></html>");
	}
}
