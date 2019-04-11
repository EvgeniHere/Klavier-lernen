import java.util.ArrayList;

/**
 *
 * @author Evgeni
 */
public class Tonleiter_Holder {
    
    static ArrayList<Tonleiter> tonleiter = new ArrayList<>();
    static int[] dur = {4, 3, 5};
    static int[] maj7 = {4, 3, 4};
    static int[] n7 = {4, 3, 3};
    static int[] m = {3, 4, 5};
    static int[] m7 = {3, 4, 3};
    static int[] plus = {4, 4, 4};
    static int[] dim = {3, 3, 6};
    static int[] sus4 = {5, 2};
    static int[] n4 = {4, 1, 2};
    static int[] n6 = {4, 3, 2};
    static int[] m_Hashtag5 = {3, 5};
    static int[] n5 = {7, 5};
    static int[] n2 = {2, 2, 3};
    static int[] m4 = {3, 2, 2};
    static int[] m6 = {3, 4, 2};
    static int[] m_maj7 = {3, 4, 4};
    static int[] sus7 = {5, 2, 3};
    static int[] maj7_b5 = {4, 2, 5};
    static int[] maj7_Hashtag5 = {4, 4, 3};
    static int[] m7b5 = {3, 3, 4};
    static int[] dim7 = {3, 3, 3};
    static int[] n7b5 = {4, 2, 4};
    static int[] n7_Hashtag5 = {4, 4, 2};
    static int currentTonleiterIndex = 0;
    
    public Tonleiter_Holder() {
        setup();
    }
    
    public static void setup() {
        tonleiter.add(new Tonleiter("Dur", dur));tonleiter.add(new Tonleiter("Diminished", dim));
        tonleiter.add(new Tonleiter("Major 7", maj7));tonleiter.add(new Tonleiter("Suspended 4", sus4));
        tonleiter.add(new Tonleiter("7", n7));tonleiter.add(new Tonleiter("4", n4));
        tonleiter.add(new Tonleiter("Moll", m));tonleiter.add(new Tonleiter("6", n6));
        tonleiter.add(new Tonleiter("Moll 7", m7));tonleiter.add(new Tonleiter("Moll #5", m_Hashtag5));
        tonleiter.add(new Tonleiter("Plus", plus));tonleiter.add(new Tonleiter("5", n5));
        tonleiter.add(new Tonleiter("2", n2));tonleiter.add(new Tonleiter("Suspended 7", sus7));
        tonleiter.add(new Tonleiter("moll 4", m4));tonleiter.add(new Tonleiter("Major 7(b5)", maj7_b5));
        tonleiter.add(new Tonleiter("Moll 6", m6));tonleiter.add(new Tonleiter("Major 7(#5)", maj7_Hashtag5));
        tonleiter.add(new Tonleiter("Moll(Major 7)", m_maj7));tonleiter.add(new Tonleiter("Moll 7(b5)", m7b5));
        tonleiter.add(new Tonleiter("Diminished 7", dim7));tonleiter.add(new Tonleiter("7(#5)", n7_Hashtag5));
        tonleiter.add(new Tonleiter("7 b5", n7b5));
    }
    
    public static void setTonleiter(String sel_Tonleiter) {
        for (int i = 0; i < tonleiter.size(); i++) {
            if (tonleiter.get(i).getName().equals(sel_Tonleiter)) {
                currentTonleiterIndex = i;
                return;
            }
        }
    }
    
    public static int[] getTonleiter() {
        return tonleiter.get(currentTonleiterIndex).getCombi();
    }
}
