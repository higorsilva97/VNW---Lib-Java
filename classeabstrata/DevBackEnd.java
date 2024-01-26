package br.com.vainaweb.backendt3.classeabstrata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DevBackEnd extends Colaborador {

	private List<String> linguagemBackend;
	private List<String> frameworksBackend;

	public DevBackEnd() {
		super();

	}

	public DevBackEnd(String nome, String cpf, int numeroMatricula, String genero, LocalDate dataContratacao, double fgts, double decimoTerceiro, String modeloContratacao, double salario, boolean isAtivo, Senioridade senioridade, List<String> linguagemBackend, List<String> frameworksBackend) {
		super(nome, cpf, numeroMatricula, genero, dataContratacao, fgts, decimoTerceiro, modeloContratacao, salario, isAtivo, senioridade);
		this.linguagemBackend = linguagemBackend;
		this.frameworksBackend = frameworksBackend;
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.2);
	}



	public void desenvolver() {
		System.out.println("Desenvolvendo funcionalidades no backend.");
	}

	public void realizarCodeReview() {
		System.out.println("Realizando revisão de código no backend.");
	}

}
