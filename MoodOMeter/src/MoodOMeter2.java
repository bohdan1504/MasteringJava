import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class MoodOMeter2 extends JFrame implements MouseListener {

    InputStream rHappy = MoodOMeter2.class.getResourceAsStream("happy.JPG");
    BufferedImage happy = ImageIO.read(rHappy);
    InputStream rPlayful = MoodOMeter2.class.getResourceAsStream("playful.JPG");
    BufferedImage playful = ImageIO.read(rPlayful);
    InputStream rAnnoyed = MoodOMeter2.class.getResourceAsStream("annoyed.JPG");
    BufferedImage annoyed = ImageIO.read(rAnnoyed);
    InputStream rSerious = MoodOMeter2.class.getResourceAsStream("serious.JPG");
    BufferedImage serious = ImageIO.read(rSerious);


//    ImageIcon happy;
//    ImageIcon annoyed;

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;

    MoodOMeter2() throws IOException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650,700);
        this.setLayout(new BorderLayout());

//        happy = new ImageIcon("src/happy.JPG");
//        annoyed = new ImageIcon("src/annoyed.JPG");

        panel1 = new JPanel(new BorderLayout());
        panel2 = new JPanel(new BorderLayout());
        panel3 = new JPanel(new BorderLayout());
        panel4 = new JPanel(new BorderLayout());
        panel5 = new JPanel(new BorderLayout());



        label1 = new JLabel("HAPPY");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);


        label2 = new JLabel("PLAYFUL");
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.CENTER);

        label3 = new JLabel("ANNOYED");
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setVerticalAlignment(JLabel.CENTER);

        label4 = new JLabel("SERIOUS");
        label4.setHorizontalAlignment(JLabel.CENTER);
        label4.setVerticalAlignment(JLabel.CENTER);

        label5 = new JLabel("WHAT IS YOUR MOOD TODAY? :D");
        label5.setHorizontalAlignment(JLabel.CENTER);
        label5.setVerticalAlignment(JLabel.CENTER);


        panel1.add(label1, BorderLayout.CENTER);
        panel2.add(label2, BorderLayout.CENTER);
        panel3.add(label3, BorderLayout.CENTER);
        panel4.add(label4, BorderLayout.CENTER);
        panel5.add(label5, BorderLayout.CENTER);


        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.white);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        panel1.addMouseListener(this);
        panel2.addMouseListener(this);
        panel3.addMouseListener(this);
        panel4.addMouseListener(this);
        panel5.addMouseListener(this);



        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.WEST);
        this.add(panel3,BorderLayout.EAST);
        this.add(panel4,BorderLayout.SOUTH);
        this.add(panel5,BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if(e.getSource()==panel1){
            label5.setIcon(new ImageIcon(happy));
        }
        if(e.getSource()==panel2){
            label5.setIcon(new ImageIcon(playful));
        }if(e.getSource()==panel3){
            label5.setIcon(new ImageIcon(annoyed));
        }if(e.getSource()==panel4){
            label5.setIcon(new ImageIcon(serious));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        label5.setIcon(null);
    }
}

