package GuiApp.windowParts.guiParts;

import GuiApp.windowParts.GuiPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class PlayerControlArea extends JPanel {

    private JButton btnMoveUp;
    private JButton btnMoveLeft;
    private JButton btnMoveRight;
    private JButton btnMoveDown;

    public PlayerControlArea() {


        setLayout(new GridLayout(2,3));

        btnMoveUp = new JButton("Up");
        btnMoveLeft = new JButton("Left");
        btnMoveRight = new JButton("Right");
        btnMoveDown = new JButton("Down");
        add(new JPanel());
        add(btnMoveUp);
        add(new JPanel());
        add(btnMoveLeft);
        add(btnMoveDown);
        add(btnMoveRight);
}}
