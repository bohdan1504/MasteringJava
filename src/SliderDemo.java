import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;



public class SliderDemo implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel text;
    JSlider slider;

    SliderDemo(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        text = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);

        slider.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("% = "+slider.getValue());
        label.setFont(new Font("Comic Sans", Font.PLAIN, 25));
        slider.addChangeListener(this);

        text.setText("You like Bogdan");
        text.setFont(new Font("Comic Sans", Font.PLAIN, 25));


        panel.setLayout(new GridLayout(3,1));
        panel.add(slider);
        panel.add(label);
        panel.add(text);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("% = "+slider.getValue());
        if(slider.getValue()==100){
            text.setText("OMG OMG OMG! Bogdan is the LOVE of your life!!!!");
        }
        else if(slider.getValue()>=90){
            text.setText("You're in love with Bogdan!");
        }
        else if(slider.getValue()>75){
            text.setText("You really love Bogdan!!");
        }
        else if(slider.getValue()>60){
            text.setText("You really like Bogdan!");
        }


        else if(slider.getValue()==0){
            text.setText("Fuck youuuuuu! And you. And youuuuu. I hate your friends and they hate me too....");
        }
        else if(slider.getValue()<=15){
            text.setText("Are you kidding me!?!?!?");
        }
        else if(slider.getValue()<=25){
            text.setText("This can't be possible");
        }
        else if(slider.getValue()<=40){
            text.setText("You don't really like Bogdan");
        }

    }
}
