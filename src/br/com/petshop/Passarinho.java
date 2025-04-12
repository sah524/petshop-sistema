package br.com.petshop;

public class Passarinho extends Animais {
	
    //ATRIBUTOS
    private boolean asas;
    private int penas;
    private String bico;

    // CONSTRUTOR
    public Passarinho(String cor, String raca, int idade, boolean asas, int penas, String bico) {
        super(cor, raca, idade);
        this.asas = asas;
        this.penas = penas;
        this.bico = bico;
    }

    @Override
    public void Som() {
        System.out.println("Piu piu...");
        super.Som();
    }

    // INÍCIO GET E SET
    public boolean isAsas() {
        return asas;
    }

    // RESTRIÇÃO
    public void setAsas(boolean asas) {
        if (asas) {
            this.asas = true;
            System.out.println("Este passarinho pode voar!");
        } else {
            this.asas = false;
            System.out.println("Este passarinho não pode voar.");
        }
    }

    public int getPenas() {
        return penas;
    }

    public void setPenas(int penas) {
        this.penas = penas;
    }

    public String getBico() {
        return bico;
    }

    public void setBico(String bico) {
        this.bico = bico;
    }
    // FIM GET E SET
}
