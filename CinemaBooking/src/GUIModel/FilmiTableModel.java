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
import BLL.Filmi;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class FilmiTableModel  extends AbstractTableModel{

     List<Filmi> list;
    String [] cols = {"FilmId", "koha", "titulli", "description", "Kinema"};
    
     public FilmiTableModel(){
    }
     public FilmiTableModel(List<Filmi> list){
        this.list = list;
    }
    
    public void addList(List<Filmi> list){
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
     public Filmi getFilmi(int index){
        return list.get(index);
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Filmi fi = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return fi.getFilmiId();
            case 1:
                return fi.getKoha();
            case 2:
                return fi.getTitulli();
            case 3:
                return fi.getDescription();
            case 4:
                return fi.getKinema();
            default:
                return null;
        }
    }
            public String getDateToString(Date d){
            DateFormat da = new SimpleDateFormat("dd-MM-yyyy");
            return da.format(d);
        }
    
}
