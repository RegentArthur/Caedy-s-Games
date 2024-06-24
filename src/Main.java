import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createGUI());

    }
    private static void createGUI(){
        Window snakeWindow = new SnakeWindow();


        //Window testWindow = new Window();
        //testWindow.window.setUndecorated(true);
        //testWindow.window.setBackground(new Color(0, 0, 0, 0));
        //testWindow.window.setVisible(true);
    }
}