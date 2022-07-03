import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class canvas extends JComponent {
    private int width;
    private int height;

    public canvas(int w, int h) {
        width = w;
        height = h;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(255, 192, 64));
        Rectangle2D.Double r = new Rectangle2D.Double(0, height * 3 / 4, width, height / 4);
        g2d.fill(r);
        Rectangle2D.Double r1 = new Rectangle2D.Double(0, 0, width, height / 4);
        g2d.fill(r1);
        g2d.setColor(new Color(0, 0, 0));
        g2d.setFont(new Font("Cambria_Math", Font.BOLD, (height * 3 / 32)));
        g2d.drawString("Qwertious Launcher", width / 16, height * 3 / 16);
    }
}