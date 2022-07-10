import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MoodOMeter extends JFrame implements MouseListener {

    JLabel label;
    JLabel northLabel;
    JLabel eastLabel;
    JLabel southLabel;
    JLabel westLabel;
    JLabel yourMood;



    ImageIcon happy;
    ImageIcon annoyed;
    ImageIcon serious;
    ImageIcon playful;

    JPanel north;
    JPanel east;
    JPanel south;
    JPanel west;


    MoodOMeter() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,700);
        this.setLayout(null);

        happy = new ImageIcon("src/happy.JPG");
        annoyed = new ImageIcon("src/annoyed.JPG");
        serious = new ImageIcon("src/serious.JPG");
        playful = new ImageIcon("src/playful.JPG");

        north = new JPanel();
        north.setBounds(0,0,700,100);
        north.setBackground(Color.ORANGE);
        north.setLayout(null);
        northLabel = new JLabel("HAPPY");
        northLabel.setSize(700, 100);
        northLabel.setHorizontalAlignment(JLabel.CENTER);
        northLabel.setVerticalAlignment(JLabel.CENTER);
        north.add(northLabel);

        east = new JPanel();
        east.setBounds(600,100,100,500);
        east.setBackground(Color.GREEN);
        east.setLayout(null);
        eastLabel = new JLabel("ANNOYED");
        eastLabel.setSize(100, 500);
        eastLabel.setHorizontalAlignment(JLabel.CENTER);
        eastLabel.setVerticalAlignment(JLabel.CENTER);
        east.add(eastLabel);

        west = new JPanel();
        west.setBounds(0,100,100,500);
        west.setBackground(Color.pink);
        west.setLayout(null);
        westLabel = new JLabel("PLAYFUL");
        westLabel.setSize(100, 500);
        westLabel.setHorizontalAlignment(JLabel.CENTER);
        westLabel.setVerticalAlignment(JLabel.CENTER);
        west.add(westLabel);


        south = new JPanel();
        south.setBounds(0,600,700,100);
        south.setBackground(Color.gray);
        south.setLayout(null);
        southLabel = new JLabel("SERIOUS");
        southLabel.setSize(700, 75);
        southLabel.setHorizontalAlignment(JLabel.CENTER);
        southLabel.setVerticalAlignment(JLabel.CENTER);
        south.add(southLabel);
        
        





        label = new JLabel();
        label.setBounds(100,100,500,500);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
        label.setLayout(null);

        yourMood = new JLabel("What's your mood today? :D");
        yourMood.setFont(new Font("Comis Sans", Font.PLAIN, 35));
        yourMood.setVerticalAlignment(JLabel.CENTER);
        yourMood.setHorizontalAlignment(JLabel.CENTER);
        yourMood.setForeground(Color.black);
        yourMood.setBounds(0,0,500,500);

        label.add(yourMood);

//        this.addMouseListener(this); // DON'T FORGET TO LISTEN!!!!!!
        north.addMouseListener(this);
        east.addMouseListener(this);
        south.addMouseListener(this);
        west.addMouseListener(this);

        this.add(label);
        this.add(west);
        this.add(north);
        this.add(east);
        this.add(south);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println("You clicked the mouse!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        System.out.println("You pressed the mouse!");
//        label.setSize(new Dimension(200,200));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        System.out.println("You released the mouse!");
//        label.setIcon(serious);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("You entered north");
//        label.setIcon(happy);
        if (e.getSource()==north){
            label.setIcon(happy);
            yourMood.setVisible(false);
        }
        else if (e.getSource()==east){
            label.setIcon(annoyed);
            yourMood.setVisible(false);
        }
        else if (e.getSource()==south){
            label.setIcon(serious);
            yourMood.setVisible(false);
        }
        else if (e.getSource()==west){
            label.setIcon(playful);
            yourMood.setVisible(false);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

        label.setIcon(null);
        yourMood.setVisible(true);

    }
}


