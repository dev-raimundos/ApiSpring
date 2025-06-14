package io.github.springweb.apispring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// POJO -> Plain Old Java Object

@Entity
// Nenhuma dessas annotation são obrigatórias quando o nome da coluna ou tabela é igual no Model.
@Table(name = "produto")
public class Produto {
    /* OBS:
     * É possível usar essa técnica pra casos onde a coluna tem
     * um nome diferente do Model.
     */
    //@Column(name = "Outro nome para a coluna")
    @Id
    @Column
    private String id;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private Double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id'" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
