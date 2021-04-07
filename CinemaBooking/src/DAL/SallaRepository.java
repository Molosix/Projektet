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
import BLL.Salla;

public class SallaRepository extends EMClass implements SallaInterface{

    @Override
    public void create(Salla s) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Salla s) throws CFormException {
       try{
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Salla s) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Salla> findAll() throws CFormException {
        try{
            return em.createNamedQuery("Salla.findAll").getResultList();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Salla findById(Integer ID) throws CFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
