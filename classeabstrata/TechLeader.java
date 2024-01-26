package br.com.vainaweb.backendt3.classeabstrata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TechLeader extends Colaborador {

	private List<String> linguagensDominadas;
	private List<String> frameworksDominados;
	private List<String> equipesLideradas;
	
	public TechLeader() {
		super();

		// TODO Auto-generated constructor stub
	}

	public TechLeader(String nome, String cpf, int numeroMatricula, String genero, LocalDate dataContratacao, double fgts, double decimoTerceiro, String modeloContratacao, double salario, boolean isAtivo, Senioridade senioridade, List<String> linguagensDominadas, List<String> frameworksDominados, List<String> equipesLideradas) {
		super(nome, cpf, numeroMatricula, genero, dataContratacao, fgts, decimoTerceiro, modeloContratacao, salario, isAtivo, senioridade);
		this.linguagensDominadas = linguagensDominadas;
		this.frameworksDominados = frameworksDominados;
		this.equipesLideradas = equipesLideradas;
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.8);
	}

	public void liderarEquipe() {
		System.out.println("Liderando a equipe de desenvolvimento.");
	}

	public void tomarDecisoesEstrategicas() {
		System.out.println("Tomando decisões estratégicas para o projeto.");
	}
}
