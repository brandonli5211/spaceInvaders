import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener {
    private JButton startButton;
    private JButton optionsButton;
    private GameScreen gameScreen;

    public Menu() {
        setLayout(new FlowLayout());

        startButton = new JButton("Start");
        startButton.addActionListener(this);
        add(startButton);

        optionsButton = new JButton("Options");
        optionsButton.addActionListener(this);
        add(optionsButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            gameScreen = new GameScreen();
            removeAll();
            add(gameScreen);
            repaint();
        }
        else if (e.getSource() == optionsButton) {
            // code to open options menu
        }
    }
}
