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
import BLL.Kinema;
public class KinemaRepository extends EMClass implements KinemaInterface{

    @Override
    public void create(Kinema k) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(k);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Kinema k) throws CFormException {
         try{
            em.getTransaction().begin();
            em.merge(k);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Kinema k) throws CFormException {
         try{
            em.getTransaction().begin();
            em.remove(k);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Kinema> findAll() throws CFormException {
        try{
            return em.createNamedQuery("Kinema.findAll").getResultList();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Kinema findById(Integer ID) throws CFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
