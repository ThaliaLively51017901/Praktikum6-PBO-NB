package aplikasiswing3;
import java.awt.event.*;
import javax.swing.*;
public class AplikasiSwing3 implements ActionListener {
    private static void createAndShowGUI() {
        // make frame..
        JFrame frame = new JFrame("I am a JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 30, 300, 100);
        frame.getContentPane().setLayout(null);
        // make a button..
        JButton butt = new JButton("Click Me");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20, 200, 20);
        
        // instantiate an application object
        AplikasiSwing3 app = new AplikasiSwing3();
        // make the label
        app.label = new JLabel("Nama Tidak Terdeteksi");
        app.label.setBounds(20, 40, 200, 20);
        frame.getContentPane().add(app.label);
        
        // set the application object to be the thing which
        // listens to the button
        butt.addActionListener(app);
        frame.setVisible(true);
    }
        public void actionPerformed(ActionEvent e) {
         
        // Ini akan dieksekusi ketika button diklik
        label.setText("Nama Saya Thalia Lively");
        }
        public static void main(String[] args) {
            // Memulai Swing GUI
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
            }
        });
    }
// Application object fields
// int clickCount=0;
JLabel label;
}