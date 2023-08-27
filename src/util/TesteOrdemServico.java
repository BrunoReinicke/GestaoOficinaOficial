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
            new Cliente(3, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
                formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", 
                new Usuario(3, "user", "pass", "C")),
            "$UL-X11Y", "Joinville", "SC", "Brasil", "Citroen"));
        os.setPeca(new Peca(6, "Radiador", 2021, 1000, "random", 
            new Fornecedor(3, "Random", 42, 'M', "***.***.***-**", "*.***.***",
                formato.parse("14/01/1980"), "Pomerode", "SC", "Brasil"),
            "Média"));
        os.setStatus(0);
        os.setDtAbertura(formato.parse("24/01/2022"));
        os.setPrazoEntrega(formato.parse("28/01/2022"));
        os.setPecaTrocada(false);
        os.setCliente(new Cliente(2, "Bruno", 25, 'M', "***.***.***-**", "*.***.***", 
            formato.parse("14/02/1996"), "Pomerode", "SC", "Brasil", new Usuario(3, "bruno", "12345", "C")));
        new OrdemServFactory().salvar(os);
          
        // Consulta
    /*    List<OrdemServico> lstOS = (List<OrdemServico>) new OrdemServFactory().consultar(1);
        System.out.println("Consulta com filtro:");
        lstOS.forEach((ordServ) -> {
            System.out.println(ordServ.toString());
        });
        
        // Exclusão
      //  new OrdemServFactory().excluir(4);*/
    }
}