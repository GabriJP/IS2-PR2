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
        Histogram<Integer> histogram = CalculaHisto.computeHisto(input.getIntegerArray());

        for(Object key : histogram.keySet()){
            System.out.println(key + " : " + histogram.get(key));
        }

        System.out.println("\nFin ejemplo\n\n");
    }

    private void stringExample(){
        System.out.println("Ejemplo de String\n");
        Input input = new Input();
        Histogram<String> histogram = CalculaHisto.computeHisto(input.getStringArray());

        for(Object key : histogram.keySet()){
            System.out.println(key + " : " + histogram.get(key));
        }

        System.out.println("\nFin ejemplo");
    }
}
