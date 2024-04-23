package com.labdevweb.goeventapp.repository;

import com.labdevweb.goeventapp.domain.Cliente;
import com.labdevweb.goeventapp.domain.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

    Optional<Compra> findById(Long id);
}
