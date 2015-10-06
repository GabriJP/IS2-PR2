import java.util.HashMap;

/**
 * Created by Gabriel on 06/10/2015.
 */
public class Process {

    private int[] array;
    private HashMap<Integer, Integer> histogram;

    public Process(int[] array) {
        this.array = array;
        histogram = new HashMap<>();
    }

    public void process(){
        for(int current : array){
            histogram.put(current, histogram.containsKey(current)? histogram.get(current)+1 : 1);
        }
    }

    public HashMap<Integer, Integer> getHistogram(){
        return histogram;
    }
}
