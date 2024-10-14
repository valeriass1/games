package br.com.fiap.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "GAMES_SEQ")
    @SequenceGenerator(
            name = "GAMES_SEQ",
            sequenceName = "GAMES_SEQ",
            allocationSize = 1)

    private Long id;
    private String titulo;

    @Column(name = "dt_lancamento")
    private LocalDate dataLancamento;
    private Double valor;
    private String produtora;
    private Boolean finalizado;
    private String categoria;

    public Game() {
    }

    public Game(Long id, String titulo, LocalDate dataLancamento, Double valor, String produtora, Boolean finalizado, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.valor = valor;
        this.produtora = produtora;
        this.finalizado = finalizado;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
