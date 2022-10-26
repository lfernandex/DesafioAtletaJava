package DesafioAtletaJava;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, qteM = 0, qteF = 0;
		double alt, maiorAlt =0, altF =0, AltMedF = 0;
		double peso = 0, somaPeso = 0, pesoMedio = 0, pctgm = 0;
		String nome, maisAlt = null;
		char sexo = 0;
		
		
		System.out.println("Qual a quan tidae de atletas? ");
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			sc.nextLine();
			System.out.println("Digite os dados do atleta numero " + i);
			System.out.println("Nome: ");
			nome = sc.nextLine();
			
			System.out.println("Sexo: "); 
			sexo = sc.next().charAt(0);
			   	while (sexo != 'F' && sexo != 'M') {
			   		System.out.println("Valor invalido! Por favor, digite 'F' ou 'M': ");
			   		sexo = sc.next().charAt(0);
			   	}
			  
			System.out.println("Altura: ");
			alt = sc.nextDouble();
				while (alt <= 0) {
					System.out.println("Valor invalido! Por favor, digite um valor valido:");
					alt = sc.nextDouble();
				}
				if (maiorAlt < alt) {
					maiorAlt = alt;
					maisAlt = nome;
				}							
				if (sexo == 'M') {
					qteM =  qteM + 1;					
				}
				if (sexo =='F'){
					qteF = qteF + 1;
					altF = altF + alt;
				}
						
			System.out.println("Peso: ");
			peso = sc.nextDouble();
				while(peso <= 0) {
					System.out.println("Valor invalido! Por favor, digite um valor valido:");
					peso = sc.nextDouble();
				}
			somaPeso = somaPeso + peso;
		}
		
		pesoMedio = somaPeso / N;
		pctgm = (qteM * 100) / N;
		
		if (altF > 0) {
		AltMedF = altF / qteF;
		}
		
		System.out.println();
		System.out.println("Relatório");
		System.out.println();
		System.out.printf("Peso medio dos atletas: %.2f%n", pesoMedio);
		System.out.println("Atleta mais alto: " + maisAlt);
		System.out.printf("Porcentagem de homens: %.1f%%%n", pctgm);
		
		if(sexo == 'F') {
		System.out.println("Altura media das mulheres: " + AltMedF);
		} 
		else {
			System.out.println("Não há mulheres cadastradas");
		}
		
		sc.close();
		
	}

}
