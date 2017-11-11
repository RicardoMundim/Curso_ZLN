package br.com.servletweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//PrintWriter writer = response.getWriter();
		//writer.write("<html><body>Meu Primeiro Servlet</body></html>");
		
		String filtro = request.getParameter("filtro");
		List<String> resultado = filtrarClientes(filtro);
		
		PrintWriter writer = response.getWriter();
		
		writer.write("<html><body>");
		writer.write("<ul>");
		
		for (String item : resultado) {
			writer.write("<li>" + item + "</li>");	
		}
		
		writer.write("</ul>");
		writer.write("</body></html>");
		
	}
	
	private List<String> filtrarClientes(String filtro){
		
		List<String> clientes = new ArrayList<String>();
		List<String> listaFiltrada = new ArrayList<String>();
		
		clientes.add("Alan Um");
		clientes.add("Alan Dois");
		clientes.add("Catia");
		clientes.add("Ismael Um");
		clientes.add("Jandeilson");
		
		if(filtro!= null && !filtro.equals("")) {
			for (String cliente : clientes) {
				if(cliente.toUpperCase().contains(filtro.toUpperCase()))
					listaFiltrada.add(cliente);
			}
		} else {
			listaFiltrada = clientes;
		}
		
		return listaFiltrada;
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
	
	
}
