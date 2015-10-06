/**
 * Created by Gabriel on 06/10/2015.
 */
public class Control {

    public void control() {
        int[] array = new Input().getArray();
        Process process = new Process(array);
        process.process();
        new Output(process.getHistogram()).print();
    }
}
