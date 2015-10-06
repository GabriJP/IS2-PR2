import java.util.HashMap;

/**
 * Created by Gabriel on 06/10/2015.
 */
public class Histogram {

    private int[] array;
    private HashMap<Integer, Integer> hashMap;

    public Histogram(int[] array) {
        this.array = array;
        hashMap = new HashMap<>();
        process();
    }

    private void process(){
        for(int current : array){
            hashMap.put(current, hashMap.containsKey(current)? hashMap.get(current)+1 : 1);
        }
    }

    @SuppressWarnings("unused")
    public int[] getArray() {
        return array;
    }

    public HashMap<Integer, Integer> getHashMap() {
        return hashMap;
    }
}
