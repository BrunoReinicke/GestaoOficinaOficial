/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

/**
 *
 * @author bruno
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Peca implements Serializable {
   
    private Integer id;
    private String nome;
    private Integer ano;
    private double preco;
    private String marca;
    private Fornecedor forn;
    private String categoria;
    private Integer qtde;
    
    public Peca() {
    }

    public Peca(Integer id, String nome, Integer ano, double preco, String marca, Fornecedor forn, String categoria, Integer qtde) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
        this.marca = marca;
        this.forn = forn;
        this.categoria = categoria;
        this.qtde = qtde;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @ManyToOne
    @JoinColumn(name = "idFornecedor")
    public Fornecedor getForn() {
        return forn;
    }

    public void setForn(Fornecedor forn) {
        this.forn = forn;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Peca{" + "id=" + id + ", nome=" + nome + ", ano=" + ano + ", preco=" + preco + 
               ", marca=" + marca + ", forn=" + forn.toString() + ", categoria=" + categoria + 
               ", qtde=" + qtde + '}';
    }
}