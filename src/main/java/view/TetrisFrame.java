package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.List;

public class TetrisFrame extends JFrame {

    private static final int X_POSITION = 400;
    private static final int Y_POSITION = 100;
    private static final Dimension SCREEN = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int FRAME_WIDTH = (int) (SCREEN.width*0.27);
    private static int FRAME_HEIGHT = (int) (SCREEN.height*0.57);

    public TetrisFrame(List<JPanel> panels, KeyListener keyListener){
        setLayout(null);
        setBounds(X_POSITION,Y_POSITION,FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setVisible(true);
        panels.forEach(panel -> add(panel));
        addKeyListener(keyListener);

    }
}
