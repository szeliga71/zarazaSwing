import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JFrame {

    public Start(){

        ImageIcon skull= new ImageIcon("skull.png");
        setIconImage(skull.getImage());
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setSize(40,40);
        add(panel);
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));

JLabel label = new JLabel();
label.setText(" START");
label.setSize(20,10);
label.setVisible(true);

        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentY(Component.TOP_ALIGNMENT);

        JButton button1=new JButton("New Game");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);

        button1.setAlignmentY(Component.TOP_ALIGNMENT);

        JButton button2=new JButton("High Scores");
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);

        button2.setAlignmentY(Component.CENTER_ALIGNMENT);
        JButton button3=new JButton("EXIT");
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);

        button3.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        button1.setToolTipText(" Nowa gra ");
        button2.setToolTipText(" Top lista ");
        button3.setToolTipText(" Zakonczenie ");

panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" koniec ");
                dispose();}
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" Nowa Gra");
               LevelChoosing level=new LevelChoosing();
                setVisible(false);


            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ranking ranking=new Ranking();


                System.out.println( " High scores");
            }
        });



        setSize(250,150);
        setTitle(" Rozpoczecie ");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
