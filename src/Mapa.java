import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mapa extends JPanel implements ActionListener {



    Image samolot;
    Image statek;
    Image backgroundImage;
    Timer timer;
    int xVelocity= 4;
    int yVelocity=1;


    int x1Velocity=0;
    int y1Velocity=2;
    int x2Velocity=2;
    int y2Velocity=1;
    int x3Velocity=4;
    int y3Velocity=1;

    int x4Velocity=1;
    int y4Velocity=0;

    int x5Velocity=1;
    int y5Velocity=0;


    int x6Velocity=1;
    int y6Velocity=1;


    int x=120;
    int y=80;
    int x1=750;
    int y1=400;


int x2=250;
int y2=380;


int x3=150;
int y3=150;

    int x4=240;
    int y4=470;


    int x5=160;
    int y5=200;

    int x6=720;
    int y6=420;

    public Mapa(){


   samolot =new ImageIcon("travelling.png").getImage();

    statek=new ImageIcon("ship-icon.png").getImage();

    backgroundImage= new ImageIcon("mapa120.jpg").getImage();


   timer=new Timer(50,this);
    timer.start();
    }
public void paint (Graphics g){
super.paint(g);
        Graphics2D g2D =(Graphics2D)g;

    g2D.drawImage(backgroundImage,0,0,null);

    g2D.drawImage(samolot,x,y,null);
    g2D.drawImage(samolot,x1,y1,null);
    g2D.drawImage(samolot,x2,y2,null);
    g2D.drawImage(samolot,x3,y3,null);

    g2D.drawImage(statek,x4,y4,null);
    g2D.drawImage(statek,x5,y5,null);
    g2D.drawImage(statek,x6,y6,null);

    g2D.setFont(new Font(Font.DIALOG,Font.BOLD,24));
    g2D.setColor(Color.yellow);
        g2D.drawString("ROSJA",600,80);
    g2D.drawString("CHINY",650,180);
    g2D.drawString("U S A",100,170);
    g2D.drawString("KANADA",100,80);
    g2D.drawString("AUSTRALIA",750,440);
    g2D.drawString("NIEMCY",400,150);
    g2D.drawString("BRAZYLIA",190,360);
    g2D.drawString("INDIE",600,250);
    g2D.drawString("EGIPT",450,230);



}
    @Override
    public void actionPerformed(ActionEvent e) {


        if(x>=400||x<120){
            xVelocity=xVelocity*-1;
            yVelocity=yVelocity*-1;
        }
        if(y1>=400||y1<120){
            x1Velocity=x1Velocity*-1;
            y1Velocity=y1Velocity*-1;
        }
        if(x2>=600||x2<200){
            x2Velocity=x2Velocity*-1;
            y2Velocity=y2Velocity*-1;
        }

      if(x3>=550||x3<150){
          x3Velocity=x3Velocity*-1;
           y3Velocity=y3Velocity*-1;}

        if(x4>=800||x4<240){
            x4Velocity=x4Velocity*-1;}

        if(x5>=350||x5<160){
            x5Velocity=x5Velocity*-1;}

        if(x6>=720||x6<450){
            x6Velocity=x6Velocity*-1;
            y6Velocity=y6Velocity*-1;
        }


x=x+xVelocity;
y=y+yVelocity;

x1=x1+x1Velocity;
y1=y1+y1Velocity;


      x2=x2+x2Velocity;
       y2=y2-y2Velocity;

       x3=x3+x3Velocity;
        y3=y3-y3Velocity;

        x4=x4+x4Velocity;
        y4=y4-y4Velocity;

        x5=x5+x5Velocity;
        y5=y5-y5Velocity;


        x6=x6+x6Velocity;
        y6=y6+y6Velocity;


repaint();
    }
}


