import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class MyPanel extends JPanel {

    Image image;

    MyPanel(){
        image = new ImageIcon("src/night.jpeg").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 0, 0, null);

        g2D.setPaint(Color.green);
        g2D.fillRect(0, 300, 500, 500);

        g2D.setPaint(Color.gray);
        g2D.fillRect(225, 325, 50, 100);
        g2D.fillRect(325, 350, 50, 100);
        g2D.fillRect(125, 350, 50, 100);

        g2D.setStroke(new BasicStroke(1));
        g2D.setPaint(Color.orange);
        g2D.fillArc(150, 200, 200, 200, 0, 180);

        int[] xPoints = {0,100,200};
        int[] yPoints = {300,150,300};

        g2D.setPaint(new Color(0x694d00));
        g2D.drawPolygon(xPoints, yPoints, xPoints.length);
        g2D.fillPolygon(xPoints, yPoints, xPoints.length);

        int[] xPoints2 = {300,400,500};
        int[] yPoints2 = {300,150,300};

        g2D.setPaint(new Color(0x694d00));
        g2D.drawPolygon(xPoints2, yPoints2, xPoints.length);
        g2D.fillPolygon(xPoints2, yPoints2, xPoints.length);

        g2D.setPaint(Color.green);
        g2D.setStroke(new BasicStroke(10));
        g2D.drawLine(0, 300, 500, 300);

        g2D.setPaint(Color.pink);
        g2D.setFont(new Font("Ink Free",Font.BOLD,40));
        g2D.drawString("Welcome to my city", 25, 75);

    }


}
