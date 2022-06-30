package br.com.tiago.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tiago.gerenciador.modelo.Banco;
import br.com.tiago.gerenciador.modelo.Usuario;

public class Login implements Acao {
	
	 @Override
	    public String executa(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		 
		 	String login = request.getParameter("login");
	        String senha = request.getParameter("senha");
	        
	        Banco banco = new Banco();
	        Usuario usuario = banco.existeUsuario(login,senha);
	        
	        if(usuario != null) {
	        	System.out.println("usuario existe.");
	        	return "redirect:entrada?acao=ListaEmpresas";
	        } else {
	        	System.out.println("usuario não existe.");
	        	return "redirect:entrada?acao=LoginForm";
	        }

	    }
}
