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
        Usuario usua1 = new Usuario();
        usua1.setUsuario("root");
        usua1.setSenha("root");
        usua1.setTipo("Administrador");
        new UsuaFactory().salvar(usua1, "UsuarioPU");
    }
}