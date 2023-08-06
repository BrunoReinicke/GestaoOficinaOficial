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
       /* Cliente cli = new Cliente();
        cli.setNome("Cadavér1khx");
        cli.setIdade(27);
        cli.setSexo('M');
        cli.setCpf("***.***.***-**");
        cli.setRg("*.***.***");
        cli.setDataNasc(formato.parse("14/02/1996"));
        cli.setCidade("Pomerode");
        cli.setUf("SC");
        cli.setPais("Brasil");
        cli.setUsu(new Usuario(4, "Bruno Luiz Reinicke", "Cadavérikhx", 'C'));
        new ClienteFactory().salvar(cli);
        
        // Consulta
        List<Cliente> lstClie2 = (List<Cliente>) new ClienteFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstClie2.forEach((clie2) -> {
            System.out.println(clie2.toString());
        });
        
        // Alteração
        Cliente cli2 = new Cliente();
        cli2.setId(2);
        cli2.setNome("aaa");
        cli2.setIdade(29);
        cli2.setSexo('M');
        cli2.setCpf("***.***.***-**");
        cli2.setRg("*.***.***");
        cli2.setDataNasc(formato.parse("13/01/1993"));
        cli2.setCidade("AAA");
        cli2.setUf("bbb");
        cli2.setPais("Brasil");
        cli2.setUsu(new Usuario(2, "root", "1234", 'A'));
        new ClienteFactory().alterar(cli2);
        
        // Consulta
        List<Cliente> lstClie = (List<Cliente>) new ClienteFactory().consultar(2);
        System.out.println("Consulta com filtro:");
        lstClie.forEach((clie) -> {
            System.out.println(clie.toString());
        });  
     */   
        // Exclusão
        new ClienteFactory().excluir(4);
    }
}