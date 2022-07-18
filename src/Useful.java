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


    // TEXT field

    // public class MyFrame extends JFrame implements ActionListener {
    //
    //    JButton button;
    //    JTextField textField;
    //
    //    MyFrame(){
    //        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        this.setLayout(new FlowLayout());
    //
    //        button = new JButton("Submit");
    //        button.addActionListener(this);
    //
    //        textField = new JTextField();
    //        textField.setPreferredSize(new Dimension(250, 40));
    //        textField.setFont(new Font("Consolas", Font.BOLD, 35));
    //        textField.setForeground(new Color(0x00ff00));
    //        textField.setBackground(Color.red);
    //        textField.setCaretColor(Color.orange);
    //        textField.setToolTipText("username");
    //
    //        this.add(button);
    //        this.add(textField);
    //        this.pack();
    //        this.setVisible(true);
    //    }
    //
    //    @Override
    //    public void actionPerformed(ActionEvent e) {
    //        if (e.getSource()==button){
    //            System.out.println("Welcome " + textField.getText());
    //            textField.setEditable(false);
    //            button.setEnabled(false);
    //        }
    //    }
    //}


//    PROGRESS BAR
//public class ProgressBar {
//
//    JFrame frame = new JFrame();
//    JProgressBar bar = new JProgressBar(0, 500);
//
//    ProgressBar(){
//
//        bar.setValue(0);
//        bar.setBounds(25,20,450,50);
//        bar.setStringPainted(true);
//        bar.setFont(new Font("Comic Sans", Font.BOLD, 25));
//        frame.add(bar);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLayout(null);
//        frame.setVisible(true);
//
//        fill();
//
//    }
//
//    public void fill(){
//        int counter = 500;
//        while(counter>0){
//            bar.setValue(counter);
//            try {
//                Thread.sleep(50);
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            counter-=1;
//        }
//        bar.setString("Done! :)");
//    }


    // ENUMs


//    enum Planet{
//        MERCURY(1),
//        VENUS(2),
//        EARTH(3),
//        MARS(4),
//        JUPITER(5),
//        SATURN(6),
//        URANUS(7),
//        NEPTUNE(8),
//        PLUTO(9);
//
//        final int number;
//        Planet(int number){
//            this.number = number;
//        }
//
//    }
//
//
//    public class Main {
//        public static void main(String[] args) {
//
//            Planet myPlanet = Planet.MARS;
//            canILiveHere(myPlanet);
//        }
//
//        static void canILiveHere(Planet randomName){
//            switch (randomName){
//                case EARTH:
//                    System.out.println("You can live here :)");
//                    System.out.println("This is planet #"+randomName.number);
//
//                    break;
//                default:
//                    System.out.println("You can't live here... yet");
//                    System.out.println("This is planet #"+randomName.number);
//                    break;
//            }
//        }
//
//    }


    // HASHMAPs

//    import java.util.HashMap;
//
//    public class Main {
//        public static void main(String[] args) {
//
//            HashMap<String, String> countries = new HashMap<String, String>();
//
//            //add a key and value
//            countries.put("USA", "Washington DC");
//            countries.put("India", "New Delhi");
//            countries.put("Ukraine", "Kyiv");
//            countries.put("China", "Beijing");
//
//            countries.remove("USA");
//            System.out.println(countries.get("Ukraine"));
//            countries.clear();
//
//            countries.replace("USA", "Detroit");
//            System.out.println(countries.containsKey("England"));
//            System.out.println(countries.containsValue("Beijing"));
//
//            for (String i : countries.keySet()){
//                System.out.print(i + "\t = ");
//                System.out.println(countries.get(i));
//            }
//
//
//
//        }
//
//    }

    // ANONYMOUS OBJECTS
//    JFrame frame = new JFrame("Anonymous");
//    ArrayList<JLabel> deck = new ArrayList<JLabel>();
//
//        for (int i = 1; i <= 5; i++) {
//        deck.add(new JLabel(new ImageIcon("src/dog-" + i + ".png")));
//        frame.add(deck.get(i - 1));
//    }
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(new FlowLayout());
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);

    // LAMBDA EXPRESSION

//
//    JButton button1 = new JButton("Open new window");
//    JButton button2 = new JButton("Close the frame");
//
//    JFrame frame = new MyFrame();
//
//        button1.setBounds(100,100,200,100);
//        button1.addActionListener((e -> new MyFrame()));
//
//        button2.setBounds(100,200,200,100);
//        button2.addActionListener( (e) -> frame.dispose() );
//
//        frame.add(button1);
//        frame.add(button2);
//
//
//    String name = "Bogdan";
//    char symbol = '!';
//
//    MyInterface myInterface = (x, y) -> {
//        System.out.println("hello world");
//        System.out.println("It is a nice day " + x + y);
//    };
//
//    MyInterface myInterface2 = (x, y) -> {
//        System.out.println("Hello "+x+y);
//    };
//
//        myInterface2.message(name, symbol);


    // GENERICS

//    public static <Thing> void displayList(Thing[] array){
//        for (Thing i : array){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//
//    public static <Thing> Thing getFirst(Thing[] array){
//        return array[0];
//    }


}
