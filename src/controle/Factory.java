/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TransactionRequiredException;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author bruno
 */
public class Factory {
    
    protected void salvar(Object obj, String pers) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pers);
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    public Object consultar(String sql) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Object> list = session.createQuery(sql).list();
        session.flush();
        session.close();
 
        return list; 
    }
    
    protected void excluir(String pers, Integer id, Object o) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(pers);
        EntityManager em = emf.createEntityManager();  
        Object obj = em.find(o.getClass(), id);
        
        em.getTransaction().begin();
        em.remove(obj);
        em.getTransaction().commit();
    }
    
    protected void alterar(Object obj) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(obj);
        session.getTransaction().commit();
    }
}