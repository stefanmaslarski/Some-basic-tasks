package utils;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by oxana_bs on 11.4.2016 г..
 */
public class Utils {
    public static BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        newImage.getGraphics().drawImage(image, 0, 0, width, height, null);
        return newImage;
    }

    public static Integer[][] levelParser(String filePath) {

        Integer[][] result = null;
        try (BufferedReader reader = new BufferedReader((new FileReader(new File(filePath))))) {

            String line = null;
            List<Integer[]> lvlLines = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                lvlLines.add(convertToInt(tokens));
            }
            result = new Integer[lvlLines.size()][lvlLines.get(0).length];
            for (int i = 0; i < lvlLines.size(); i++) {
                result[i] = lvlLines.get(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static final Integer[] convertToInt(String[] inputData) {

        Integer[] result = new Integer[inputData.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(inputData[i]);
        }
        return result;
    }
}
