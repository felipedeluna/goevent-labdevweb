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

    public List<Evento> listarEventos(String categoria) {
        // Se a categoria for null, retorna todos os eventos
        if (categoria == null) {
            return findAll();
        }
        // Caso contrário, filtra os eventos pela categoria
        return buscarEventosPorCategoria(categoria);
    }

    // Método para buscar eventos por categoria
    public List<Evento> buscarEventosPorCategoria(String categoria) {
        return eventoRepository.findByCategoria(categoria);
    }

    // Método para listar todas as categorias
    public List<Evento> listarCategorias() {
        return eventoRepository.findAll();
    }
}