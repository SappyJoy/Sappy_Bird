package flappyBird;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {
    private static final long seralVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        FlappyBird.flappyBird.repaint(graphics);
    }
}
