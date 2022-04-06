package com.mundoaquarismods.MundoAquarismoDS.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.mundoaquarismods.MundoAquarismoDS.Enums.Alimentacao;
import com.mundoaquarismods.MundoAquarismoDS.Enums.Continente;
import com.mundoaquarismods.MundoAquarismoDS.Enums.Especie;
import com.mundoaquarismods.MundoAquarismoDS.Enums.TipoAgua;
import com.mundoaquarismods.MundoAquarismoDS.entities.ElementoPeixe;
import com.mundoaquarismods.MundoAquarismoDS.entities.Pais;

import java.io.Serializable;

//E agora vamos criar a DTO que é um objeto simples para transferencia de dados entre o controlador e a camada de serviço

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ElementoPeixeDTO {
    private long idPeixe;
    private String nomePeixe;
    private Especie especie;
    private String nomeCientifico;
    private long tamanhoAquario;
    private Continente continente;
    private TipoAgua tipoagua;
    private Alimentacao alimentacao;
    private String informacao;
    private double tamanhoPeixe;
    private Pais pais;
    private String imagem;

    public ElementoPeixeDTO(){

    }

    public ElementoPeixeDTO(long idPeixe, String nomePeixe, Especie especie, String nomeCientifico, long tamanhoAquario, Continente continente, TipoAgua tipoagua, Alimentacao alimentacao, String informacao, double tamanhoPeixe, Pais pais, String imagem) {
        this.idPeixe = idPeixe;
        this.nomePeixe = nomePeixe;
        this.especie = especie;
        this.nomeCientifico = nomeCientifico;
        this.tamanhoAquario = tamanhoAquario;
        this.continente = continente;
        this.tipoagua = tipoagua;
        this.alimentacao = alimentacao;
        this.informacao = informacao;
        this.tamanhoPeixe = tamanhoPeixe;
        this.pais = pais;
        this.imagem = imagem;
    }

    public ElementoPeixeDTO(ElementoPeixe elementoPeixe){
        this.idPeixe = elementoPeixe.getIdPeixe();
        this.nomePeixe = elementoPeixe.getNomePeixe();
        this.especie = elementoPeixe.getEspecie();
        this.nomeCientifico = elementoPeixe.getNomeCientifico();
        this.tamanhoAquario = elementoPeixe.getTamanhoAquario();
        this.continente = elementoPeixe.getContinente();
        this.tipoagua = elementoPeixe.getTipoagua();
        this.alimentacao = elementoPeixe.getAlimentacao();
        this.informacao = elementoPeixe.getInformacao();
        this.tamanhoPeixe = elementoPeixe.getTamanhoPeixe();
        this.pais = elementoPeixe.getPais();
        this.imagem = elementoPeixe.getImagem();
    }
}
