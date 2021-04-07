/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;

/**
 *
 * @author Admin
 */
import BLL.Kinema;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class KinemaTableModel extends AbstractTableModel{
     List<Kinema> list;
    String [] cols = {"KinemaID", "emri", "qyteti", "rruga", "zip"};
    
     public KinemaTableModel(){
    }
     public KinemaTableModel(List<Kinema> list){
        this.list = list;
    }
    
    public void addList(List<Kinema> list){
        this.list = list;
    }
     @Override
    public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return list.size();
    }
     public void remove(int row){
        list.remove(row);
    }
     public Kinema getKinema(int index){
        return list.get(index);
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Kinema ki = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return ki.getKinemaID();
            case 1:
                return ki.getEmri();
            case 2:
                return ki.getQyteti();
            case 3:
                return ki.getRruga();
            case 4:
                return ki.getZip();
            default:
                return null;
        }
    }
    
}
