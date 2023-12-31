package Frontend.Button;

import Frontend.Utils.IconProcessor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to create the hint button in the game, which is used to give the player a hint.
 */

public class BtnHint extends JButton {
    /**
     * The image icon of hint button.
     */
    private ImageIcon iconHint;
    /**
     * A boolean to check if the hint button is enabled.
     */
    private boolean enabledHint = false;

    /**
     * Constructor.
     * Creates a hint button in the game.
     */
    public BtnHint(){
        this.setFocusable(false); // get rid of the annoying box in button
        this.iconHint = new ImageIcon(getClass().getResource("/Icons/hint.png"));

        // Resize the icon
        IconProcessor icon = new IconProcessor(iconHint, 60, 60);
        ImageIcon resizedIcon = icon.resizeIcon();
        this.setIcon(resizedIcon); // set the image of hint button

        this.setBackground(new Color(0xE6B380)); // set the background color of hint button
        this.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK)); // set the border of hint button

//        this.addActionListener(new ActionListener() {
//            /**
//             * When the 'enabled' hint button is clicked, the hint button will be showed 'disabled'.
//             * When the 'disabled' hint button is clicked, the hint button will be showed 'enabled'.
//             *
//             * @param e the event to be processed
//             */
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (!enabledHint) {
//                    iconHint = new ImageIcon(getClass().getResource("/Icons/disabled-hint.png"));
//
//                    // Resize the icon
//                    IconProcessor icon = new IconProcessor(iconHint, 60, 60);
//                    ImageIcon resizedIcon = icon.resizeIcon();
//                    setIcon(resizedIcon); // set the image of disabled hint button
//
//                    enabledHint = true;
//                }
//                else {
//                    iconHint = new ImageIcon(getClass().getResource("/Icons/hint.png"));
//
//                    // Resize the icon
//                    IconProcessor icon = new IconProcessor(iconHint, 60, 60);
//                    ImageIcon resizedIcon = icon.resizeIcon();
//                    setIcon(resizedIcon); // set the image of enabled hint button
//
//                    enabledHint = false;
//                }
//            }
//        });
    }

    /**
     * Getter for the enabledHint.
     * @return a boolean value whether the hint button is enabled or not.
     */
    public boolean getEnabledHint() {
        return enabledHint;
    }

    /**
     * Setter for the enabledHint.
     * @param enabledHint
     */
    public void setEnabledHint(boolean enabledHint) {
        this.enabledHint = enabledHint;
    }
}
