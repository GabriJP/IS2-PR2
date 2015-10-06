import java.util.HashMap;

/**
 * Created by Gabriel on 06/10/2015.
 */
public class Histogram<T> {

    private T[] array;
    private HashMap<T, Integer> hashMap;

    public Histogram(T[] array) {
        this.array = array;
        hashMap = new HashMap<>();
        process();
    }

    private void process(){
        for(T current : array){
            hashMap.put(current, hashMap.containsKey(current)? hashMap.get(current)+1 : 1);
        }
    }

    @SuppressWarnings("unused")
    public T[] getArray() {
        return array;
    }

    public HashMap<T, Integer> getHashMap() {
        return hashMap;
    }
}
