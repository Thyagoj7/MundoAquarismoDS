package com.mundoaquarismods.MundoAquarismoDS.repository;

import com.mundoaquarismods.MundoAquarismoDS.entities.ElementoPeixe;

import org.springframework.data.jpa.repository.JpaRepository;

//é um objeto da camada de acesso a dados , ele que vai fazer as operações do banco como deletar buscar alterar...
//        ele que vai acessar obanco mesmo com operações.

public interface ElementoPeixeRepository extends JpaRepository<ElementoPeixe, Long> {

}
