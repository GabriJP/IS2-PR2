import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gabriel on 06/10/2015.
 */
public class Output {

    private HashMap<Integer, Integer> hash;

    public Output(HashMap<Integer, Integer> hash) {
        this.hash = hash;
    }

    public void print(){
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
