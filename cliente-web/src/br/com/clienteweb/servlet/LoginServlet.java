package br.com.clienteweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cliente.dao.UsuarioDao;
import br.com.cliente.model.Cliente;
import br.com.cliente.model.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 		String usuario =  request.getParameter("Usuario");
 		String senha = request.getParameter("Senha");
 		
 	   	Usuario usuario1 =  new Usuario(usuario, senha);
 	   	List<Usuario> usuarios = UsuarioDao.select();
 	   		
 	    usuario.login(usuarios)
 	   			
 	   
 	   	
 	   
	}

}
