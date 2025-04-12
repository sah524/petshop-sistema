package br.com.petshop;

public class Cachorro extends Animais {

    // ATRIBUTOS
    private String focinho;
    private String rabo;
    private int numeroDePatas;  // Alterado para um atributo exclusivo de cachorros

    // CONSTRUTOR
    public Cachorro(String cor, String raça, int idade, String focinho, String rabo, int numeroDePatas) {
		super(cor, raça, idade);
		this.focinho = focinho;
		this.rabo = rabo;
		this.numeroDePatas = numeroDePatas;
	}


    // MÉTODO
    public void abanarRabo() {
        System.out.println("Abanando o rabo felizmente...");
    }

    
	@Override
    public void Som() {
        System.out.println("Au au au!");
        super.Som();
    }

	// INÍCIO GET E SET

    public String getFocinho() {
        return focinho;
    }

    public void setFocinho(String focinho) {
        this.focinho = focinho;
    }

    public String getRabo() {
        return rabo;
    }

    public void setRabo(String rabo) {
        this.rabo = rabo;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        if (numeroDePatas == 4) {
            this.numeroDePatas = numeroDePatas;
        } else {
            System.out.println("Valor inválido para número de patas! Um cachorro geralmente tem 4 patas.");
            this.numeroDePatas = 4; 
        }
    }
    
    //FIM GET E SET

}
