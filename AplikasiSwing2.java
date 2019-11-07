package aplikasiswing2;
import javax.swing.*;
public class AplikasiSwing2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Aplikasi Swing");
                JPanel p = new JPanel();
                JButton b = new JButton("Press Me");
                
                f.setSize(400, 400);
                
                p.add(b);               // add button to panel
                f.setContentPane(p);    // add panel to frame
               
                f.show();
    }
}
