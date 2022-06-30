package br.com.tiago.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse reponse)
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		sessao.invalidate();
		return "Redirect:entrada?acao=LoginForm";
	}

}
