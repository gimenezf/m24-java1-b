package br.com.senaisp.bauru.rhuan.licao01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		//Mostrando a mensagem para o usuario
		System.out.println("Digite o seu nome completo:");
		nome = scn.nextLine();
		//separando nome do sobrenome
		String primeiroNome = nome.substring(0,(nome+" ").indexOf(" "));
		System.out.println(primeiroNome);
		String lastName = nome.substring(nome.lastIndexOf(" ")+1);
		System.out.println(lastName);
		//fechando Scanner
		scn.close();
	}

}
