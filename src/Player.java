import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
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

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -20;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 20;
        }

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }
    }

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
