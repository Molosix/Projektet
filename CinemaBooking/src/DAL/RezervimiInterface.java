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
public interface RezervimiInterface {
    void create(Rezervimi r) throws CFormException;
    void edit(Rezervimi r) throws CFormException;
    void delete(Rezervimi r) throws CFormException;
    List <Rezervimi> findAll() throws CFormException;
    Rezervimi findById (Integer ID) throws CFormException;
    
}
