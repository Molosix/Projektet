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
import BLL.Ushqimet;

public class UshqimetRepository extends EMClass implements UshqimetInterfacce{

    @Override
    public void create(Ushqimet u) throws CFormException {
       try{
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Ushqimet u) throws CFormException {
        try{
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Ushqimet u) throws CFormException {
       try{
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Ushqimet> findAll() throws CFormException {
        try{
            return em.createNamedQuery("Ushqimet.findAll").getResultList();
        }catch(Exception e){
            throw new CFormException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Ushqimet findById(Integer ID) throws CFormException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
