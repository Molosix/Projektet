/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Admin
 */

import java.util.List;
import BLL.Puntori;
import javax.persistence.Query;

public class PuntoriRepository extends EMClass implements PuntoriInterface{

    @Override
    public void create(Puntori p) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Puntori p) throws CFormException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Puntori p) throws CFormException {
        try{
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Puntori> findAll() throws CFormException {
         try{
            return em.createNamedQuery("Puntori.findAll").getResultList();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Puntori findById(Integer ID) throws CFormException {
        try {
            Query query = em.createQuery("SELECT p from Puntori p where p.ID = :abc");
            query.setParameter("abc", ID);
            return (Puntori) query.getSingleResult();
        }catch(Exception e) {
            throw new CFormException(e.getMessage());
        }
    }

    @Override
    public Puntori loginByUsernameAndPassword(String u, String psw) throws CFormException {
         try {
            Query query = em.createQuery("SELECT p from Puntori p where p.username = :user and p.password = :pw");
            query.setParameter("user",u );
            query.setParameter("pw",psw );
            return (Puntori) query.getSingleResult();
        }catch(Exception e) {
            throw new CFormException(e.getMessage());
        }
    }
    
      
    }
    
        
        

