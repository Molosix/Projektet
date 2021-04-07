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
import BLL.Fatura1;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Fatura1TableModel extends AbstractTableModel{
    List<Fatura1> list;
    String [] cols = {"FaturaID", "TVSH", "Kinema", "Ushqimet", "Filmi"};

      public Fatura1TableModel(){
    }
     public Fatura1TableModel(List<Fatura1> list){
        this.list = list;
    }
    
    public void addList(List<Fatura1> list){
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
    public void remove(int row){
        list.remove(row);
    }
     public Fatura1 getFatura1(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Fatura1 fa1 = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return fa1.getFaturaID();
            case 1:
                return fa1.getTvsh();
            case 2:
                return fa1.getKinema();
            case 3:
                return fa1.getUshqimet();
            case 4:
                return fa1.getFilmi();
            default:
                return null;
        }
    }
    
}
