package com.labdevweb.goeventapp.repository;

import com.labdevweb.goeventapp.domain.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

    Optional<Evento> findByArtista(String artista);
    List<Evento> findByCategoria(String categoria);
}
