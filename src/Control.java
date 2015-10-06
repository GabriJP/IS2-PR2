/**
 * Created by Gabriel on 06/10/2015.
 */
public class Control {

    public void control() {
        int[] array = new Input().getArray();
        Histogram histogram = new Histogram(array);
        new Output(histogram.getHashMap()).print();
    }
}
