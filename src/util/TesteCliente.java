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
      /*  Cliente cli = new Cliente();
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
        new ClienteFactory().salvar(cli);*/
        
        Cliente cli2 = new Cliente();
        cli2.setNome("Teste 123");
        cli2.setIdade(27);
        cli2.setSexo("Masculino");
        cli2.setCpf("***.***.***-**");
        cli2.setRg("*.***.***");
        cli2.setDataNasc(formato.parse("14/02/1996"));
        cli2.setCidade("Pomerode");
        cli2.setUf("SC");
        cli2.setPais("Brasil");
        cli2.setUsu(new Usuario(6, "adm", "adm", "Comum"));
        new ClienteFactory().salvar(cli2); 
    }
}