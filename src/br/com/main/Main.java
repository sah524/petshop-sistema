package br.com.main;

import br.com.petshop.*;
import br.com.petshop.Servico.TipoServico;

public class Main {
    public static void main(String[] args) {
        PetShop petshop = new PetShop();

        //INSTÂNCIAS
        Cachorro objdog = new Cachorro("Preto", "Labrador", 5, "Grande", "Curto", 4);
        Passarinho objbird = new Passarinho("Amarelo", "Canário", 2, true, 150, "Curto");
        Hamster objhamster = new Hamster("Marrom", "Sírio", 1, true, "Fino", "Curto");

        petshop.aplicarServico(TipoServico.BANHO, objdog);
        petshop.aplicarServico(TipoServico.TOSA, objbird);
        petshop.aplicarServico(TipoServico.CONSULTA, objhamster);

        objbird.setAsas(false); 
        objhamster.setBochechas(false); 
        objhamster.setBochechas(true);
    }
}
