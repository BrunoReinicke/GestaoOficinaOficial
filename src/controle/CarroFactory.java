/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.Carro;

/**
 *
 * @author bruno
 */
public class CarroFactory extends Factory {
    
    public void salvar(Object obj) {
        super.salvar(obj, "CarroPU");
    }
    
    @Override
    public Object consultar(String sql) {
        return super.consultar("from Carro " + sql);
    }
    
    @Override
    public void alterar(Object obj) {
        super.alterar(obj);
    }
    
    public Object consultar(Integer id) {
        return super.consultar("from Carro where id = " + id);
    }
    
    public void excluir(Integer id) {
        super.excluir("CarroPU", id, new Carro());
    }
}