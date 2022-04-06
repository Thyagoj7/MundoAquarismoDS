package com.mundoaquarismods.MundoAquarismoDS.controller;

import com.mundoaquarismods.MundoAquarismoDS.dto.ElementoPeixeDTO;
import com.mundoaquarismods.MundoAquarismoDS.services.ElementoPeixeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//
//objeto da camada de cima Controladores Rest/ e ele que vau pegar os endpoints /
//        e o endereço que pdoemos chamar do navegador e eel vai responder uma pagina de
@RestController
@RequestMapping(value = "/peixes")
public class ElementoPeixeController {

    @Autowired
    private ElementoPeixeService service;
    @GetMapping
    private Page<ElementoPeixeDTO> findAll(Pageable pageable){
        return service.findAll(pageable);
    }
//    endpoint para um unico peixe
    @GetMapping(value = "/{idPeixe}")
    private ElementoPeixeDTO findById(@PathVariable Long idPeixe) {

            return service.findById(idPeixe);


    }


}
