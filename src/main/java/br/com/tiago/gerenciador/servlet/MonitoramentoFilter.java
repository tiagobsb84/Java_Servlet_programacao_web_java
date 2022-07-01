package br.com.tiago.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MonitoramentoFilter");
		
		Long antes = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		String acao = request.getParameter("acao");
		
		Long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de execução da acao: " + acao + "->" + (depois - antes));
		
	}

}
