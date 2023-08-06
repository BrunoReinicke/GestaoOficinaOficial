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
public class Carro implements Serializable {

    private Integer id;
    private String nome;
    private Integer ano;
    private Cliente dono;
    private String placa;
    private String cidade;
    private String uf;
    private String pais;
    private String marca;

    public Carro() {
    }

    public Carro(Integer id, String nome, Integer ano, Cliente dono, String placa, String cidade, String uf, String pais, String marca) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.dono = dono;
        this.placa = placa;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
        this.marca = marca;
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
    
    @ManyToOne
    @JoinColumn(name = "idCliente")
    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }  

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", nome=" + nome + ", ano=" + ano + ", dono=" + dono.toString() + 
               ", placa=" + placa + ", cidade=" + cidade + ", uf=" + uf + ", pais=" + pais + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}