import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Evgeni
 */
public class SoundHandler {
    
    static int i = 0;
    
    public static void startSounds(ArrayList<Note> noten, int delayTime) {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                if (i < noten.size()) {
                    try {
                        if (Keys_Holder.getKey().getType() == Key.Type.BASS) {
                            noten.get(i).setPos(noten.get(i).getNum()+4);
                        } else if (Keys_Holder.getKey().getType() == Key.Type.TENOR) {
                            noten.get(i).setPos(noten.get(i).getNum()-2);
                        }
                        AudioInputStream audio = noten.get(i).getSound();
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    i++;
                } else {
                    i = 0;
                    t.cancel();
                }
            }
        }, 0, delayTime / (noten.size()+1));
    }
}
