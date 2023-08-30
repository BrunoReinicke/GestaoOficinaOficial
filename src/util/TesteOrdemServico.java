/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.OrdemServFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Carro;
import modelo.bean.Cliente;
import modelo.bean.Fornecedor;
import modelo.bean.OrdemServico;
import modelo.bean.Peca;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TesteOrdemServico {
 
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        OrdemServico os = new OrdemServico();
        os.setCarro(new Carro(2, "C4", 2008, 
            new Cliente(1, "Cadavér1khx", 27, 'M', "***.***.***-**", "*.***.***", 
                formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
                new Usuario(5, "bruno", "123", "Comum")),
            "$UL-X11Y", "Joinville", "SC", "Brasil", "Citroen"));
        os.setPeca(new Peca(1, "Carburador", 2021, 1000, "random", 
            new Fornecedor(1, "Random", 42, 'M', "***.***.***-**", "*.***.***",
                formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"),
            "Média", 5));
        os.setStatus("Em aberto");
        os.setDtAbertura(formato.parse("24/01/2022"));
        os.setPrazoEntrega(formato.parse("28/01/2022"));
        os.setTrocPeca("Sim");
        os.setCliente(new Cliente(1, "Cadavér1khx", 27, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", new Usuario(5, "bruno", "123", "Comum")));
        new OrdemServFactory().salvar(os, "OrdemServicoPU");
          
        // Consulta
    /*    List<OrdemServico> lstOS = (List<OrdemServico>) new OrdemServFactory().consultar(1);
        System.out.println("Consulta com filtro:");
        lstOS.forEach((ordServ) -> {
            System.out.println(ordServ.toString());
        });
        */
    }
}