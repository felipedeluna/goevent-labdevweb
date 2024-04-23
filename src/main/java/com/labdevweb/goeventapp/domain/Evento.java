package com.labdevweb.goeventapp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "eventos")
public class Evento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do evento não pode ser vazio.")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotBlank(message = "O nome do lugar do evento não pode ser vazio.")
    @Column(nullable = false, length = 100)
    private String nomeLugar;

    @NotBlank(message = "O nome artista do evento não pode ser vazio.")
    @Column(nullable = false)
    private String artista;

    @NotBlank(message = "A data do evento não pode ser vazia.")
    @Column(nullable = false)
    private LocalDate data;

    @NotBlank(message = "O horário do evento não pode ser vazia.")
    @Column(nullable = false)
    private LocalTime hora;

    @NotBlank(message = "A categoria do evento não pode ser vazia.")
    @Column(nullable = false)
    private String categoria;

    @Column(length = 100)
    private String logradouro;

    @Column
    private String numero;

    @Column(length = 100)
    private String cidade;

    @Column(length = 2)
    private String uf;

    @Column(nullable = false)
    private Boolean habilitado;



    public Evento() {
        this.habilitado = true;
    }

    public Evento(Long id, String nome, String nomeLugar, String artista, LocalDate data, LocalTime hora, String categoria, String logradouro, String numero, String cidade, String uf, Boolean habilitado) {
        this.id = id;
        this.nome = nome;
        this.nomeLugar = nomeLugar;
        this.artista = artista;
        this.data = data;
        this.hora = hora;
        this.categoria = categoria;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.habilitado = habilitado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeLugar() {
        return nomeLugar;
    }

    public void setNomeLugar(String nomeLugar) {
        this.nomeLugar = nomeLugar;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(id, evento.id) && Objects.equals(nome, evento.nome) && Objects.equals(nomeLugar, evento.nomeLugar) && Objects.equals(artista, evento.artista) && Objects.equals(data, evento.data) && Objects.equals(hora, evento.hora) && Objects.equals(categoria, evento.categoria) && Objects.equals(logradouro, evento.logradouro) && Objects.equals(numero, evento.numero) && Objects.equals(cidade, evento.cidade) && Objects.equals(uf, evento.uf) && Objects.equals(habilitado, evento.habilitado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nomeLugar, artista, data, hora, categoria, logradouro, numero, cidade, uf, habilitado);
    }
}
