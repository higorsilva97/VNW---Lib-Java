package br.com.vainaweb.backendt3.classeabstrata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Designer extends Colaborador{

	private List<String> ferramentasDesign;


	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Designer(String nome, String cpf, int numeroMatricula, String genero, LocalDate dataContratacao, double fgts, double decimoTerceiro, String modeloContratacao, double salario, boolean isAtivo, List<String> ferramentasDesign, Senioridade senioridade) {
		super(nome, cpf, numeroMatricula, genero, dataContratacao, fgts, decimoTerceiro, modeloContratacao, salario, isAtivo, senioridade);
		this.ferramentasDesign = ferramentasDesign;
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.20);
	}



	public void criarLayout() {
		System.out.println("Criando layouts e mockups.");
	}

	public void utilizarFerramentasDesign() {
		System.out.println("Utilizando ferramentas de design, como Photoshop, Sketch, Figma, etc.");
	}


}
