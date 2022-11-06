package graphics;

/**
 * Created by oxana_bs on 11.4.2016 г..
 */

import utils.Utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Sprite {

    private SpriteSheet sheet;
    private float scale;
    private BufferedImage image;

    public Sprite(SpriteSheet sheet, float scale) {
        this.scale = scale;
        this.sheet = sheet;
        image = sheet.getSprite(0);
        image = Utils.resize(image, (int) (image.getWidth() * scale), (int) (image.getHeight() * scale));
    }

    public void render(Graphics2D g, float x, float y) {

        g.drawImage(image, (int) (x), (int) (y), null);
    }
}

