import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Samolot extends JPanel implements ActionListener {

    Image samolot;
    int x;
    int y;
    int xVelocity;
    int yVelocity;
    int max;
    int min;

    public Samolot(int x,int y,int xVelocity,int yVelocity,int max,int min) {
        this.x=x;
        this.y=y;
        this.xVelocity=xVelocity;
        this.yVelocity=yVelocity;
        this.max=max;
        this.min=min;

        samolot = new ImageIcon("travelling.png").getImage();

        Timer timer = new Timer(100,this);
        timer.start();
    }



        public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2D =(Graphics2D)g;

        g2D.drawImage(samolot,x,y,null);}

            @Override
            public void actionPerformed(ActionEvent e) {

                if(x>=max||x<min)
                    xVelocity=xVelocity*-1;

                    x=x+xVelocity;
                    y=y+yVelocity;
                    repaint();

    }
}