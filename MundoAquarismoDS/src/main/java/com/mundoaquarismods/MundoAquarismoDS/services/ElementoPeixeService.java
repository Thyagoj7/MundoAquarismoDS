package com.mundoaquarismods.MundoAquarismoDS.services;

import com.mundoaquarismods.MundoAquarismoDS.dto.ElementoPeixeDTO;
import com.mundoaquarismods.MundoAquarismoDS.entities.ElementoPeixe;
import com.mundoaquarismods.MundoAquarismoDS.repository.ElementoPeixeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//E agora vamos criar o service que é o cara que vai buscar os filmes é o cara da camada serviço
//        Ele vai ficar assim assim buscamos um page que são engtities e sã passadas para DTO.
@Service
public class ElementoPeixeService {

    @Autowired
    private ElementoPeixeRepository repository;

    @Transactional(readOnly = true)
    public Page<ElementoPeixeDTO> findAll(Pageable pageable) {
        Page<ElementoPeixe> result = repository.findAll(pageable);
        Page<ElementoPeixeDTO> page = result.map(x -> new ElementoPeixeDTO(x));
        return page;
    }

    //    para buscar apenas um elemento
    @Transactional(readOnly = true)
    public ElementoPeixeDTO findById(Long idPeixe) {

        ElementoPeixe result = repository.findById(idPeixe).get();
        ElementoPeixeDTO dto = new ElementoPeixeDTO(result);

        return dto;
    }

}
