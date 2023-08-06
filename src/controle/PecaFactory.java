/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.Peca;

/**
 *
 * @author bruno
 */
public class PecaFactory extends Factory {
    
    public void salvar(Object obj) {
        super.salvar(obj, "PecaPU");
    }
    
    public Object consultar() {
        return super.consultar("from Peca");
    }
    
    @Override
    public void alterar(Object obj) {
        super.alterar(obj);
    }
    
    public Object consultar(Integer id) {
        return super.consultar("from Peca where id = " + id);
    }
    
    public void excluir(Integer id) {
        super.excluir("PecaPU", id, new Peca());
    }
}