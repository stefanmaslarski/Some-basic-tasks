package graphics;

/**
 * Created by oxana_bs on 11.4.2016 г..
 */
import java.awt.image.BufferedImage;

import utils.ResourceLoader;

public class TextureAtlas {

    BufferedImage	image;

    public TextureAtlas(String imageName) {
        image = ResourceLoader.loadImage(imageName);
    }

    public BufferedImage cut(int x, int y, int w, int h) {
        return image.getSubimage(x, y, w, h);
    }

}
