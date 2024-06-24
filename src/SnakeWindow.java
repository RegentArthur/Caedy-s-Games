import javax.swing.*;
import java.awt.*;

public class SnakeWindow extends Window{
    public static int gridWidth = 17; //needs to be odd if you want the checkerboard colors
    public static int gridLength = 15;
    public static int gridPixelWidth = 33;
    public SnakeWindow(){
        super();
        setUpField();

        //bunch of window visual/setting stuff
        window.getContentPane().setPreferredSize(new Dimension(gridPixelWidth*(gridWidth+2),
                gridPixelWidth*(gridLength+4)));
        window.pack(); //Idk if this actually does anything
        window.setResizable(false);
        window.setTitle(title);
        window.setVisible(true);
    }
    private void setUpField(){
        //Create the top horizontal bar for the stats and menu
        JPanel topBar = new JPanel(new GridBagLayout());
        topBar.setBackground(new Color (27,34,44));
        topBar.setPreferredSize(new Dimension(450, gridPixelWidth*2 )); // I don't think the width value matters
        topBar.setBorder(null); // this might not do anything
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST; // Align components to the left
        gbc.gridx = 0; // I'm not even sure if the following four lines do anything
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.VERTICAL; // centers the text vertically
        gbc.insets = new Insets(0, 40, 0, 0);
        JLabel scoreLabel = new JLabel("Cutie :)");
        topBar.add(scoreLabel, gbc);
        scoreLabel.setForeground(Color.white);
        scoreLabel.setFont(new Font("Serif", Font.ITALIC, 20) );
        window.add(topBar, BorderLayout.NORTH);

        //create the grid of squares and its border
        JPanel grid = new JPanel(new GridLayout(gridLength,gridWidth, 0, 0));
        //I'm messing with the sizing a lot in order to make it look good, so much of this set size stuff is useless
        grid.setSize(new Dimension(gridPixelWidth*gridWidth,gridPixelWidth*gridLength));
        for(int i = 0; i < gridWidth*gridLength; i++){
            JPanel cell = new JPanel();
            cell.setSize(new Dimension(gridPixelWidth, gridPixelWidth)); // I'm not sure the difference between setSize and setPreferredSize
            if(i%2 ==0){
                //Feel free to mess with all the colors, I just tried to make it a black and red palette
                cell.setBackground(new Color(102,27,28));
            } else {
                cell.setBackground(new Color(83,21,22));
            }
            grid.add(cell);
        }
        //create buffer border
        grid.setBorder(BorderFactory.createLineBorder(new Color(18,21,28), 33));
        window.add(grid, BorderLayout.CENTER);

    }
    static String title = "Hiii Princess";
}
