import javax.swing.*;
import java.util.Vector;

public class Ranking extends JFrame {

    public Ranking(){

       // stworzOkno();

        ImageIcon skull= new ImageIcon("skull.png");
        setIconImage(skull.getImage());

    //public void stworzOkno(){

        Vector<String>gracze=new Vector<>();
        //List<String> gracze =new ArrayList<>();
        gracze.add("tomek");
        gracze.add("jan");

        MyListModel myListModel= new MyListModel(gracze);

        JList<String> ranking= new JList<>();
        ranking.setModel(myListModel);

        JScrollPane jScrolPane =new JScrollPane(ranking);

        this.getContentPane().add(jScrolPane);

        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
