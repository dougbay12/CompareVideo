import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by doug on 3/27/2016.
 */
public class ReadRgb {
    public static void fromImage(String imageLocation) throws Exception
    {
        File file= new File(imageLocation);
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
