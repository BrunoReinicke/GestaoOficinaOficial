/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.ClienteFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import modelo.bean.Cliente;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class TesteCliente {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Cadastro
        Cliente cli = new Cliente();
        cli.setNome("Bruno Luiz Reinicke");
        cli.setIdade(27);
        cli.setSexo("Masculino");
        cli.setCpf("***.***.***-**");
        cli.setRg("*.***.***");
        cli.setDataNasc(formato.parse("14/02/1996"));
        cli.setCidade("Pomerode");
        cli.setUf("SC");
        cli.setPais("Brasil");
        cli.setUsu(new Usuario(5, "bruno", "123", "Comum"));
        new ClienteFactory().salvar(cli);
        
        // Consulta
       /* List<Cliente> lstClie2 = (List<Cliente>) new ClienteFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstClie2.forEach((clie2) -> {
            System.out.println(clie2.toString());
        });
        */   
    }
}