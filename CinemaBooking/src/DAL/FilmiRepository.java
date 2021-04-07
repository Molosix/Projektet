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
import BLL.Filmi;


public class FilmiRepository extends EMClass implements FilmiInterface{

    @Override
    public void create(Filmi f) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(f);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Filmi f) throws CFormException {
      try{
            em.getTransaction().begin();
            em.merge(f);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Filmi f) throws CFormException {
         try{
            em.getTransaction().begin();
            em.remove(f);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Filmi> findAll() throws CFormException {
       try{
            return em.createNamedQuery("Filmi.findAll").getResultList();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Filmi findById(Integer ID) throws CFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
