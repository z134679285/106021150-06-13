import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class frame10 extends JFrame {
    private  JButton b1 = new JButton("→");
    private  JButton b2 = new JButton("←");
    private  JButton b3 = new JButton("Exit");
    private Container cp;
    private JPanel jpnc = new JPanel();
    private JPanel jpnr = new JPanel(new GridLayout(5, 5, 2, 2));
    private JLabel lab[][] = new JLabel[5][5];
//    private Random random = new Random();
    private  Timer t1;
    public frame10(){
        init();
    }

    private  void init(){
        this.setBounds(200,200,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(2, 2));
        cp.add(jpnc, BorderLayout.NORTH);
        cp.add(jpnr, BorderLayout.CENTER);
        jpnc.setLayout(new GridLayout(5, 5, 2, 2));
        jpnr.add(b1);
        jpnr.add(b2);
        jpnr.add(b3);
        for(int i=0 ;i<5 ;i++){
            for(int j=0 ;j<5 ;j++) {
                lab[i][j] = new JLabel("0", SwingConstants.CENTER);
                jpnc.add(lab[i][j]);
//                lab[i][j].setText(Integer.toString(random.nextInt(49) + 1));
                lab[i][j].setBackground(new Color(0, 255, 239));
                lab[i][j].setFont(new Font(null, Font.BOLD, 36));
                lab[i][j].setOpaque(true);
            }
        }
        t1= new Timer(200, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
         //判斷1234 分別為上下左右方向用switch case
//                switch (){
//                    case 0:
//
//                    case 1:
//
//                    case 2:
//
//                    case 3:
//
//                }
                for(int i=0 ;i<5 ;i++){
                    for(int j=0 ;j<5 ;j++) {
                        lab[i][j].setBackground(new Color(255, 0, 6));
                        lab[i][j].setFont(new Font(null, Font.BOLD, 36));
                        lab[i][j].setOpaque(true);
                    }
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0 ;i<5 ;i++){
                    for(int j=0 ;j<5 ;j++) {
                        lab[i][j].setBackground(new Color(255, 0, 6));
                        lab[i][j].setFont(new Font(null, Font.BOLD, 36));
                        lab[i][j].setOpaque(true);
                    }
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });

    }
}