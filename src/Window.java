import javax.swing.*;
public class Window {
    public JFrame window;
    public Window(){
        this.window =  new JFrame();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 500);
        window.setResizable(true);
        window.setLocationRelativeTo(null);

    }
    public void setTitle(String title){
        window.setTitle(title);
    }
}
