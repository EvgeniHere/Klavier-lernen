import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Evgeni
 */
public class Key {
    
    Type type;
    BufferedImage image;
    public int x, y;
    public int width, height;
    
    public Key(Type type, int x, int y, int width, int height) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        
        try {
            image = ImageIO.read(this.getClass().getResource("/PianoKeys/Keys/" + type.toString() + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(Key.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    enum Type {
        VIOLIN, BASS, TENOR
    }
    
    public Type getType() {
        return type;
    }
    
    public BufferedImage getImg() {
        return image;
    }
}
