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
public interface SallaInterface {
     void create(Salla s) throws CFormException;
    void edit(Salla s) throws CFormException;
    void delete(Salla s) throws CFormException;
    List <Salla> findAll() throws CFormException;
    Salla findById (Integer ID) throws CFormException;
    
    
}
