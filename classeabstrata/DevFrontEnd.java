package br.com.vainaweb.backendt3.classeabstrata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DevFrontEnd extends Colaborador {

	private List<String> frameworksFrontend;
	
	
	public DevFrontEnd() {
		super();
	}


	public DevFrontEnd(String nome, String cpf, int numeroMatricula, String genero, LocalDate dataContratacao, double fgts, double decimoTerceiro, String modeloContratacao, double salario, boolean isAtivo, Senioridade senioridade, List<String> frameworksFrontend) {
		super(nome, cpf, numeroMatricula, genero, dataContratacao, fgts, decimoTerceiro, modeloContratacao, salario, isAtivo, senioridade);
		this.frameworksFrontend = frameworksFrontend;
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.2);
	}

	public void desenvolver() {
		System.out.println("Desenvolvendo funcionalidades no frontend.");
	}

	public void criarInterfaceUsuario() {
		System.out.println("Criando a interface do usuário (UI).");
	}

	public void otimizarDesempenho() {
		System.out.println("Otimizando o desempenho do frontend.");
	}

}
