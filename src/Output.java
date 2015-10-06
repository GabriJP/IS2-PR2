import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gabriel on 06/10/2015.
 */
public class Output<T> {

    private HashMap<T, Integer> hash;

    public Output(HashMap<T, Integer> hash) {
        this.hash = hash;
    }

    public void print(){
        for(Map.Entry<T, Integer> entry : hash.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
