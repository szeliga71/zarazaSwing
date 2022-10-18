import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwiatZarazony extends JFrame {


    SwiatZarazonyPlansza czacha;
    Image skull1;

    public SwiatZarazony() {


        setSize(380, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ImageIcon skull = new ImageIcon("skull.png");
        setIconImage(skull.getImage());
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());

        SwiatZarazonyPlansza czacha = new SwiatZarazonyPlansza();
        jp.add(czacha, BorderLayout.CENTER);

        JButton zakoncz = new JButton();


        zakoncz.setFont(new Font("Verdana", Font.BOLD, 20));
        zakoncz.setText("ZAKONCZ");
        zakoncz.setVisible(true);
        zakoncz.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });

        jp.add(zakoncz, BorderLayout.PAGE_END);
        add(jp);
        setVisible(true);

    }
}

