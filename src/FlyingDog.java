import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlyingDog extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image dog;
    Image space;
    Timer timer;
    int xVelocity = 3;
    int yVelocity = 2;
    int x = 0;
    int y = 0;


    FlyingDog(){
//        image = new ImageIcon("src/night.jpeg").getImage();
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        space = new ImageIcon("src/space.jpg").getImage();
        dog = new ImageIcon("src/dog-2.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(space, 0, 0, null);
        g2D.drawImage(dog, x, y, null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>=PANEL_WIDTH-dog.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x += xVelocity;

        if(y>=PANEL_HEIGHT-dog.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y += yVelocity;


        repaint();
    }
}
