/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.Cliente;

/**
 *
 * @author bruno
 */
public class ClienteFactory extends Factory {
    
    public void salvar(Object obj) {
        super.salvar(obj, "ClientePU");
    }
    
    @Override
    public Object consultar(String sql) {
        return super.consultar("from Cliente " + sql);
    }
    
    @Override
    public void alterar(Object obj) {
        super.alterar(obj);
    }
    
    public Object consultar(Integer id) {
        return super.consultar("from Cliente where id = " + id);
    }
    
    public void excluir(Integer id) {
        super.excluir("ClientePU", id, new Cliente());
    }
}