import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GameScreen extends JPanel implements ActionListener {
    private Timer timer;
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<Projectile> projectiles;

    public GameScreen() {
        setSize(600, 800);
        setFocusable(true);
        setBackground(Color.black);


        player = new Player(300, 500, new ImageIcon("src/images/spaceship.png").getImage()); // initialize player
        enemies = new ArrayList<Enemy>();
        projectiles = new ArrayList<Projectile>();

        // add enemies to the enemies list

        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;

        // draw player
        Rectangle pRect = new Rectangle(50, 50);
        g2d.setColor(Color.blue);
        g.fillRect(player.getX(), player.getY(), 50, 50);
        g2d.draw(pRect);

        // draw enemies
        for (Enemy enemy : enemies) {
            g2d.drawImage(enemy.getImage(), enemy.getX(), enemy.getY(), this);
        }

        // draw projectiles
        for (Projectile projectile : projectiles) {
            g2d.drawImage(projectile.getImage(), projectile.getX(), projectile.getY(), this);
        }

        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        // update player position
        player.move();

        // update enemy positions
        for (Enemy enemy : enemies) {
            enemy.move();
        }

        // update projectile positions
        for (Projectile projectile : projectiles) {
            projectile.move();
        }

        // check for collisions
        checkCollisions();

        repaint();
    }

    public void checkCollisions() {
        // check for collisions between projectiles and enemies
        for (Projectile projectile : projectiles) {
            for (Enemy enemy : enemies) {
                if (projectile.getBounds().intersects(enemy.getBounds())) {
                    enemy.takeDamage(projectile.getDamage());
                    projectiles.remove(projectile);
                    if (enemy.isDead()) {
                        enemies.remove(enemy);
                    }
                }
            }
        }

        // check for collisions between player and enemies
        for (Enemy enemy : enemies) {
            if (player.getBounds().intersects(enemy.getBounds())) {
                player.takeDamage(enemy.getDamage());

            }
        }
    }
}
