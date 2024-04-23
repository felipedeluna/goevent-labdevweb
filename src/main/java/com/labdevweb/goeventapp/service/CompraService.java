package com.labdevweb.goeventapp.service;

import com.labdevweb.goeventapp.domain.Compra;
import com.labdevweb.goeventapp.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public Compra findById(Long id) {
        Optional<Compra> compra = compraRepository.findById(id);
        if(compra.isPresent()){
            return compra.get();
        } else {
            return null;
        }
    };
}
