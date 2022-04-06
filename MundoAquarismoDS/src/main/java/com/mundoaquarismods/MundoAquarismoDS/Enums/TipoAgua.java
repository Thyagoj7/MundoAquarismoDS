package com.mundoaquarismods.MundoAquarismoDS.Enums;

public enum TipoAgua {
    ACIDA("Acida"),
    NEUTRA("Neutra"),
    ALCALINA("Alcalina");

    private String descricao;

    TipoAgua(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
