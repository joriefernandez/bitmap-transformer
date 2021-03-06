/**
 *  Reference https://www.dyclassroom.com/image-processing-project/how-to-convert-a-color-image-into-negative
 */

package cli;

import java.awt.image.BufferedImage;


public class Bitmap {

    //Image to be modified
    private static BufferedImage image;
    // Image width
    private static int width;
    //Image height
    private static int height;

    //Constructor
    public Bitmap(BufferedImage theImage){
        this.image = theImage;
        this.width = theImage.getWidth();
        this.height = theImage.getHeight();
    }

    //Method to convert to grayscale
    public static BufferedImage grayscale(){
        for(int h = 0; h < height; h++ ){
            for(int w = 0; w < width; w++){
                int rgbVal = image.getRGB(w, h);

                int alpha = getRGBValue(rgbVal, 24);
                int red = getRGBValue(rgbVal, 16);
                int green = getRGBValue(rgbVal, 8);
                int blue = getRGBValue(rgbVal, 0);

                //calculate average
                int avg = (red + green + blue)/3;

                //replace RGB value with avg
                rgbVal = setRGBValues(alpha, red, green, blue, avg);
                image.setRGB(w, h, rgbVal);
            }
        }
        return image;
    }

    //Method to blur out image
    public static BufferedImage blur(){
        for(int h = 0; h < height; h++ ){
            for(int w = 0; w < width; w++){
                int rgbVal = image.getRGB(w, h);

                int alpha = getRGBValue(rgbVal, 24);
                int red = getRGBValue(rgbVal, 16);
                int green = getRGBValue(rgbVal, 8);
                int blue = getRGBValue(rgbVal, 0);

                //calculate average
                int rand = (int)(Math.random() * 256);

                //replace RGB value with avg
                rgbVal = setRGBValues(alpha, red, green, blue, rand);
                image.setRGB(w, h, rgbVal);
            }
        }
        return image;
    }

    //Method to invert color of image
    public static BufferedImage invert(){
        for(int h = 0; h < height; h++ ){
            for(int w = 0; w < width; w++){
                int rgbVal = image.getRGB(w, h);

                int alpha = getRGBValue(rgbVal, 24);
                int red = getRGBValue(rgbVal, 16);
                int green = getRGBValue(rgbVal, 8);
                int blue = getRGBValue(rgbVal, 0);


                //replace RGB value with avg
                rgbVal = (alpha << 24) | ((255 - red) << 16) | ( (255 - green) << 8) | (255 - blue);
                image.setRGB(w, h, rgbVal);
            }
        }
        return image;
    }

    //Method to invert color of half image
    public static BufferedImage xray(){

        for(int h = 0; h < height; h++ ){

            for(int w = 0; w < width/2; w++){
                int rgbVal = image.getRGB(w, h);
                int alpha = getRGBValue(rgbVal, 24);
                int red = getRGBValue(rgbVal, 16);
                int green = getRGBValue(rgbVal, 8);
                int blue = getRGBValue(rgbVal, 0);


                //replace RGB value with avg
                rgbVal = (alpha << 24) | ((255 - red) << 16) | ( (255 - green) << 8) | (255 - blue);
                image.setRGB(w, h, rgbVal);

            }
        }
        return image;
    }



    //Return image
    public static BufferedImage getImage(){
        return image;
    }

    //Helper method to shift and get rgb values of pixel
    private static int getRGBValue(int bitSet, int numShift){
        return (bitSet >> numShift) & 0xff;
    }

    //Helper to set pixel
    private static int setRGBValues(int a, int r, int g, int b, int val){
        return (a << 24) | (val << 16) | ( val << 8) | val;
    }

}
