import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    public MainFrame() {
        init();
    }


    public void init() {
           this.setBounds(100,100,50,80);
           this.addWindowListener(new WindowAdapter() {
               @Override
               public void windowClosing(WindowEvent e) {
                   super.windowClosing(e);
                   System.exit(0);
               }
           });
    }
}
