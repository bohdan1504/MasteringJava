import javax.swing.*;

public class MyFrame extends JFrame {

    FlyingDog flyingDog;

    MyFrame(){

        flyingDog = new FlyingDog();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(flyingDog);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }



}
