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
import BLL.Rezervimi;
public class RezervimiRepository extends EMClass implements RezervimiInterface {

    @Override
    public void create(Rezervimi r) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Rezervimi r) throws CFormException {
      try{
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Rezervimi r) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Rezervimi> findAll() throws CFormException {
        try{
            return em.createNamedQuery("Rezervimi.findAll").getResultList();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Rezervimi findById(Integer ID) throws CFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
