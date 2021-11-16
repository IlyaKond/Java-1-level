package GuiApp.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 10.11.2021
 */

public class GameInfoArea  extends JPanel {
    private String textEnemyCount = "How much Enemies: ";
    private String textLevel = "Level: ";
    private String textSizeMap = "Size map: ";

    private JLabel enemyCount;
    private JLabel levelGame;
    private JLabel sizeMap;

    public GameInfoArea() {
        setLayout(new GridLayout(4,1));

        enemyCount = new JLabel(textEnemyCount + "_");
        levelGame = new JLabel(textLevel + "_");
        sizeMap = new JLabel(textSizeMap + "_:_");

        add(new JLabel("**** Game Information ****", SwingConstants.CENTER));
        add(enemyCount);
        add(levelGame);
        add(sizeMap);
    }
}
