package com.mundoaquarismods.MundoAquarismoDS.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tb_pais")
public class Pais implements Serializable {

    public Pais() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nome;
    private String nome_pt;
    private String sigla;
    private Integer bacen;

    public Pais(long id, String nome, String nome_pt, String sigla, Integer bacen) {
        this.id = id;
        this.nome = nome;
        this.nome_pt = nome_pt;
        this.sigla = sigla;
        this.bacen = bacen;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_pt() {
        return nome_pt;
    }

    public void setNome_pt(String nome_pt) {
        this.nome_pt = nome_pt;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getBacen() {
        return bacen;
    }

    public void setBacen(Integer bacen) {
        this.bacen = bacen;
    }



//    public List<Pais> getPais() {
//        return pais;
//    }
//
//    public void setPais(List<Pais> pais) {
//        this.pais = pais;
//    }


}
