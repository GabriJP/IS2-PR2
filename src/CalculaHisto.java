/**
 * Created by Gabriel on 06/10/2015.
 */
public class CalculaHisto {

    public static <T> Histogram<T> computeHisto(T[] vector){
        Histogram<T> histo = new Histogram<>();
        for(T key : vector){
            histo.increment(key);
        }
        return histo;
    }
}
