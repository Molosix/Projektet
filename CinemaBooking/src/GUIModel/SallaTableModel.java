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
import BLL.Salla;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class SallaTableModel extends AbstractTableModel{
     
    List<Salla> list;
    String [] cols = {"SallaId", "emri", "kapaciteti", "Kinema"};
    
     public SallaTableModel(){
    }
     public SallaTableModel(List<Salla> list){
        this.list = list;
    }
    
    public void addList(List<Salla> list){
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
     public Salla getSalla(int index){
        return list.get(index);
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Salla sa = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return sa.getSallaId();
            case 1:
                return sa.getEmri();
            case 2:
                return sa.getKapaciteti();
            case 3:
                return sa.getKinema();
            default:
                return null;
        }
    }
    
}
