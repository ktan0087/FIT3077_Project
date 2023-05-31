package Frontend.Game;

import Frontend.Button.BtnClose;
import Frontend.Button.BtnNext;
import Frontend.IconProcessor;
import Frontend.Size;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tutorial extends JPanel{
    private int nextCount;
    private BtnNext btnNext;
    protected BtnClose btnClose;
    private InitialBoard initialBoard;
    private JPanel dimLayer;
    private JPanel background;
    public Tutorial(){
        this.nextCount = 0;
        this.btnClose = new BtnClose();
        this.btnNext = new BtnNext();
        this.initialBoard = new InitialBoard();
        this.dimLayer = createDimLayer();

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        Size gapSize = new Size(10, 25);
        gbc.insets = new Insets(gapSize.getHeight(), gapSize.getWidth(), gapSize.getHeight(), gapSize.getWidth()); // add gaps between the components

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        this.add(this.btnClose, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        this.add(this.btnNext, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(createWelcomeMessage(), gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        this.background = createBackground();
        this.add(this.background, gbc);

        this.btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextCount++;
                checkNext(gbc);
                repaint();
                revalidate();
            }
        });
    }

    private void checkNext(GridBagConstraints gbc){
        JLabel intro = introPage(gbc);
        if (this.nextCount == 1){
            this.remove(2); // remove welcome message
            intro.setText("Place Token");
            this.setComponentZOrder(intro, 2);
        }
        else if (this.nextCount == 2){
            this.remove(2); // remove intro page
            this.background.remove(this.dimLayer);
            this.initialBoard.board.getIntersectionList().get(0).inter.isEnabled();
            JLabel instruction = createInstruction(450, 80);
            instruction.setText("Click to place a token");

//            Size instructionLocation = new Size(125, 165);
//            gbc.insets = new Insets(instructionLocation.getHeight(), instructionLocation.getWidth(), instructionLocation.getHeight(), instructionLocation.getWidth());
//
//            gbc.gridx = 0;
//            gbc.gridy = 0;
//            gbc.weightx = 0;
//            gbc.weighty = 0;
//            gbc.anchor = GridBagConstraints.NORTHEAST;
//            gbc.fill = GridBagConstraints.NONE;
//            this.add(instruction, gbc);
//            this.setComponentZOrder(instruction, 2);
//
//            Size clickLocation = new Size(540, 258);
//            gbc.insets = new Insets(clickLocation.getHeight(), clickLocation.getWidth(), clickLocation.getHeight(), clickLocation.getWidth());
//
//            gbc.gridx = 0;
//            gbc.gridy = 0;
//            gbc.weightx = 0;
//            gbc.weighty = 0;
//            gbc.anchor = GridBagConstraints.NORTHEAST;
//            gbc.fill = GridBagConstraints.NONE;
//            JLabel click = createClickHint();
//            this.add(click, gbc);
//            this.setComponentZOrder(click, 2);
        }
        else if (this.nextCount == 5){
            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 3))));
            this.initialBoard.placeToken.add(new BlackToken(1, 3, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 3))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 2))));
            this.initialBoard.placeToken.add(new BlackToken(2, 2, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 2))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 1))));
            this.initialBoard.placeToken.add(new BlackToken(3, 1, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 1))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 3))));
            this.initialBoard.placeToken.add(new WhiteToken(2, 3, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 3))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 8))));
            this.initialBoard.placeToken.add(new WhiteToken(1, 8, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 8))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 8))));
            this.initialBoard.placeToken.add(new BlackToken(2, 8, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 8))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 8))));
            this.initialBoard.placeToken.add(new BlackToken(3, 8, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 8))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 4))));
            this.initialBoard.placeToken.add(new WhiteToken(3, 4, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 4))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 4))));
            this.initialBoard.placeToken.add(new BlackToken(2, 4, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 4))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 4))));
            this.initialBoard.placeToken.add(new WhiteToken(1, 4, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 4))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 7))));
            this.initialBoard.placeToken.add(new WhiteToken(3, 7, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 7))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 6))));
            this.initialBoard.placeToken.add(new WhiteToken(2, 6, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 6))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 5))));
            this.initialBoard.placeToken.add(new BlackToken(3, 5, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(3, 5))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 5))));
            this.initialBoard.placeToken.add(new BlackToken(2, 5, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(2, 5))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 7))));
            this.initialBoard.placeToken.add(new BlackToken(1, 7, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 7))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 6))));
            this.initialBoard.placeToken.add(new WhiteToken(1, 6, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 6))));

            this.initialBoard.placeToken.remove(Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 5))));
            this.initialBoard.placeToken.add(new WhiteToken(1, 5, this.initialBoard), Integer.parseInt(String.valueOf(this.initialBoard.board.getIndexLookUpTable(1, 5))));
        }
        else if (this.nextCount == 6){
            this.background.add(this.dimLayer);
            this.background.setComponentZOrder(this.dimLayer, 0);
            intro.setText("Move Token");
            this.setComponentZOrder(intro, 2);
        }
        else if (this.nextCount == 9){
            this.background.add(this.dimLayer);
            this.background.setComponentZOrder(this.dimLayer, 0);
            intro.setText("Remove Token");
            this.setComponentZOrder(intro, 2);
        }
        else if (this.nextCount == 13){
            this.background.add(this.dimLayer);
            this.background.setComponentZOrder(this.dimLayer, 0);
            intro.setText("Fly Token");
            this.setComponentZOrder(intro, 2);
        }
        else if (this.nextCount == 17){
            this.background.add(this.dimLayer);
            this.background.setComponentZOrder(this.dimLayer, 0);
            intro.setText("MWin Condition");
            this.setComponentZOrder(intro, 2);
        }
        else if (this.nextCount == 20){
            this.background.add(this.dimLayer);
            this.background.setComponentZOrder(this.dimLayer, 0);
            intro.setText("Button: Hint");
            this.setComponentZOrder(intro, 2);
        }
        else if (this.nextCount == 25){
            this.background.add(this.dimLayer);
            this.background.setComponentZOrder(this.dimLayer, 0);
            intro.setText("Button: Restart");
            this.setComponentZOrder(intro, 2);
        }
        else if (this.nextCount == 28){
            this.background.add(this.dimLayer);
            this.background.setComponentZOrder(this.dimLayer, 0);
            intro.setText("You are ready to play!");
            this.setComponentZOrder(intro, 2);
        }
        else if (this.nextCount == 29){
            this.remove(2); // remove intro page
            this.remove(1); // remove next button
            this.background.remove(this.dimLayer);
        }
    }

    private JPanel createBackground(){
        JPanel background = new JPanel(){
            @Override
            public boolean isOptimizedDrawingEnabled(){
                return false;
            }
        };
        background.setLayout(new OverlayLayout(background));

        this.initialBoard.setEnabled(false); // make buttons enabled

        background.add(this.dimLayer);
        background.add(this.initialBoard);

        return background;
    }

    private JPanel createDimLayer(){
        JPanel dimLayer = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
            g.setColor(new Color(0x80000000, true));
            g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        dimLayer.setOpaque(false);
        dimLayer.setVisible(true);
        return dimLayer;
    }

    private JPanel createWelcomeMessage(){
        JLabel welcome = new JLabel();
        welcome.setText("Welcome to the tutorial");
        welcome.setFont(new Font("Inter", Font.PLAIN, new Size(42, 42).getHeight()));
        welcome.setBackground(new Color(0xF4E3D3));
        welcome.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(0xE27408)));
        welcome.setHorizontalAlignment(JLabel.CENTER);
        welcome.setOpaque(true);

        JLabel message = new JLabel();
        message.setText("You are ");
        message.setFont(new Font("Inter", Font.PLAIN, new Size(42, 42).getHeight()));
        message.setBackground(new Color(0xF4E3D3));
        message.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(0xE27408)));
        message.setOpaque(true);

        ImageIcon whiteToken = new ImageIcon(Tutorial.class.getResource("/Icons/white-token.png"));
        IconProcessor icon = new IconProcessor(whiteToken, 68, 68);
        ImageIcon resizedIcon = icon.resizeIcon();

        Size size = new Size(500, 110);
        welcome.setPreferredSize(new Dimension(size.getWidth(), size.getHeight()));
        message.setPreferredSize(new Dimension(size.getWidth(), size.getHeight()));

        message.setIcon(resizedIcon);
        message.setHorizontalTextPosition(JLabel.LEFT);
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setIconTextGap(45); // set the distance between text and icon

        JPanel welcomeMessage = new JPanel();
        welcomeMessage.setOpaque(false);
        welcomeMessage.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        Size gapSize = new Size(25, 25);
        gbc.insets = new Insets(gapSize.getHeight(), gapSize.getWidth(), gapSize.getHeight(), gapSize.getWidth()); // add gaps between the components

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        welcomeMessage.add(welcome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        welcomeMessage.add(message, gbc);

        return welcomeMessage;
    }

    private JLabel introPage(GridBagConstraints gbc){
        JLabel intro = new JLabel();
        intro.setFont(new Font("Inter", Font.PLAIN, new Size(42, 42).getHeight()));
        intro.setBackground(new Color(0xF4E3D3));
        intro.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(0xE27408)));
        intro.setHorizontalAlignment(JLabel.CENTER);
        intro.setOpaque(true);

        Size size = new Size(500, 110);
        intro.setPreferredSize(new Dimension(size.getWidth(), size.getHeight()));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        this.add(intro, gbc);

        return intro;
    }

    private JLabel createInstruction(int width, int height){
        JLabel instruction = new JLabel();
        instruction.setFont(new Font("Inter", Font.PLAIN, new Size(36, 36).getHeight()));
        instruction.setBackground(new Color(0xF4E3D3));
        instruction.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(0xFF0000)));
        instruction.setHorizontalAlignment(JLabel.CENTER);
        instruction.setOpaque(true);

        Size size = new Size(width, height);
        instruction.setPreferredSize(new Dimension(size.getWidth(), size.getHeight()));

        return instruction;
    }

    private JLabel createClickHint(){
        JLabel clickHint = new JLabel();
        clickHint.setOpaque(false);

        ImageIcon click = new ImageIcon(Tutorial.class.getResource("/Icons/click.png"));
        IconProcessor clickIcon = new IconProcessor(click, 48, 48);
        ImageIcon resizedIcon = clickIcon.resizeIcon();

        clickHint.setIcon(resizedIcon);
        Timer timer = new Timer(500, new ActionListener() {
            Boolean clickVisible = false;
            @Override
            public void actionPerformed(ActionEvent e) {
                clickVisible = !clickVisible;
                repaint();
            }
        });
        timer.start();

        return clickHint;
    }

}