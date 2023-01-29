import javax.swing.*;
import java.awt.*;

public class Enemy {
    private int x;
    private int y;
    private int width;
    private int height;
    private int health;
    private Image enemyImage;
    private int speed;
    private int damage;
    private boolean movingRight;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        speed = 2;
        width = 50;
        height = 50;
        health = 100;
        damage = 10;
        enemyImage = new ImageIcon("src/images/enemy.png").getImage();
    }

    public void move() {
        if (movingRight) {
            x += speed;
        } else {
            x -= speed;
        }

        if (x > 600) {
            movingRight = false;
        } else if (x < 0) {
            movingRight = true;
        }
    }

    public void draw(Graphics g) {
        g.drawImage(enemyImage, x, y, width, height, null);
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

    public Image getImage() {
        return enemyImage;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, enemyImage.getWidth(null), enemyImage.getHeight(null));
    }

    public int getDamage() {
        return damage;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
