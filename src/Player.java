import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends JPanel implements KeyListener {
    private int x;
    private int y;
    private int dx;
    private int health;
    private final Image image;

    public Player(int x, int y, Image image) {
        this.x = x;
        this.y = y;
        this.health = 100;
        this.image = image;
    }

    public void move() {
        x += dx;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        System.out.println(key);
        if (key == KeyEvent.VK_A) {
            System.out.println("right");
            dx = -20;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 20;
        }

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

    public void fire() {
        // code to create and fire a projectile
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 50, 50);
    }

    public int getHealth() {
        return health;
    }

    public Image getImage() {
        return image;
    }
}
