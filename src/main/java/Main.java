import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by doug on 3/27/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
            File file= new File("C:\\Users\\doug\\Desktop\\dev\\png\\image-189.png");
            BufferedImage image = ImageIO.read(file);
            int totalheight = image.getHeight();
            int totalwidth = image.getWidth();
            int pixelnumber = 0;
            int  red = 0;
            int  green = 0;
            int  blue = 0;
            int clr = 0;
            String friendly;
            for (int w = 0; w < image.getWidth(); w++)
            {
                for (int h = 0; h < image.getHeight(); h++) {
                    friendly = "h"+Integer.toString(h)+"w"+Integer.toString(w);
                    clr =  image.getRGB(w,h);
                    red   = (clr & 0x00ff0000) >> 16;
                    green = (clr & 0x0000ff00) >> 8;
                    blue  =  clr & 0x000000ff;

                }
            }
            int lastRed = red;
            int lastGreen = green;
            int lastBlue = blue;
            String tmp = "tmp";
    }
}

