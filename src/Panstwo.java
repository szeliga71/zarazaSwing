import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panstwo extends JFrame
{



    public String nazwa;
    public long populacja;
    public int level;
    public long chorzy;
    public Color color;
    public int dziennyWspolczynnik;
    public int samolot=200;
    public int statek=500;
    public int wirusStatkowy;
    public int wirusSamolotowy;
public List<Long>LokalnaHistoriaChorych;




    public Panstwo(String nazwa, long populacja, long chorzy, int level, Color color) {
        this.nazwa = nazwa;
        this.populacja = populacja;
        this.chorzy = chorzy;
        this.level = level;
        this.color = color;

LokalnaHistoriaChorych=new ArrayList<>();



    }


    public void makeInfo(){
        JFrame frame=new JFrame();
        frame.setTitle(this.nazwa);

        JPanel jp=new JPanel();
        jp.setBackground(this.color);
        jp.setLayout(new BorderLayout());
        jp.setVisible(true);

JPanel gora=new JPanel();
gora.setBackground(Color.GRAY);
gora.setVisible(true);

JPanel srodek = new JPanel();
srodek.setBackground(this.color);
srodek.setLayout(new BoxLayout(srodek,BoxLayout.Y_AXIS));

srodek.setVisible(true);


        JLabel lchorzy=new JLabel();
        //lchorzy.setFont(new Font(Font.SERIF,Font.BOLD,25));

        lchorzy.setText("Liczba chorych w "+ nazwa+"     ");
        lchorzy.setFont(new Font("Verdana",Font.BOLD,20));                                 //(Font.SERIF,Font.BOLD,25));
        Timer t = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lchorzy.setFont(new Font("Verdana",Font.PLAIN,20));
                lchorzy.setText(String.valueOf("Liczba chorych w "+ nazwa+" "+ chorzy));
                srodek.repaint();
            }
        });

        t.start();


        JButton zm = new JButton();
        zm.setText("wprowadz nowe szczepionki ");
        zm.setVisible(true);
        zm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chorzy=chorzy/2;
            }
        });
        zm.setAlignmentX(Component.LEFT_ALIGNMENT);


        JButton zm1 = new JButton();
        zm1.setText("ogranicz imprezy masowe ");
        zm1.setVisible(true);
        zm1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chorzy=chorzy/4;
            }
        });
        zm1.setAlignmentX(Component.LEFT_ALIGNMENT);


        JButton zml = new JButton();
        zml.setText("zwieksz ilosc srodkow ochrony ");
        zml.setVisible(true);
        zml.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(level>2)
                level=level-1;
            }
        });
        zml.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton zm5 = new JButton();
        zm5.setText("zwieksz ilosc punktow testowania ");
        zm5.setVisible(true);
        zm5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chorzy=chorzy-(chorzy/8);
            }
        });
        zm5.setAlignmentX(Component.LEFT_ALIGNMENT);


        JButton zm6 = new JButton();
        zm6.setText("zwieksz pensje personelu medycznego ");
        zm6.setVisible(true);
        zm6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chorzy=chorzy-(chorzy/4);
            }
        });
        zm6.setAlignmentX(Component.LEFT_ALIGNMENT);
/*JLabel random =new JLabel();
random.setText(String.valueOf(dziennyWspolczynnik));


        JLabel level1 =new JLabel();
        lchorzy.setFont(new Font(Font.SERIF,Font.ITALIC,18));

        Timer t1 = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                level1.setText(String.valueOf("level : "+ level));
                srodek.repaint();
            }
        });

        t1.start();*/

JLabel lp1 = new JLabel();
lp1.setText(" ");
        JLabel lp2 = new JLabel();
        lp2.setText(" ");

        JLabel lp3 = new JLabel();
        lp3.setText(" ");

        JLabel lp4 = new JLabel();
        lp4.setText(" ");
        JLabel lp5 = new JLabel();
        lp5.setText(" ");
        JLabel lp6 = new JLabel();
        lp6.setText(" ");


        srodek.add(lp1);
        srodek.add(lchorzy);
        srodek.add(lp2);
        srodek.add(zm);
        srodek.add(lp3);
        srodek.add(zm1);
        srodek.add(lp4);
        srodek.add(zml);
        srodek.add(lp5);
        srodek.add(zm5);
        srodek.add(lp6);
        srodek.add(zm6);


JPanel dol = new JPanel();
dol.setBackground(Color.gray);
dol.setVisible(true);

JButton zamknij = new JButton();

        zamknij.setFont(new Font("Verdana",Font.BOLD,20));
zamknij.setText("Zamknij");
zamknij.setVisible(true);
        zamknij.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                   }
        });


dol.add(zamknij);


jp.add(gora,BorderLayout.PAGE_START);
jp.add(srodek,BorderLayout.CENTER);
jp.add(dol,BorderLayout.PAGE_END);
        frame.add(jp);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);
        frame.setName(this.nazwa);


        JLabel populacja =new JLabel();
        populacja.setFont(new Font(Font.SERIF,Font.BOLD,24));
        populacja.setText("Populacja "+ nazwa+" "+ String.valueOf(this.populacja));

        gora.add(populacja);



    }

    public void dodajLokalnaHistoriaChorych(int day){
       LokalnaHistoriaChorych.add(day-1,chorzy);
    }



public int dziennyWspolczynnik(){

    int dziennyWspolczynnik;
    Random r=new Random();
    dziennyWspolczynnik=r.nextInt(level);
    return dziennyWspolczynnik;}


  public void setDziennyWspolczynnik(){
       dziennyWspolczynnik=dziennyWspolczynnik();
  }



    public long zarazanie() {
        long dzisiajChorych=0;
        if(chorzy==0)
            dziennyWspolczynnik=0;
        else if(populacja>chorzy)
        dzisiajChorych = chorzy*dziennyWspolczynnik;

        return dzisiajChorych;
    }
public void setChorzy(){
    if(populacja<=chorzy){
        chorzy=populacja;
        System.out.println(" caly kraj chory   "+ nazwa);
    }

else
        chorzy=chorzy+zarazanie();
}

public int ruchLotniczy(){
        int wirusSamolotowy;
        wirusSamolotowy=( (samolot*dziennyWspolczynnik)*2)/samolot;
    return  wirusSamolotowy;}

    public int ruchMorski(){
        int wirusStatkowy;
        wirusStatkowy=( (statek*dziennyWspolczynnik)*2)/samolot;
        return  wirusStatkowy;}


        public void setWiurusSamolotowy(){
        wirusSamolotowy=ruchLotniczy();
        }

    public void setWiurusStatkowy(){
        wirusStatkowy=ruchMorski();
    }


    public String toString() {
        return nazwa + " " + " ilosc chorych " + chorzy;
    }



}


