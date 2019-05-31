package cli;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class BitMapTest {

    /**** TEST GRAYSCALE TRANSFORMATION ******/

    @Test
    public void testBitMapGrayscaleWidth() throws IOException{

        BufferedImage inputImage = ImageIO.read(new File("src/main/resources/in.bmp"));
        Bitmap bMap = new Bitmap(inputImage);
        assertEquals("Width should be the same.", inputImage.getWidth(),bMap.grayscale().getWidth());
    }

    @Test
    public void testBitMapGrayscaleHeight() throws IOException{

        BufferedImage inputImage = ImageIO.read(new File("src/main/resources/in.bmp"));
        Bitmap bMap = new Bitmap(inputImage);
        assertEquals("Width should be the same.", inputImage.getHeight(),bMap.grayscale().getHeight());
    }

    /**** TEST BLUR TRANSFORMATION ******/

    @Test
    public void testBitMapBlurWidth() throws IOException{

        BufferedImage inputImage = ImageIO.read(new File("src/main/resources/in.bmp"));
        Bitmap bMap = new Bitmap(inputImage);
        assertEquals("Width should be the same.", inputImage.getWidth(),bMap.blur().getWidth());
    }

    @Test
    public void testBitMapBlurHeight() throws IOException{

        BufferedImage inputImage = ImageIO.read(new File("src/main/resources/in.bmp"));
        Bitmap bMap = new Bitmap(inputImage);
        assertEquals("Width should be the same.", inputImage.getHeight(),bMap.blur().getHeight());
    }


    /**** TEST INVERT TRANSFORMATION ******/

    @Test
    public void testBitMapInvertWidth() throws IOException{

        BufferedImage inputImage = ImageIO.read(new File("src/main/resources/in.bmp"));
        Bitmap bMap = new Bitmap(inputImage);
        assertEquals("Width should be the same.", inputImage.getWidth(),bMap.invert().getWidth());
    }

    @Test
    public void testBitMapInvertHeight() throws IOException{

        BufferedImage inputImage = ImageIO.read(new File("src/main/resources/in.bmp"));
        Bitmap bMap = new Bitmap(inputImage);
        assertEquals("Width should be the same.", inputImage.getHeight(),bMap.invert().getHeight());
    }

    /**** TEST XRAY TRANSFORMATION ******/

    @Test
    public void testBitMapXrayWidth() throws IOException{

        BufferedImage inputImage = ImageIO.read(new File("src/main/resources/in.bmp"));
        Bitmap bMap = new Bitmap(inputImage);
        assertEquals("Width should be the same.", inputImage.getWidth(),bMap.xray().getWidth());
    }

    @Test
    public void testBitMapXrayHeight() throws IOException{

        BufferedImage inputImage = ImageIO.read(new File("src/main/resources/in.bmp"));
        Bitmap bMap = new Bitmap(inputImage);
        assertEquals("Width should be the same.", inputImage.getHeight(),bMap.xray().getHeight());
    }

}
