/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIModel;
import BLL.Kinema;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Admin
 */
public class KinemaComboBoxModel extends AbstractListModel<Kinema> implements ComboBoxModel<Kinema> {
    private List<Kinema> data;
    private Kinema selectedItem;
    
    public KinemaComboBoxModel(){}
    
    public KinemaComboBoxModel(List<Kinema> data){
        this.data = data;
    }
    
    public void add(List<Kinema> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Kinema getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Kinema)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
