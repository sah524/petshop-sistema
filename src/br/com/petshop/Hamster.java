package br.com.petshop;

public class Hamster extends Animais {
	
	// ATRIBUTOS
    private boolean bochechas;
    private String bigode;
    private String rabo;

    // CONSTRUTOR
    public Hamster(String cor, String raça, int idade, boolean bochechas, String bigode, String rabo) {
        super(cor, raça, idade);
        this.bochechas = bochechas;
        this.bigode = bigode;
        this.rabo = rabo;
    }

    // INÍCIO GET E SET
    public boolean isBochechas() {
        return bochechas;
    }

    // RESTRIÇÃO
    public void setBochechas(boolean bochechas) {
        if (!bochechas) {
            System.out.println("Não é permitido hamster sem bochechas cheias.");
        } else {
            this.bochechas = bochechas;
            System.out.println("Bochechas cheias!");
        }
    }
    
    public String getBigode() {
        return bigode;
    }

    public void setBigode(String bigode) {
        this.bigode = bigode;
    }

    public String getRabo() {
        return rabo;
    }

    public void setRabo(String rabo) {
        this.rabo = rabo;
    }
    
    // FIM GET E SET
    
    @Override
    public void Som() {
        System.out.println("Chii chii...");
        super.Som();
    }
    
 

}
