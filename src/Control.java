/**
 * Created by Gabriel on 06/10/2015.
 */
public class Control {

    public void control() {
        integerExample();
        stringExample();
    }

    private void integerExample(){
        System.out.println("Ejemplo de Integer\n");
        Input input = new Input();
        Histogram<Integer> histogram = new Histogram<>(input.getIntegerArray());
        new Output<>(histogram.getHashMap()).print();
        System.out.println("\nFin ejemplo\n\n");
    }

    private void stringExample(){
        System.out.println("Ejemplo de String\n");
        Input input = new Input();
        Histogram<String> histogram = new Histogram<>(input.getStringArray());
        new Output<>(histogram.getHashMap()).print();
        System.out.println("\nFin ejemplo");
    }
}
