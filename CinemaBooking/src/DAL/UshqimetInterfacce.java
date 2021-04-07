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
public interface UshqimetInterfacce {
    void create(Ushqimet u) throws CFormException;
    void edit(Ushqimet u) throws CFormException;
    void delete(Ushqimet u) throws CFormException;
    List <Ushqimet> findAll() throws CFormException;
    Ushqimet findById (Integer ID) throws CFormException;
    
}
