package br.com.petshop;

import br.com.petshop.Servico.TipoServico;

public class PetShop {
	
    // MÉTODO QUE APLICA SERVIÇO DIRETAMENTE A UM ANIMAL
	
    public void aplicarServico(TipoServico tipoServico, Animais animal) {
        Servico servico = new Servico(tipoServico, animal);
        servico.exibirDetalhes();
    }
}
