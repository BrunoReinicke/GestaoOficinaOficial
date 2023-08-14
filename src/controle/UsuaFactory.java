/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import modelo.bean.Usuario;

/**
 *
 * @author bruno
 */
public class UsuaFactory extends Factory {

    public void salvar(Object obj) {
        super.salvar(obj, "UsuarioPU");
    }
    
    @Override
    public Object consultar(String sql) {
        return super.consultar("from Usuario" + sql);
    }
    
    public List<Usuario> isLogged(Usuario u) {
        return (List<Usuario>) super.consultar(
            "from Usuario where usuario = '"+u.getUsuario()+"' and senha = '"+u.getSenha()+"'"); 
    }
    
    @Override
    public void alterar(Object obj) {
        super.alterar(obj);
    }
    
    public Object consultar(Integer id) {
        return super.consultar("from Usuario where id = " + id);
    }
    
    public void excluir(Integer id) {
        super.excluir("UsuarioPU", id, new Usuario());
    }
}