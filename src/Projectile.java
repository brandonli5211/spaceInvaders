import javax.swing.*;
import java.awt.*;

public class Projectile {
    private int x;
    private int y;
    private final int speed;
    private final int damage;
    private final Image projectileImage;

    public Projectile(int x, int y) {
        this.x = x;
        this.y = y;
        speed = 8;
        damage = 10;
        projectileImage = new ImageIcon("/Users/brandon/Documents/SpaceInvaders/images/projectile.pngg2").getImage();
    }

    public void move() {
        y -= speed;
    }

    public void draw(Graphics g) {
        g.drawImage(projectileImage, x, y, null);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Image getImage() {
        return projectileImage;
    }

    public int getWidth() {
        return projectileImage.getWidth(null);
    }

    public int getDamage(){
        return damage;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, projectileImage.getWidth(null), projectileImage.getHeight(null));
    }

    public int getHeight() {
        return projectileImage.getHeight(null);
    }
}
