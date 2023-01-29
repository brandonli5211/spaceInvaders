import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends JPanel {
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

    public void setDx(int dx) {
        System.out.println("change");
        this.dx = dx;
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
