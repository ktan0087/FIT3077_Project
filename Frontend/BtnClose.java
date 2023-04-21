package Frontend;

import javax.swing.*;
import java.awt.*;

// Customized button for exit the game
public class BtnClose extends JButton {
    public BtnClose(){
        this.setFocusable(false); // get rid of the annoying box in button
        ImageIcon iconClose = new ImageIcon("Icons/close.png"); // import the image of close button
        this.setIcon(iconClose); // set the image of close button
        this.setBackground(new Color(0xE6B380)); // set the background color of close button
        this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK)); // set the border of close button
    }
}