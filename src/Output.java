import java.util.Arrays;
import java.util.Map;

/**
 * Created by Gabriel on 06/10/2015.
 */
public class Output<T> {

    private Histogram<T> histogram;

    public Output(Histogram<T> histogram) {
        this.histogram = histogram;
    }

    public void print(){
        System.out.println("Array: " + Arrays.toString(histogram.getArray()));
        System.out.println("Histograma:");
        for(Map.Entry<T, Integer> entry : histogram.getHashMap().entrySet()){
            System.out.println("\"" + entry.getKey() + "\": " + entry.getValue());
        }
    }
}
