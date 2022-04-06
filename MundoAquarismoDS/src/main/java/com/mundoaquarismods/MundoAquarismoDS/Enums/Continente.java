package com.mundoaquarismods.MundoAquarismoDS.Enums;

public enum Continente {
    AMERICA("Ametica"),
    EUROPA("Europa"),
    ASIA("Asia"),
    AFRICA("Africa"),
    OCEANIA("Oceania"),
    ANTARTIDA("Antartida");

    private String descricao;

    Continente(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
