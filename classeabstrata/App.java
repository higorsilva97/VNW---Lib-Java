package br.com.vainaweb.backendt3.classeabstrata;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Colaborador devBackEndJunior = new DevBackEnd();
		Colaborador devFrontEndJunior = new DevFrontEnd();
		Colaborador designerJunior = new Designer();
		Colaborador techLead = new TechLeader();

		List<String> ferramentasDesign = Arrays.asList("Adobe Photoshop", "Sketch", "Figma");



		Colaborador designer  =  new Designer(
				"Nome do Designer",
				"123.456.789-00",
				123,
				"Masculino",
				LocalDate.now(),
				1000.0,
				0.0,
				"PJ",
				3000.0,
				true,
				ferramentasDesign,
				Senioridade.JUNIOR
		);



		System.out.println(designer.visualizar());

		designer.calcularDecimoTerceito();
		designer.calcularFGTS();

		System.out.println(designer.visualizar());

		((Designer) designer).criarLayout();





		/*System.out.println("-----------Antes------------------");
		System.out.println(devBackEndJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(devFrontEndJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(designerJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(techLead.visualizar());
		System.out.println();
		System.out.println("-----------Depois------------------");
		devBackEndJunior.aumentarSalario();
		devFrontEndJunior.aumentarSalario();
		designerJunior.aumentarSalario();
		techLead.aumentarSalario();
		devFrontEndJunior.aumentarSalario();*/
	
		
		/*System.out.println(devBackEndJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(devFrontEndJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(designerJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(techLead.visualizar());*/
	}

}
