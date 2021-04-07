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


public interface PuntoriInterface {
    void create(Puntori p) throws CFormException;
    void edit(Puntori p) throws CFormException;
    void delete(Puntori p) throws CFormException;
    List <Puntori> findAll() throws CFormException;
    Puntori findById (Integer ID) throws CFormException;
    Puntori loginByUsernameAndPassword(String u, String psw) throws CFormException;
    
}
