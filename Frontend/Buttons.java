package Frontend;

import javax.swing.*;
import java.awt.*;

// This class is used to create the buttons in InitialBoard, they include hint, restart, close
// The reason of create this class, instead of adding the buttons directly in InitialBoard, is to prevent disalignment
// between the buttons and BlackTokenRemain label
public class Buttons extends JPanel {
    BtnHint btnHint = new BtnHint();
    BtnRestart btnRestart = new BtnRestart();
    BtnClose btnClose = new BtnClose();
    public Buttons(){
        this.setOpaque(false); // set the background of this panel transparent

        this.setLayout(new GridBagLayout()); // set the layout of this panel
        GridBagConstraints gbc = new GridBagConstraints(); // create a GridBagConstraint object
        gbc.insets = new Insets(5, 5, 5, 5); // add gaps between the components

        gbc.gridx = 3; // set the x position of the component
        gbc.gridy = 0; // set the y position of the component
        gbc.weightx = 1; //horizontal spacing (use values from 0.0 to 1.0)
        gbc.weighty = 0; //vertical spacing
        gbc.anchor = GridBagConstraints.NORTHEAST; // set the position of the component
        this.add(btnHint, gbc); // add the component to this panel

        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        this.add(btnRestart, gbc);

        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        this.add(btnClose, gbc);
    }
}