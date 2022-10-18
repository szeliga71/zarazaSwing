import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swiat extends JFrame implements Runnable {

    long iluChorych;
    long popul;

    Mapa mapa;

    Panstwo[] panstwa;


    int level;
    int ileLotow = 20;
    int ileRejsow = 30;

    public Swiat(int level) {

        super("Mapa Swiata");
        ImageIcon skull= new ImageIcon("skull.png");
        setIconImage(skull.getImage());

        this.level = level;


        Panstwo p1 = new Panstwo("Rosja", 260000000, 0, this.level, Color.red);

        Panstwo p2 = new Panstwo("Chiny", 2000000000, 1, this.level, Color.GREEN);

        Panstwo p3 = new Panstwo("U S A", 150000000, 0, this.level, Color.magenta);

        Panstwo p4 = new Panstwo("Kanada", 10000000, 0, this.level, Color.yellow);

        Panstwo p5 = new Panstwo("Niemcy", 80000000, 0, this.level, Color.red);

        Panstwo p6 = new Panstwo("Indie", 2000000000, 0, this.level, Color.GREEN);

        Panstwo p7 = new Panstwo("Australia", 100000000, 0, this.level, Color.magenta);

        Panstwo p8 = new Panstwo("Egipt", 90000000, 0, this.level, Color.red);

        Panstwo p9 = new Panstwo("Brazylia", 200000000, 0, this.level, Color.GREEN);


        Panstwo[] panstwa = {p1, p2, p3, p4, p5, p6, p7, p8, p9};
        this.panstwa = panstwa;


        setSize(1200, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        JPanel panel = new JPanel();



        panel.setLayout(new GridLayout(3, 3));
        panel.setBackground(Color.pink);


        mapa = new Mapa();




        JButton rosja = new JButton("ROSJA");
        rosja.setVisible(true);

        Timer t2 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p1.chorzy>0) {
                    rosja.setBackground(Color.yellow);
                    rosja.repaint();
                }
                if(p1.chorzy>(p1.populacja)/2){
                    rosja.setBackground(Color.red);
                rosja.repaint();}
                if(p1.chorzy>=p1.populacja){
                    rosja.setBackground(Color.black);
                    rosja.setForeground(Color.WHITE);
                    rosja.repaint();}

            }
        });

        t2.start();

        panel.add(rosja);
        rosja.setBounds(600, 70, 80, 30);

        rosja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.makeInfo();


            }
        });

        JButton chiny = new JButton("CHINY");
        Timer t3 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p2.chorzy>0) {
                    chiny.setBackground(Color.yellow);
                    chiny.repaint();
                }
                if(p2.chorzy>(p2.populacja)/2){
                    chiny.setBackground(Color.red);
                    chiny.repaint();}
                if(p2.chorzy>=p2.populacja){
                    chiny.setBackground(Color.black);
                    chiny.setForeground(Color.WHITE);
                    chiny.repaint();}

            }
        });

        t3.start();
        panel.add(chiny);
        chiny.setBounds(650, 180, 80, 30);
        chiny.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p2.makeInfo();

            }
        });

        JButton usa = new JButton("U S A");
        Timer t4 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p3.chorzy>0) {
                    usa.setBackground(Color.yellow);
                    usa.repaint();
                }
                if(p3.chorzy>(p3.populacja)/2){
                    usa.setBackground(Color.red);
                    usa.repaint();}
                if(p3.chorzy>=p3.populacja){
                    usa.setBackground(Color.black);
                    usa.setForeground(Color.WHITE);
                    usa.repaint();}

            }
        });

        t4.start();
        panel.add(usa);
        usa.setBounds(100, 150, 80, 30);
        usa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p3.makeInfo();
                System.out.println(" u s a  ");


            }
        });


        JButton kanada = new JButton("KANADA");
        Timer t5 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p4.chorzy>0) {
                    kanada.setBackground(Color.yellow);
                    kanada.repaint();
                }
                if(p4.chorzy>(p4.populacja)/2){
                    kanada.setBackground(Color.red);
                    kanada.repaint();}
                if(p4.chorzy>=p4.populacja){
                    kanada.setBackground(Color.black);
                    kanada.setForeground(Color.WHITE);
                    kanada.repaint();}

            }
        });

        t5.start();
        panel.add(kanada);
        kanada.setBounds(100, 100, 100, 30);
        kanada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p4.makeInfo();
                System.out.println(" Kanada ");

            }
        });


        JButton australia = new JButton("AUSTRALIA");
        Timer t6 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p5.chorzy>0) {
                    australia.setBackground(Color.yellow);
                    australia.repaint();
                }
                if(p5.chorzy>(p5.populacja)/2){
                    australia.setBackground(Color.red);
                    australia.repaint();}
                if(p5.chorzy>=p5.populacja){
                    australia.setBackground(Color.black);
                    australia.setForeground(Color.WHITE);
                    australia.repaint();}

            }
        });

        t6.start();
        panel.add(australia);
        australia.setBounds(750, 420, 100, 30);
        australia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p7.makeInfo();
                System.out.println("Australia ");

            }
        });


        JButton niemcy = new JButton("NIEMCY");
        Timer t7 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p6.chorzy>0) {
                    niemcy.setBackground(Color.yellow);
                    niemcy.repaint();
                }
                if(p6.chorzy>(p6.populacja)/2){
                    niemcy.setBackground(Color.red);
                    niemcy.repaint();}
                if(p6.chorzy>=p6.populacja){
                    niemcy.setBackground(Color.black);
                    niemcy.setForeground(Color.WHITE);
                    niemcy.repaint();}

            }
        });

        t7.start();
        panel.add(niemcy);
        niemcy.setBounds(400, 120, 90, 30);
        niemcy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p5.makeInfo();
                System.out.println(" u s a  ");
            }
        });

        JButton brazylia = new JButton("BRAZYLIA");
        Timer t8 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p7.chorzy>0) {
                    brazylia.setBackground(Color.yellow);
                    brazylia.repaint();
                }
                if(p7.chorzy>(p7.populacja)/2){
                    brazylia.setBackground(Color.red);
                    brazylia.repaint();}
                if(p7.chorzy>=p7.populacja){
                    brazylia.setBackground(Color.black);
                    brazylia.setForeground(Color.WHITE);
                    brazylia.repaint();}

            }
        });

        t8.start();
        panel.add(brazylia);
        brazylia.setBounds(190, 360, 100, 30);
        brazylia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p9.makeInfo();
                System.out.println(" u s a  ");


            }
        });


        JButton indie = new JButton("INDIE");
        Timer t9 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p8.chorzy>0) {
                    indie.setBackground(Color.yellow);
                    indie.repaint();
                }
                if(p8.chorzy>(p8.populacja)/2){
                    indie.setBackground(Color.red);
                    indie.repaint();}
                if(p8.chorzy>=p8.populacja){
                    indie.setBackground(Color.black);
                    indie.setForeground(Color.WHITE);
                    indie.repaint();}

            }
        });

        t9.start();
        panel.add(indie);
        indie.setBounds(190, 360, 100, 30);
        indie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p6.makeInfo();
                System.out.println(" u s a  ");


            }
        });

        JButton egipt = new JButton("EGIPT");
        Timer t10 = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(p9.chorzy>0) {
                    egipt.setBackground(Color.yellow);
                    egipt.repaint();
                }
                if(p9.chorzy>(p9.populacja)/2){
                    egipt.setBackground(Color.red);
                    egipt.repaint();}
                if(p9.chorzy>=p9.populacja){
                    egipt.setBackground(Color.black);
                    egipt.setForeground(Color.WHITE);
                    egipt.repaint();}

            }
        });

        t10.start();

        panel.add(egipt);
        egipt.setBounds(190, 360, 100, 30);
        egipt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p8.makeInfo();
                System.out.println(" u s a  ");


            }
        });


        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, mapa, panel);

        splitPane.setDividerLocation(900);

        add(splitPane, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);



        setVisible(true);


        setLocationRelativeTo(null);

        JPanel gora = new JPanel();


        JLabel totalChorzy = new JLabel();
        totalChorzy.setFont(new Font ("Verdana ",Font.BOLD,20));
        totalChorzy.setForeground(Color.red);
        Timer t = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                totalChorzy.setText(String.valueOf("Liczba zarazonych na swiecie  " + iluChorych));
                gora.repaint();
            }
        });

        t.start();


        gora.add(totalChorzy);


        JLabel populacja = new JLabel();
        populacja.setFont(new Font ("Verdana ",Font.BOLD,20));
        populacja.setForeground(Color.BLUE);
        popul=populacjaSwiata();
        populacja.setText("   Liczba ludnosci swiata : " + String.valueOf(popul) );
        gora.add(populacja);
        add(gora, BorderLayout.PAGE_START);
        add(splitPane);

    }

        @Override
        public void run () {
            int day = 1;
            long dziennieChorzy=0;

            while (populacjaSwiata() >= dziennieChorzy){
                dziennieChorzy= sumaDziennychChorychSwiat(day);
                /*System.out.println(populacjaSwiata()+" populacja ");
                System.out.println(dziennieChorzy+ " dziennie chorzy");
                System.out.println(sumaDziennychChorychSwiat(day)+ " ilu chorych dziennie ");*/
                try {
                    Thread.sleep(3000);
                    //System.out.println(day + " dzien");


                    ustawienieDziennegoWspolczynnika();


                    setLokalnaHistoriachorych(day);
                    zarazanieNaSwiecie();
                    ustawienieLiczbyChorychDzien();


                    iluChorych = sumaDziennychChorychSwiat(day);
                    runTransport();

                    ruchLotniczy(panstwa[0], panstwa[1], this.ileLotow);
                    ruchLotniczy(panstwa[4], panstwa[2], this.ileLotow);
                    ruchLotniczy(panstwa[3], panstwa[4], this.ileLotow);
                    ruchMorski(panstwa[2], panstwa[0], this.ileRejsow);
                    ruchMorski(panstwa[5], panstwa[4], this.ileRejsow);
                    ruchLotniczy(panstwa[8], panstwa[5], this.ileLotow);
                    ruchLotniczy(panstwa[7], panstwa[8], this.ileLotow);
                    ruchMorski(panstwa[6], panstwa[8], this.ileRejsow);
                    ruchMorski(panstwa[1], panstwa[6], this.ileRejsow);

                    if(dziennieChorzy==populacjaSwiata())
                        break;


                    if(populacjaSwiata()-sumaDziennychChorychSwiat(day)<sumaDziennychChorychSwiat(day+1)){
                        dziennieChorzy=populacjaSwiata();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
                day++;
            }

            SwiatZarazony swiatZarazony = new SwiatZarazony();

        }



    public void ustawienieDziennegoWspolczynnika(){
         for(int i=0;i< panstwa.length;i++){
            panstwa[i].setDziennyWspolczynnik();
        }
    }

    public void ustawienieLiczbyChorychDzien(){
        for(int i=0;i< panstwa.length;i++){
            panstwa[i].setChorzy();
        }
    }


public void zarazanieNaSwiecie(){
        for(int i=0;i< panstwa.length;i++){
            panstwa[i].zarazanie();
        }
}
   public void setLokalnaHistoriachorych(int day){
        for(int i=0;i<panstwa.length;i++){
            panstwa[i].dodajLokalnaHistoriaChorych(day);
        }
   }

    public long sumaDziennychChorychSwiat(int day){
        long suma=0;
        for(int i=0;i<panstwa.length;i++) {
            if (day > 5) {
                suma = suma + panstwa[i].chorzy - panstwa[i].LokalnaHistoriaChorych.get(day - 5);
            }
            else {
                suma = suma + panstwa[i].chorzy;
            }
        }
        if(suma<0)
            suma=populacjaSwiata();

        return suma;}




    public long populacjaSwiata(){
        long sumaPopulacji=0;

        for(int i=0;i<panstwa.length;i++){

            sumaPopulacji=sumaPopulacji+panstwa[i].populacja;

        }
        return sumaPopulacji;}

    public void setIleLotow(int ileLotow) {
        this.ileLotow = ileLotow;
    }

    public void setIleRejsow(int ileRejsow) {
        this.ileRejsow = ileRejsow;
    }

    public void ruchLotniczy(Panstwo panstwo,Panstwo panstwo1,int ileLotow){
        panstwo.chorzy =panstwo.chorzy+(panstwo1.wirusSamolotowy*ileLotow);

    }

    public void ruchMorski(Panstwo panstwo,Panstwo panstwo1,int ileRejsow){
        panstwo.chorzy =panstwo.chorzy+(panstwo1.wirusStatkowy*ileRejsow);}

        public void runTransport(){
        for(int i=0; i<panstwa.length;i++){
            panstwa[i].setWiurusSamolotowy();
panstwa[i].ruchLotniczy();
panstwa[i].setWiurusStatkowy();
        panstwa[i].ruchMorski();}}





}




