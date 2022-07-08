import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.File;
import java.util.Scanner;

public class Useful {

    // EXCEPTIONS
//    Scanner scanner = new Scanner(System.in);
//
//    try {
//        System.out.println("Enter a whole number to divide: ");
//        int x = scanner.nextInt();
//
//        System.out.println("Enter a whole number to divide by: ");
//        int y = scanner.nextInt();
//        int z = x / y;
//        System.out.printf("Result: %s\n", z);
//    }
//        catch (ArithmeticException e){
//        System.out.println("You can't divide by zero, idiot!!");
//    }
////        catch (InputMismatchException e){
////            System.out.println("Please enter a number OMFG!!");
////        }
//        catch (Exception e){
//        System.out.println("Something went wrong");
//    }
//        finally {
//        scanner.close();
//    }




//    File class
//File file = new File("src/secret_message.rtf");
//        if (file.exists()) {
//        System.out.println("That file exists! :O");
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.isFile());
//    } else {
//        System.out.println("That file doesn't exist :(");
//    }


//    POEM writer

//    Scanner scanner = new Scanner(System.in);
//    String input;
//    String result = "";
//    String exitWord = "done";
//    String author = "     (c)";
//        try{
//        FileWriter writer = new FileWriter("mona_lisa.txt");
//        System.out.println("Write a short poem (press Enter twice to finish)");
//        do {
//            input = scanner.nextLine();
//            result += input;
//            result += "\n";
//        }
//        while (!input.isEmpty());
//        writer.write(result);
//        System.out.println("And what's the author's name? :)");
//        author += scanner.nextLine();
//        writer.append(author);
//        writer.close();
//    }
//        catch (
//    IOException e){
//        e.printStackTrace();
//    }
//        finally {
//        System.out.println("The file has been created!");
//    }



//    FILE READER
//            try {
//        FileReader reader = new FileReader("mona_lisa.txt");
//        int data = reader.read();
//        while (data != -1) {
//            System.out.print((char)data);
//            data = reader.read();
//        }
//    }
//        catch (
//    FileNotFoundException e){
//        e.printStackTrace();
//    }
//        catch (IOException e){
//        e.printStackTrace();
//    }



//    AUDIO PLAYER
//public class Main {
//    public static void main(String[] args) throws UnsupportedAudioFileException, IOException,
//            LineUnavailableException {
//
//        Scanner scanner = new Scanner(System.in);
//
//        File file = new File("src/starboy.wav");
//        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioStream);
//
//        String response = "";
//
//        while (!response.equals("Q")){
//            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
//            System.out.print("Enter your choice: ");
//            response = scanner.next();
//            response = response.toUpperCase();
//
//            switch (response){
//                case ("P"): clip.start();
//                    break;
//                case ("S"): clip.stop();
//                    break;
//                case ("R"): clip.setMicrosecondPosition(0);
//                    break;
//                case ("Q"): clip.close();
//                    break;
//                default:
//                    System.out.println("Not a valid response");
//            }
//
//        }
//        System.out.println("bye!");
//
//
//    }
//}



//    BUTTON
//
//    import javax.swing.*;
//import javax.swing.Icon;
//import javax.swing.border.EtchedBorder;
//import java.awt.*;
//import java.awt.event.*;
//import java.lang.*;
//
//    public class MyFrame extends JFrame implements ActionListener {
//
//        JLabel label;
//        JButton button;
//
//        MyFrame() {
//
//            ImageIcon icon = new ImageIcon("src/medal.png");
//            ImageIcon icon2 = new ImageIcon("src/dumbbell-2.png");
//
//            label = new JLabel();
//            label.setIcon(icon2);
//            label.setBounds(150, 250, 150, 150);
//            label.setVisible(false);
//
//            button = new JButton();
//            button.setBounds(100, 100, 250, 100);
//            button.addActionListener(this);
//            button.setText("Let's exercise!");
//            button.setFocusable(false);
//            button.setIcon(icon);
//            button.setHorizontalTextPosition(JButton.CENTER);
//            button.setVerticalTextPosition(JButton.BOTTOM);
//            button.setFont(new Font("Comic Sans", Font.BOLD, 25));
//            button.setIconTextGap(5);
//            button.setOpaque(true); // wouldn't show bg color otherwise
////        button.setBorderPainted(false); // wouldn't show bg color otherwise (probably just for Apple
//            button.setForeground(Color.cyan);
//            button.setBackground(Color.lightGray);
//            button.setBorder(BorderFactory.createEtchedBorder());
//
////        button.addActionListener(e -> System.out.println("poo"));
//            this.setTitle("Button be like");
//            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            this.setLayout(null);
//            this.setSize(500, 500);
//            this.setVisible(true);
//            this.add(button);
//            this.add(label);
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//            if (e.getSource() == button) {
//                System.out.println("click");
//                label.setVisible(true);
//            }
//        }
//    }


//         layeredPane.add(label1, Integer.valueOf(0));

}
