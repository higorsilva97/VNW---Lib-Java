package br.com.vainaweb.backendt3.classeabstrata;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private int numeroMatricula;

	private String genero;

	private LocalDate dataContratacao;

	private double fgts;

	private double decimoTerceiro;

	private String modeloContratacao;
	private double salario;
	private boolean isAtivo = true;

	private Senioridade senioridade;


	
	// Construtores
	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, int numeroMatricula, String genero, LocalDate dataContratacao, double fgts, double decimoTerceiro, String modeloContratacao, double salario, boolean isAtivo, Senioridade senioridade) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroMatricula = numeroMatricula;
		this.genero = genero;
		this.dataContratacao = dataContratacao;
		this.fgts = fgts;
		this.decimoTerceiro = decimoTerceiro;
		this.modeloContratacao = modeloContratacao;
		this.salario = salario;
		this.isAtivo = isAtivo;
		this.senioridade = senioridade;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public double getFgts() {
		return fgts;
	}

	public void setFgts(double fgts) {
		this.fgts = fgts;
	}

	public double getDecimoTerceiro() {
		return decimoTerceiro;
	}

	public void setDecimoTerceiro(double decimoTerceiro) {
		this.decimoTerceiro = decimoTerceiro;
	}

	public String getModeloContratacao() {
		return modeloContratacao;
	}

	public void setModeloContratacao(String modeloContratacao) {
		this.modeloContratacao = modeloContratacao;
	}

	public double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return isAtivo;
	}


	public Senioridade getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(Senioridade senioridade) {
		this.senioridade = senioridade;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	// Métodos

	public String visualizar() {
		return "[Colaborador " + this.nome + ", do CPF: " + this.cpf + " ]" + "\nSalario: " + this.salario
				+ "\nStatus: " + (this.isAtivo? "Vinculado" : "Sem vinculo") + "\nDécimo Terceiro: "
				+ this.decimoTerceiro + "\nModelo de contratação: "+this.modeloContratacao
				+ "\nFGTS: "+this.fgts	+ "\nData contratação: "+this.dataContratacao + "\nGenero:: "+this.genero
				+ "\nSenioridade:: "+this.senioridade;

	}



	public abstract void aumentarSalario();

	public void calcularDecimoTerceito(){
		if ("CLT".equals(this.modeloContratacao)) {
			setDecimoTerceiro(getSalario());
		}
	}

	public void calcularFGTS(){
		setFgts(this.salario * 0.08);
	}

	public double calcularValeTransporte() {
		return this.salario * 0.06;
	}

	public double  calcularValeRefeicao() {
		return this.salario * 0.1;
	}

	
	public void demitir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tem certeza que deseja desvincular " + this.nome);
		Character resposta = sc.next().toLowerCase().charAt(0);
		if(resposta.equals('s')) {
			System.out.println("Você está demitido, promovido a usuário");
			this.isAtivo = false;
			salario = 0.0;
		}
		
		sc.close();
	}



}
