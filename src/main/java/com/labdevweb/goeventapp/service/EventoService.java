package com.labdevweb.goeventapp.service;

import com.labdevweb.goeventapp.domain.Evento;
import com.labdevweb.goeventapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> findAll() {
        System.err.println("BUSCANDO NO BANCO DE DADOS...");
        return eventoRepository.findAll();}
}
