package game.level;

import utils.Utils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by oxana_bs on 11.4.2016 г..
 */
public class Tile {
    private BufferedImage image;
    private TileType type;

    protected Tile(BufferedImage image, int scale, TileType type) {
        this.type = type;
        this.image = Utils.resize(image, image.getWidth() * scale, image.getHeight() * scale);
    }

    protected void render(Graphics2D g, int x, int y) {
        g.drawImage(image, x, y, null);
    }

    protected TileType type() {
        return type;
    }
}
