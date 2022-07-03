import javax.swing.*;

public class qwertious_launcher {
    public static void main(String[] args) {
        int w = 1024 - 128;
        int h = w * 3 / 4;
        JFrame f = new JFrame();
        canvas dc = new canvas(w, h);
        f.setSize(w, h);
        f.setTitle("Qwertious Launcher");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}