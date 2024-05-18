package br.com.senaisp.bauru.rhuan.licao01;

public class EstudanteTester {

	public static void main(String[] args) {
		//criando um estudante
		Estudante est01 = new Estudante();
		//atribuindo valor
		est01.setNome("Rhuan");
		est01.setId(1);
		est01.setMedia(5.5f);
		//mostrando valor
		if("Rhuan".equals ("Roberto")) {}
		System.out.println("Nome"+ est01.getNome());
		System.out.println("Documento: "+ est01.getDocumento());
		//obtendo o objeto como representaçao textual
		System.out.println(est01.toString());
		Estudante est02 = new Estudante(2,"Roberto","123456789", 9.6f, 1600.00, true);
		for(int i =0; i< 2; i++) {
		System.out.println("-----------------------------");
		System.out.println("Estduante 2");
		System.out.println(est02.toString());
		
	}
	}

}
