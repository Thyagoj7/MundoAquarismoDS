package com.mundoaquarismods.MundoAquarismoDS.Enums;

public enum Especie {
    Astronotusocellatus("Astronotus ocellatus"),
    Ciclideo("Ciclideo");

    private String descricao;

    Especie(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
