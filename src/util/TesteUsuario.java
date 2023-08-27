/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controle.UsuaFactory;
import java.util.List;
import modelo.bean.Usuario;
import org.hibernate.StaleStateException;
/**
 *
 * @author bruno
 */
public class TesteUsuario {
    
    public static void main(String[] args) {        
        /*// Alteração  
        Usuario usua3 = new Usuario();
            usua3.setId(7);
            usua3.setUsuario("di000054");
            usua3.setSenha("pass");
            usua3.setTipo('C');
            new UsuaFactory().alterar(usua3); 
        
        // Consulta
        List<Usuario> lstUsu2 = (List<Usuario>) new UsuaFactory().consultar();
        System.out.println("Consulta sem filtro:");
        lstUsu2.forEach((us) -> {
            System.out.println(us.toString());
        });    
        
        // Exclusão
        new UsuaFactory().excluir(5);       
              
        // Consulta
        List<Usuario> lstUsu3 = (List<Usuario>) new UsuaFactory().consultar(6);
        System.out.println("Consulta com filtro:");
        lstUsu3.forEach((us) -> {
            System.out.println(us.toString());
        });
        
        // Está logado
        /*Usuario usua4 = new Usuario();
        usua4.setUsuario("user");
        usua4.setSenha("pass");
        System.out.println("Logado? " + ((new UsuaFactory().isLogged(usua4)).size() > 0));
        
        // Exclusão
        new UsuaFactory().excluir(3);  */
        
        Usuario usua1 = new Usuario();
        usua1.setUsuario("root");
        usua1.setSenha("root");
        usua1.setTipo("Administrador");
        new UsuaFactory().salvar(usua1, "UsuarioPU");
    }
}