package br.com.tiago.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Google");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("YouTube");
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
}
