import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Evgeni
 */
public class Note {
    
    int num;
    String pos;
    int lineNum;
    AudioInputStream audio;
    
    public Note(int number) {
        num = number;
        setPos(num);
        try {
            audio = AudioSystem.getAudioInputStream(this.getClass().getResource("/PianoKeys/" + getPos() + ".wav"));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setPos(int num) {
        boolean higher = false;
        if (num < 12) {
            num += 12;
            higher = true;
        }
        switch(num) {
            case 12:
                pos = "h";
                lineNum = 6;
                break;
            case 13:
                pos = "ais";
                lineNum = 7;
                break;
            case 14:
                pos = "a";
                lineNum = 7;
                break;
            case 15:
                pos = "gis";
                lineNum = 8;
                break;
            case 16:
                pos = "g";
                lineNum = 8;
                break;
            case 17:
                pos = "fis";
                lineNum = 9;
                break;
            case 18:
                pos = "f";
                lineNum = 9;
                break;
            case 19:
                pos = "e";
                lineNum = 10;
                break;
            case 20:
                pos = "dis";
                lineNum = 11;
                break;
            case 21:
                pos = "d";
                lineNum = 11;
                break;
            case 22:
                pos = "cis";
                lineNum = 12;
                break;
            case 23:
                pos = "c";
                lineNum = 12;
                break;
        }
        if (higher) {
            num -= 12;
            pos += '2';
            lineNum -= 7;
        }
    }
    
    public int getLineNum() {
        return lineNum;
    }
    
    public Note(String position) {
        pos = position;
        boolean higher = false;
        if (pos.contains("2")) {
            pos = pos.substring(0, pos.length() - 1);
            higher = true;
        }
        switch(pos) {
            case "c":
                num = 23;
                lineNum = 12;
                break;
            case "cis":
                num = 22;
                lineNum = 12;
                break;
            case "d":
                num = 21;
                lineNum = 11;
                break;
            case "dis":
                num = 20;
                lineNum = 11;
                break;
            case "e":
                num = 19;
                lineNum = 10;
                break;
            case "f":
                num = 18;
                lineNum = 9;
                break;
            case "fis":
                num = 17;
                lineNum = 9;
                break;
            case "g":
                num = 16;
                lineNum = 8;
                break;
            case "gis":
                num = 15;
                lineNum = 8;
                break;
            case "a":
                num = 14;
                lineNum = 7;
                break;
            case "ais":
                num = 13;
                lineNum = 7;
                break;
            case "h":
                num = 12;
                lineNum = 6;
                break;
            default:
                num = -1;
                break;
        }
        if (higher) {
            num -= 12;
            pos += '2';
            lineNum -= 7;
        }
    }
    
    public int getNum() {
        return this.num;
    }
    
    public String getPos() {
        return this.pos;
    }
    
    public AudioInputStream getSound() {
        return audio;
    }
}