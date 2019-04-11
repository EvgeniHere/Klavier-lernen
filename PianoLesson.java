import java.io.File;

/**
 *
 * @author Evgeni
 */
public class PianoLesson {

    static String path;
    
    public static void main(String[] args) {
        File currDir = new File(".");
        path = currDir.getAbsolutePath();
        path = path.substring(0, path.length()-1);
        
        Quintenzirkel qz = new Quintenzirkel();
        Keys_Holder keys_Holder = new Keys_Holder();
        Tonleiter_Holder tonleiter_Holder = new Tonleiter_Holder();
        
        Frame f = new Frame();
        f.setVisible(true);
    }
}