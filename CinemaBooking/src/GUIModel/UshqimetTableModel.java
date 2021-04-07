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
import BLL.Ushqimet;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class UshqimetTableModel extends AbstractTableModel{
     List<Ushqimet> list;
    String [] cols = {"UshqimiID", "Lloji", "Kinema"};
    
     public UshqimetTableModel(){
    }
     public UshqimetTableModel(List<Ushqimet> list){
        this.list = list;
    }
    
    public void addList(List<Ushqimet> list){
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
     public Ushqimet getUshqimet(int index){
        return list.get(index);
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ushqimet us = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return us.getUshqimiID();
            case 1:
                return us.getLloji();
            case 2:
                return us.getKinema();
            default:
                return null;
        }
    }
    
}
