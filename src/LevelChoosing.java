import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LevelChoosing extends JFrame implements ActionListener {





        JPanel panel = new JPanel();


        JButton button1 = new JButton("EASY");
        JButton button2 = new JButton("MEDIUM");
        JButton button3 = new JButton("HARD");

    public LevelChoosing() {
        ImageIcon skull= new ImageIcon("skull.png");
        setIconImage(skull.getImage());

        panel.setBackground(Color.BLUE);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        add(panel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        setSize(400, 100);

        setTitle(" Level choosing ");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            Swiat swiat = new Swiat(2);
           Thread th1=new Thread(swiat);
           th1.start();
            setVisible(false);
            System.out.println(" LATWY");
        } else if (e.getSource() == button2) {
            Swiat swiat = new Swiat(4);
            Thread th1=new Thread(swiat);
            th1.start();
            setVisible(false);
            System.out.println(" SREDNI ");
        } else if (e.getSource() == button3) {
            Swiat swiat = new Swiat(8);
            Thread th1=new Thread(swiat);
            th1.start();
            setVisible(false);
            System.out.println(" TRUDNY ");
        }


    }
}