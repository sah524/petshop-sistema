package br.com.petshop;

public class Servico {
	
	// ATRIBUTOS
    private TipoServico tipoServico;
    private Animais animal;
    private double preco;

    
    // CONSTRUTOR
    public Servico(TipoServico tipoServico, Animais animal) {
        this.tipoServico = tipoServico;
        this.animal = animal;
        this.preco = calcularPreco();
    }

    //DEFININDO OS SERVIÇOS 
    public enum TipoServico {
        BANHO, TOSA, CONSULTA
    }

    
    // MÉTODO QUE DEFINE O PREÇO DE ACORDO COM CADA ANIMAL
    private double calcularPreco() {
        double base = 0;

        if (animal instanceof Cachorro) {
            switch (tipoServico) {
                case BANHO: base = 40; break;
                case TOSA: base = 50; break;
                case CONSULTA: base = 80; break;
            }
        } else if (animal instanceof Passarinho) {
            switch (tipoServico) {
                case BANHO: base = 20; break;
                case TOSA: base = 30; break;
                case CONSULTA: base = 50; break;
            }
        } else if (animal instanceof Hamster) {
            switch (tipoServico) {
                case BANHO: base = 15; break;
                case TOSA: base = 25; break;
                case CONSULTA: base = 40; break;
            }
        }
        return base;
    }

    // MÉTODO PARA MOSTRA OS DETALHES DO SERVIÇO
    public void exibirDetalhes() {
        System.out.println("Serviço: " + tipoServico);
        System.out.println("Animal: " + animal.getClass().getSimpleName());
        System.out.println("Preço: R$ " + preco);
    }
}
