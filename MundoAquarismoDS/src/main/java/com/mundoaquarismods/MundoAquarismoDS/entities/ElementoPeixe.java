package com.mundoaquarismods.MundoAquarismoDS.entities;

import com.mundoaquarismods.MundoAquarismoDS.Enums.Alimentacao;
import com.mundoaquarismods.MundoAquarismoDS.Enums.Continente;
import com.mundoaquarismods.MundoAquarismoDS.Enums.Especie;
import com.mundoaquarismods.MundoAquarismoDS.Enums.TipoAgua;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_peixe")
public class ElementoPeixe implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idPeixe;
    private String nomePeixe;
    private Especie especie;
    private String nomeCientifico;
    private long tamanhoAquario;
    private Continente continente;
    //private String regiao;
    private TipoAgua tipoagua;
    private Alimentacao alimentacao;
    private String informacao;
    private double tamanhoPeixe;
    private String imagem;



    @ManyToOne
    @JoinColumn(name="pais_id")
    private Pais pais;







    public ElementoPeixe() {

    }




    public ElementoPeixe(long idPeixe, String nomePeixe, Especie especie, TipoAgua tipoagua, Alimentacao alimentacao, String informacao, Continente continente, Pais pais, String cidade,long tamanhoAquario, double tamanhoPeixe, String imagem) {
        this.idPeixe = idPeixe;
        this.nomePeixe = nomePeixe;
        this.especie = especie;
        this.tipoagua = tipoagua;
        this.alimentacao = alimentacao;
        this.informacao = informacao;
        this.continente = continente;
        this.pais = pais;
//        this.cidade = cidade;
        this.tamanhoAquario = tamanhoAquario;
        this.tamanhoPeixe = tamanhoPeixe;
        this.imagem = imagem;
    }

    public long getIdPeixe() {
        return idPeixe;
    }

    public void setIdPeixe(long idPeixe) {
        this.idPeixe = idPeixe;
    }

    public String getNomePeixe() {
        return nomePeixe;
    }

    public void setNomePeixe(String nomePeixe) {
        this.nomePeixe  = nomePeixe;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

//    public String getRegiao() {
//        return regiao;
//    }
//
//    public void setRegiao(String regiao) {
//        this.regiao = regiao;
//    }

    public TipoAgua getTipoagua() {
        return tipoagua;
    }

    public void setTipoagua(TipoAgua tipoagua) {
        this.tipoagua = tipoagua;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public long getTamanhoAquario() {
        return tamanhoAquario;
    }

    public void setTamanhoAquario(long tamanhoAquario) {
        this.tamanhoAquario = tamanhoAquario;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

//    public String getPais() {
//        return pais;
//    }
//
//    public void setPais(String pais) {
//        this.pais = pais;
//    }
//
//    public String getCidade() {
//        return cidade;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }

    public double getTamanhoPeixe() {
        return tamanhoPeixe;
    }

    public void setTamanhoPeixe(double tamanhoPeixe) {
        this.tamanhoPeixe = tamanhoPeixe;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }


}
