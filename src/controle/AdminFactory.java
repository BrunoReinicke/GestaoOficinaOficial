/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.Administrador;

/**
 *
 * @author bruno
 */
public class AdminFactory extends Factory {
    
    public void salvar(Object obj) {
        super.salvar(obj, "AdministradorPU");
    }
    
    @Override
    public Object consultar(String sql) {
        return super.consultar("from Administrador " + sql);
    }
    
    @Override
    public void alterar(Object obj) {
        super.alterar(obj);
    }
    
    public Object consultar(Integer id) {
        return super.consultar("from Administrador where id = " + id);
    }
    
    public void excluir(Integer id) {
        super.excluir("AdministradorPU", id, new Administrador());
    }
}