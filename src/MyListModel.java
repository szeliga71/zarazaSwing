import javax.swing.*;
import java.util.Vector;

public class MyListModel extends AbstractListModel {

    public Vector<String>gracze;

public MyListModel(Vector<String> gracze){
this.gracze=  gracze;

}

    @Override
    public int getSize() {
        return gracze.size();
    }

    @Override
    public Object getElementAt(int index) {
        return gracze.get(index);
    }
}
