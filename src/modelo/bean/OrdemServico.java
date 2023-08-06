/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 *
 * @author bruno
 */
@Entity
@Table(indexes = {
    @Index(name = "multIndex", columnList = "id, numero")
})
public class OrdemServico implements Serializable {
    
    private Integer id;
    private Carro carro;
    private Peca peca;
    private Integer numero;
    private Integer status;
    private Date dtAbertura;
    private Date dtEncerramento;
    private Date prazoEntrega;
    private boolean pecaTrocada;
    private Cliente cliente;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "idCarro")
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @OneToOne
    @JoinColumn(name = "idPeca")
    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDtEncerramento() {
        return dtEncerramento;
    }

    public void setDtEncerramento(Date dtEncerramento) {
        this.dtEncerramento = dtEncerramento;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(Date prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public boolean isPecaTrocada() {
        return pecaTrocada;
    }

    public void setPecaTrocada(boolean pecaTrocada) {
        this.pecaTrocada = pecaTrocada;
    }

    @ManyToOne
    @JoinColumn(name = "idCliente")
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "id=" + id + ", carro=" + carro + ", peca=" + peca + ", numero=" + numero + ", status=" + status + ", dtAbertura=" + dtAbertura + ", dtEncerramento=" + dtEncerramento + ", prazoEntrega=" + prazoEntrega + ", pecaTrocada=" + pecaTrocada + ", cliente=" + cliente + '}';
    }    
}