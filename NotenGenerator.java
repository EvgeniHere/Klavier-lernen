import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Evgeni
 */
public class NotenGenerator {
    
    static Timer timer;
    static int delayTime = 10000;
    int[] randNums = new int[4];
    int[] randNumsInUse = new int[4];
    int counter = 0;
    
    public void start(int delay, boolean newNoten) {
        delayTime = delay;
        
        if (newNoten) {
            setNewGrundNoten();
        }
        
        if (timer != null) {
            timer.cancel();
        }
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timerMethod();
            }
        }, 5000, delayTime);
    }
    
    public void setNewGrundNoten() {
        int rand1 = (int) (Math.random()*12) + 12;
        for (int i = 0; i < randNums.length; i++) {
            int rand2 = (int) (Math.random()*6);
            randNums[i] = new Note(Quintenzirkel.getHarmonicCombi(new Note(rand1).getPos()).getHarmonicCombi()[rand2]).getNum();
            randNumsInUse[i] = randNums[i];
        }
    }
    
    public ArrayList<Note> createNewNoten() {
        ArrayList<Note> noten = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            randNumsInUse[i] = randNums[i];
        }
        
        Note noteFirst = new Note(randNums[counter]);
        noten.add(noteFirst);
        
        int[] tonleiter = Tonleiter_Holder.getTonleiter();
        for (int i = 0; i < tonleiter.length; i++) {
            randNumsInUse[counter] -= tonleiter[i];
            Note note = new Note(randNumsInUse[counter]);
            noten.add(note);
        }
        //Collections.shuffle(noten);
        SoundHandler.startSounds(noten, delayTime);
        
        if (counter < 3) {
            counter++;
        } else {
            counter = 0;
        }
        return noten;
    }
    
    public void setDelayTime(int delay) {
        delayTime = delay;
        if (timer != null) {
            timer.cancel();
            start(delay, false);
        }
    }
    
    public void timerMethod() {
        Panel.notenBlatt_Panel1.setNewNoten(createNewNoten());
        if (delayTime > 100) {
            delayTime -= 20;
        }
    }
}