import java.util.ArrayList;

public class AverageDoubleLists {
//TROY: COMPLETED
    // write out these too
    public Double count(ArrayList<Double> aa) {
        return (double) aa.size();
    }
    public Double sum(ArrayList<Double> aa) {
        double results = 0;
        for (double n : aa) {
            results += n;
        }
        return results;
    }
    public Double average(ArrayList<Double> aa) {
        double results = 0;
        if (count(aa) == 0) {
            results = 0;
        } else {
            results = sum(aa) / count(aa);
        }
//        return Math.floor(results);
        return results;
    }

}
