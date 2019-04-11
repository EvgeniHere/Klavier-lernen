import java.io.File;

/**
 *
 * @author Evgeni
 */
public class PianoLesson {

    static String path;
    
    public static void main(String[] args) {
        Quintenzirkel qz = new Quintenzirkel();
        Keys_Holder keys_Holder = new Keys_Holder();
        Tonleiter_Holder tonleiter_Holder = new Tonleiter_Holder();
        
        Frame f = new Frame();
        f.setVisible(true);
    }
}
