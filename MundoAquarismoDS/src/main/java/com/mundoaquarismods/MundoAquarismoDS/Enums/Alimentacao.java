package com.mundoaquarismods.MundoAquarismoDS.Enums;

public enum Alimentacao {
    HERBIVORO("HErbivoro"),
    CARNIVORO("Carnivoro"),
    ONIVORO("Onivoro");

    private String descricao;

    Alimentacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
