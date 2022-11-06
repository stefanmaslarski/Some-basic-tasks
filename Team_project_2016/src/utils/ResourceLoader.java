package utils;

/**
 * Created by oxana_bs on 11.4.2016 г..
 */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResourceLoader {

    public static final String	PATH	= "res/";

    public static BufferedImage loadImage(String fileName) {

        BufferedImage image = null;

        try {

            image = ImageIO.read(new File(PATH + fileName));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;

    }

}