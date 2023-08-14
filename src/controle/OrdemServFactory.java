/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.OrdemServico;
import java.util.List;
import org.hibernate.criterion.Order;
import util.HibernateUtil;
/**
 *
 * @author bruno
 */
public class OrdemServFactory extends Factory {

    public void salvar(Object obj) {
        List<Object> lstOS = 
            (List<Object>) super.consultar(
                "from OrdemServico where idCarro = " + ((OrdemServico) obj).getCarro().getId() + " and status = 0");
        
        if (lstOS.size() > 0) {
            ((OrdemServico) obj).setNumero(((OrdemServico) lstOS.get(0)).getNumero());
        } else {
            try {
                ((OrdemServico) obj).setNumero(
                    ((OrdemServico) HibernateUtil.getSessionFactory().openSession().createCriteria(OrdemServico.class)
                    .addOrder(Order.desc("numero"))
                    .setMaxResults(1)
                    .uniqueResult()).getNumero() + 1
                );   
            } catch (NullPointerException ex) {
                ((OrdemServico) obj).setNumero(1);
            }
        }
        super.salvar(obj, "OrdemServicoPU");
    }
    
    public Object consultar() {
        return super.consultar("from OrdemServico");
    }
    
    @Override
    public void alterar(Object obj) {
        super.alterar(obj);
    }
    
    public Object consultar(Integer numero) {
        return super.consultar("from OrdemServico where numero = " + numero);
    }
    
    public void excluir(Integer numero) {
        List<OrdemServico> lstOS = (List<OrdemServico>) this.consultar(numero);
        lstOS.forEach((os) -> {
            super.excluir("OrdemServicoPU", os.getId(), new OrdemServico());
        });
    }
}