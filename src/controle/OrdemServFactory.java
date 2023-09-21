/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.bean.OrdemServico;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import util.HibernateUtil;
/**
 *
 * @author bruno
 */
public class OrdemServFactory extends Factory {

    public void salvar(Object obj, String pers, String sql) {
        Object objOs = super.consultar(sql);
        List<Object> lstOs = (List<Object>) objOs;

        if (!lstOs.isEmpty()) 
            ((OrdemServico) obj).setNumero(((OrdemServico) lstOs.get(0)).getNumero());
        else {
            try {
                Criteria sessao = HibernateUtil.getSessionFactory().openSession().createCriteria(OrdemServico.class);
                Criteria ordem  = sessao.addOrder(Order.desc("numero"));
                int numOS = ((OrdemServico) ordem.setMaxResults(1).uniqueResult()).getNumero() + 1;
                ((OrdemServico) obj).setNumero(numOS);   
            } catch (NullPointerException ex) {
                ((OrdemServico) obj).setNumero(1);
            }
        }
        super.salvar(obj, pers);
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
    
    @Override
    public void excluir(Integer id) {
        super.excluir("OrdemServicoPU", id, new OrdemServico());
    }
}