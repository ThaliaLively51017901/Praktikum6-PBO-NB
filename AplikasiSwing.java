package aplikasiswing;
import javax.swing.*;
public class AplikasiSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Aplikasi Swing");
                JPanel p = new JPanel();
                JButton b = new JButton("Press Me");
                
                p.add(b);               // add button to panel
                f.setContentPane(p);    // add panel to frame
                f.show();
    }
}
