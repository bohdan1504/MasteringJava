import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class RocketGame extends JFrame implements KeyListener, ActionListener {

    JLabel label;
    ImageIcon rocketIcon;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu helpMenu;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon nightBg = new ImageIcon("src/night.jpeg");
    JFileChooser fileChooser;

    RocketGame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
//        this.setSize(500,500);

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(this);
        saveItem.addActionListener(this);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        this.setContentPane(new JLabel(new ImageIcon("src/night.jpeg")));

        rocketIcon = new ImageIcon("src/rocket-2.png");

        label = new JLabel();
        label.setBounds(200, 200, 128, 128);
        label.setIcon(rocketIcon);
//        this.getContentPane().setBackground(Color.BLACK);

        this.addKeyListener(this);
        this.add(label);
        this.setJMenuBar(menuBar);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 30, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 30);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 30);
                break;
            case 'd':
                label.setLocation(label.getX() + 30, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 20, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 20);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 20);
                break;
            case 39:
                label.setLocation(label.getX() + 20, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("You released the char: " + e.getKeyChar());
        System.out.println("You released the key code: " + e.getKeyCode());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
        if (e.getSource() == saveItem) {
            fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save");

            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                System.out.println("Save as file " + fileToSave.getAbsolutePath());
            }

        }
    }


}
