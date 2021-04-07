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

public interface FilmiInterface {
    void create(Filmi f) throws CFormException;
    void edit(Filmi f) throws CFormException;
    void delete(Filmi f) throws CFormException;
    List <Filmi> findAll() throws CFormException;
    Filmi findById (Integer ID) throws CFormException;
    
    
}
