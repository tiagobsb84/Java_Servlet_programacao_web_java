package br.com.tiago.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
}
