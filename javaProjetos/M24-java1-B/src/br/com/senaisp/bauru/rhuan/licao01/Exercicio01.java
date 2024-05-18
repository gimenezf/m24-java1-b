package br.com.senaisp.bauru.rhuan.licao01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double galoes = 15;
		double litros = 0;
		double gal2lit = 3.785;
		//Solicitar a entrada do usuario
		System.out.println("Digite a quantidade de galoes");
		galoes = scn.nextDouble();
		scn.close();
		//Fazendo as contas
		litros = galoes * gal2lit;
		System.out.println(galoes + " galoes equivale a " + litros+ "litros");
		
	}
}
