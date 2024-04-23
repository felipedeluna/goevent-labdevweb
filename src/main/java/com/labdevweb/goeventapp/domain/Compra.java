package com.labdevweb.goeventapp.domain;

import com.labdevweb.goeventapp.domain.enums.StatusCompra;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
public class Compra implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "O campo da compra referente ao cliente não pode ser vazio.")
    @ManyToOne
    @JoinColumn(nullable = false)
    private Cliente cliente;
    @NotNull(message = "O campo da compra referente ao evento não pode ser vazio.")
    @ManyToOne
    @JoinColumn(nullable = false)
    private Evento evento;
    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime dataHoraRequisicao;

    @NotNull(message = "O status da compra não pode ser vazio.")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusCompra statusCompra;

}
