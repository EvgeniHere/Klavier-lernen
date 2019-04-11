import java.util.ArrayList;

/**
 *
 * @author Evgeni
 */
public class Keys_Holder {
    
    static ArrayList<Key> keys = new ArrayList<>();
    static Key currentKey;
    
    public Keys_Holder() {
        keys.add(new Key(Key.Type.VIOLIN, 0, 10, 65, 120));
        keys.add(new Key(Key.Type.BASS, 0, 35, 40, 50));
        keys.add(new Key(Key.Type.TENOR, 0, 10, 50, 80));
        currentKey = keys.get(0);
    }
    
    public static void setKey(String type) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).getType().toString().equals(type)) {
                currentKey = keys.get(i);
            }
        }
    }
    
    public static Key getKey() {
        return currentKey;
    }
}
