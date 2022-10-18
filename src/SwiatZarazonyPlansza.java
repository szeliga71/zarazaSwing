import javax.swing.*;
import java.awt.*;


public class SwiatZarazonyPlansza extends JPanel {


    Image skull1;

    public SwiatZarazonyPlansza() {

            skull1 = new ImageIcon("skull1.jpg").getImage();


            JLabel label = new JLabel();


       label.setFont(new Font("SERIF", Font.ITALIC, 24));
        label.setForeground(Color.red);
        label.setText(" SWIAT ZARAZONY");
        label.setVisible(true);

        add(label);


    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(skull1, 0, 50, null);




}
}