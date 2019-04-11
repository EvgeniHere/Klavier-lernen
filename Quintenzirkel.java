import java.util.ArrayList;

/**
 *
 * @author Evgeni
 */
public class Quintenzirkel {
    
    static ArrayList<HarmonicCombi> combis = new ArrayList<>();
    
    public Quintenzirkel() {
        combis.add(new HarmonicCombi("c", "f", "d", "a", "g", "e"));
        combis.add(new HarmonicCombi("g", "c", "a", "e", "d", "h"));
        combis.add(new HarmonicCombi("d", "g", "e", "h", "a", "fis"));
        combis.add(new HarmonicCombi("a", "d", "h", "fis", "e", "cis"));
        combis.add(new HarmonicCombi("e", "a", "fis", "cis", "h", "gis"));
        combis.add(new HarmonicCombi("h", "e", "cis", "gis", "fis", "dis"));
        combis.add(new HarmonicCombi("fis", "h", "gis", "dis", "cis", "ais"));
        combis.add(new HarmonicCombi("cis", "fis", "dis", "ais", "dis", "gis"));
        combis.add(new HarmonicCombi("h", "cis", "ais", "gis", "ais", "dis"));
        combis.add(new HarmonicCombi("fis", "h", "gis", "dis", "f", "ais"));
        combis.add(new HarmonicCombi("cis", "fis", "dis", "ais", "c", "f"));
        combis.add(new HarmonicCombi("gis", "cis", "ais", "f", "g", "c"));
        combis.add(new HarmonicCombi("dis", "gis", "f", "c", "d", "g"));
        combis.add(new HarmonicCombi("ais", "dis", "c", "g", "a", "d"));
        combis.add(new HarmonicCombi("f", "ais", "g", "d", "e", "a"));
    }
    
    public static HarmonicCombi getHarmonicCombi(String pos) {
        for (int i = 0; i < combis.size(); i++) {
            if (combis.get(i).getHarmonicCombi()[0].equals(pos)) {
                return combis.get(i);
            }
        }
        return new HarmonicCombi("null", "null", "null", "null", "null", "null");
    }
}
