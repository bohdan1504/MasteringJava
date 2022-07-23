import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class FlyingDog extends JPanel implements ActionListener {

    // Makes it possible to load images to built .jar files
    InputStream resourceSpace = FlyingDog.class.getResourceAsStream("space.jpg");
    BufferedImage space = ImageIO.read(resourceSpace);
    InputStream resourceDog = FlyingDog.class.getResourceAsStream("dog-2.png");
    BufferedImage dog = ImageIO.read(resourceDog);

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Timer timer;
    int xVelocity = 3;
    int yVelocity = 2;
    int x = 0;
    int y = 0;


    FlyingDog() throws IOException {
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
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
