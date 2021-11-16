package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class PlayerInfoArea  extends JPanel {
    private String HP = "Health: ";
    private String Str = "Strength: ";
    private String Position = "Position: ";

    private JLabel playerHP;
    private JLabel playerStr;
    private JLabel playerPosition;

    public PlayerInfoArea() {
        setLayout(new GridLayout(4,1));
        playerHP = new JLabel(HP + "_");
        playerStr = new JLabel(Str + "_");
        playerPosition = new JLabel(Position + "_:_");

        add(new JLabel("**** Player Information ****", SwingConstants.CENTER));
        add(playerHP);
        add(playerStr);
        add(playerPosition);
    }

}
