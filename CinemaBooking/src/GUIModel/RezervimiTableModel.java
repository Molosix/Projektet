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
import BLL.Rezervimi;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class RezervimiTableModel extends AbstractTableModel{
    List<Rezervimi> list;
    String [] cols = {"RezervimiId", "ulsja", "cmimi", "puntori", "Kinema"};
    
     public RezervimiTableModel(){
    }
     public RezervimiTableModel(List<Rezervimi> list){
        this.list = list;
    }
    
    public void addList(List<Rezervimi> list){
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
     public Rezervimi getRezervimi(int index){
        return list.get(index);
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Rezervimi re = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return re.getRezervimiId();
            case 1:
                return re.getUlsja();
            case 2:
                return re.getCmimi();
            case 3:
                return re.getPuntori();
            case 4:
                return re.getKinema();
            default:
                return null;
        }
        
    }
    
}
