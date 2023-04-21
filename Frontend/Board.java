package Frontend;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

// Used to display the board
public class Board extends JPanel {
    // Create 24 intersections
    Intersection intersection_11 = new Intersection(1, 1);
    Intersection intersection_12 = new Intersection(1, 2);
    Intersection intersection_13 = new Intersection(1, 3);
    Intersection intersection_21 = new Intersection(2, 1);
    Intersection intersection_22 = new Intersection(2, 2);
    Intersection intersection_23 = new Intersection(2,3);
    Intersection intersection_31 = new Intersection(3,1);
    Intersection intersection_32 = new Intersection(3,2);
    Intersection intersection_33 = new Intersection(3,3);
    Intersection intersection_18 = new Intersection(1,8);
    Intersection intersection_28 = new Intersection(2,8);
    Intersection intersection_38 = new Intersection(3,8);
    Intersection intersection_34 = new Intersection(3,4);
    Intersection intersection_24 = new Intersection(2,4);
    Intersection intersection_14 = new Intersection(1,4);
    Intersection intersection_37 = new Intersection(3,7);
    Intersection intersection_36 = new Intersection(3,6);
    Intersection intersection_35 = new Intersection(3,5);
    Intersection intersection_27 = new Intersection(2,7);
    Intersection intersection_26 = new Intersection(2,6);
    Intersection intersection_25 = new Intersection(2,5);
    Intersection intersection_17 = new Intersection(1,7);
    Intersection intersection_16 = new Intersection(1,6);
    Intersection intersection_15 = new Intersection(1,5);

    ArrayList<Intersection> intersectionList=new ArrayList<>(); // create a list to store intersections

    public List<Intersection> getIntersectionList() {
        // Add all intersections to the list
        intersectionList.add(intersection_11);
        intersectionList.add(intersection_12);
        intersectionList.add(intersection_13);
        intersectionList.add(intersection_21);
        intersectionList.add(intersection_22);
        intersectionList.add(intersection_23);
        intersectionList.add(intersection_31);
        intersectionList.add(intersection_32);
        intersectionList.add(intersection_33);
        intersectionList.add(intersection_18);
        intersectionList.add(intersection_28);
        intersectionList.add(intersection_38);
        intersectionList.add(intersection_34);
        intersectionList.add(intersection_24);
        intersectionList.add(intersection_14);
        intersectionList.add(intersection_37);
        intersectionList.add(intersection_36);
        intersectionList.add(intersection_35);
        intersectionList.add(intersection_27);
        intersectionList.add(intersection_26);
        intersectionList.add(intersection_25);
        intersectionList.add(intersection_17);
        intersectionList.add(intersection_16);
        intersectionList.add(intersection_15);

        return this.intersectionList;
    }

    public Board(){
        this.setBackground(new Color(0xE6B380)); // set the background color of the board
        this.setPreferredSize(new Dimension(500,500)); // set the size of the board

        // set the layout of the board, 13 rows and 13 columns
        this.setLayout(new GridLayout(13, 13, -1, -1)); // -1 is to remove the space between intersections and lines

        // Add all intersections and lines to the board
        intersection_11.choosePosition(Intersection.Position.TOP_LEFT);
        this.add(intersection_11);
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        intersection_12.choosePosition(Intersection.Position.TOP_MIDDLE);
        this.add(intersection_12);
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        intersection_13.choosePosition(Intersection.Position.TOP_RIGHT);
        this.add(intersection_13);

        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());

        this.add(new VerticalLine());
        this.add(new JLabel());
        intersection_21.choosePosition(Intersection.Position.TOP_LEFT);
        this.add(intersection_21);
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        intersection_22.choosePosition(Intersection.Position.MIDDLE);
        this.add(intersection_22);
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        intersection_23.choosePosition(Intersection.Position.TOP_RIGHT);
        this.add(intersection_23);
        this.add(new JLabel());
        this.add(new VerticalLine());

        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());

        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        intersection_31.choosePosition(Intersection.Position.TOP_LEFT);
        this.add(intersection_31);
        this.add(new HorizontalLine());
        intersection_32.choosePosition(Intersection.Position.BOTTOM_MIDDLE);
        this.add(intersection_32);
        this.add(new HorizontalLine());
        intersection_33.choosePosition(Intersection.Position.TOP_RIGHT);
        this.add(intersection_33);
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());

        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());

        intersection_18.choosePosition(Intersection.Position.MIDDLE_LEFT);
        this.add(intersection_18);
        this.add(new HorizontalLine());
        intersection_28.choosePosition(Intersection.Position.MIDDLE);
        this.add(intersection_28);
        this.add(new HorizontalLine());
        intersection_38.choosePosition(Intersection.Position.MIDDLE_RIGHT);
        this.add(intersection_38);
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        intersection_34.choosePosition(Intersection.Position.MIDDLE_LEFT);
        this.add(intersection_34);
        this.add(new HorizontalLine());
        intersection_24.choosePosition(Intersection.Position.MIDDLE);
        this.add(intersection_24);
        this.add(new HorizontalLine());
        intersection_14.choosePosition(Intersection.Position.MIDDLE_RIGHT);
        this.add(intersection_14);

        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());

        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        intersection_37.choosePosition(Intersection.Position.BOTTOM_LEFT);
        this.add(intersection_37);
        this.add(new HorizontalLine());
        intersection_36.choosePosition(Intersection.Position.TOP_MIDDLE);
        this.add(intersection_36);
        this.add(new HorizontalLine());
        intersection_35.choosePosition(Intersection.Position.BOTTOM_RIGHT);
        this.add(intersection_35);
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());

        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new VerticalLine());

        this.add(new VerticalLine());
        this.add(new JLabel());
        intersection_27.choosePosition(Intersection.Position.BOTTOM_LEFT);
        this.add(intersection_27);
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        intersection_26.choosePosition(Intersection.Position.MIDDLE);
        this.add(intersection_26);
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        intersection_25.choosePosition(Intersection.Position.BOTTOM_RIGHT);
        this.add(intersection_25);
        this.add(new JLabel());
        this.add(new VerticalLine());

        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new VerticalLine());

        intersection_17.choosePosition(Intersection.Position.BOTTOM_LEFT);
        this.add(intersection_17);
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        intersection_16.choosePosition(Intersection.Position.BOTTOM_MIDDLE);
        this.add(intersection_16);
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        this.add(new HorizontalLine());
        intersection_15.choosePosition(Intersection.Position.BOTTOM_RIGHT);
        this.add(intersection_15);

    }

    // get the index of intersection in the panel (from 0 to 168)
    public int getIntersectionPanelIndex(Intersection intersection) {
        return intersection.getAccessibleContext().getAccessibleIndexInParent();
    }

}