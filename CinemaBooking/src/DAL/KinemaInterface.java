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
public interface KinemaInterface {
    void create(Kinema k) throws CFormException;
    void edit(Kinema k) throws CFormException;
    void delete(Kinema k) throws CFormException;
    List <Kinema> findAll() throws CFormException;
    Kinema findById (Integer ID) throws CFormException;
   
    
}
