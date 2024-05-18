package br.com.senaisp.bauru.rhuan.licao01;

public class Estudante {

	//campos ou fields ou variaveis de instancia
	private int id;
	private String nome;
	private String documento;
	private float media;
	private boolean fumante;
	private double bolsaEstudo;
	
	//constructors
	
	//constructors sem parametros
	public Estudante() {
		id = 0;
		nome = "sem nome";
		documento = "sem documento";
		media = 0.0f;
		fumante = false;
		bolsaEstudo = 0.0;
	}
	
	public Estudante(int id, String nome, String Documento, float media,
			double bolsa, boolean fum) {
		setId(id);
		setNome(nome);
		setDocumento(Documento);
		setMedia(media);
		setBolsaEstudo(bolsa);
		setFumante(fum);
	}

	//Getters e Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		//criando um erro de execucao
		if(nome.length() <2) {
			throw new RuntimeException("Nome deve ter pelo menos 2 caracteres");
		}
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	public double getBolsaEstudo() {
		return bolsaEstudo;
	}

	public void setBolsaEstudo(double bolsaEstudo) {
		this.bolsaEstudo = bolsaEstudo;
	}

	
	
	
	
	
	//Metodos
	@Override
	public String toString() {
		return 	"Id: "+getId()+"\n"+
				"nome: "+getNome()+"\n"+
				"Documento: " +getDocumento()+"\n"+
				"Media: "+getMedia()+"\n"+
				"Bolsa de Estudos: "+ getBolsaEstudo()+"\n"+
				"Fumante: "+ isFumante();
				
		
	}
	
	
}
