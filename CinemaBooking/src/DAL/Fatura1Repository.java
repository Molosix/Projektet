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
import BLL.Fatura1;
public class Fatura1Repository extends EMClass implements Fatura1Interface{

    @Override
    public void create(Fatura1 f1) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(f1);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Fatura1 f1) throws CFormException {
       try{
            em.getTransaction().begin();
            em.merge(f1);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Fatura1 f1) throws CFormException {
        try{
            em.getTransaction().begin();
            em.remove(f1);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Fatura1> findAll() throws CFormException {
        try{
            return em.createNamedQuery("Fatura1.findAll").getResultList();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Fatura1 findById(Integer ID) throws CFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
