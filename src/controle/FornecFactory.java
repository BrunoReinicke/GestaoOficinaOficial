/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.Fornecedor;

/**
 *
 * @author bruno
 */
public class FornecFactory extends Factory {
    
    public void salvar(Object obj) {
        super.salvar(obj, "FornecedorPU");
    }
    
    public Object consultar() {
        return super.consultar("from Fornecedor");
    }
    
    @Override
    public void alterar(Object obj) {
        super.alterar(obj);
    }
    
    public Object consultar(Integer id) {
        return super.consultar("from Fornecedor where id = " + id);
    }
    
    public void excluir(Integer id) {
        super.excluir("FornecedorPU", id, new Fornecedor());
    }
}