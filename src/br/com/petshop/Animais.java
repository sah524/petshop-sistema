package br.com.petshop;

public class Animais {

	//Atributos
	private String cor;
	private String raça; 
	private int idade;
	
	//Construtor
	public Animais(String cor, String raça, int idade) {
		super();
		this.cor = cor;
		this.raça = raça;
		this.idade = idade;
	}
	
	//INÍCIO GET E SET 
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
	    if (idade <= 300 && idade >= 0) { 
	        this.idade = idade;
	    } else {
	        System.out.println("Idade inválida. A idade deve ser entre 0 e 300.");
	    }
	}
	//FIM GET E SET

	//MÉTODO
	
	public void Som() {
		System.out.println("Animal emitindo som: ");
	}
	
	
	
}
