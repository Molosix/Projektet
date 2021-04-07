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
public interface Fatura1Interface {
    void create(Fatura1 f1) throws CFormException;
    void edit(Fatura1 f1) throws CFormException;
    void delete(Fatura1 f1) throws CFormException;
    List <Fatura1> findAll() throws CFormException;
    Fatura1 findById (Integer ID) throws CFormException;
   
}
