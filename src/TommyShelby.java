//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.*;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.font.*;
//import java.io.IOException;
//import javax.swing.border.*;
//import java.io.File;
//import java.util.Scanner;
//
//
//public class Main {
//    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
//
//        File file = new File("src/starboy.wav");
//        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioStream);
//        clip.start();
//
//
//
//        ImageIcon image = new ImageIcon("src/tommy2.png");
//        Border border = BorderFactory.createDashedBorder(Color.white, 13, 13);
//
//
//
//        JLabel label = new JLabel(); // create a label
//        label.setText("Thomas Shelby, OBE"); // set text of label
//        label.setVisible(true);
//        label.setIcon(image);
//        label.setHorizontalTextPosition(JLabel.CENTER); // set text left,  center or right of image icon
//        label.setVerticalTextPosition(JLabel.TOP); // set text top, bottom or center
//        label.setForeground(new Color(0x8E8E8E));
//        label.setFont(new Font("Courier", Font.PLAIN, 50));
//        label.setIconTextGap(-30);
//        label.setBackground(Color.black);
//        label.setOpaque(true); // to display colors
//        label.setBorder(border);
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
////        label.setBounds(50, 50, 400, 400); // sets x, y + dimensions position within frame
//
//
////        myFrame frame = new myFrame();
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setLayout(null);
////        frame.setSize(500, 500);
//        frame.getContentPane().setBackground(Color.white);
//        frame.add(label);
//        frame.pack(); // add components before packing!
//
//
//    }
//}