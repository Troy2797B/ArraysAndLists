public class AverageDoubleArrays {
    //TROY: COMPLETED
// Complete these methods

    public int count(double[] aa) {
        return aa.length;
    }

    public int sum(double[] aa) {
        double results = 0;
        for (double n : aa) {
            results += n;
        }
        return (int) results;
    }

    public int average(double[] aa) {
        int results = 0;
        if (count(aa) == 0) {
            results = 0;
        } else {
            results = sum(aa) / count(aa);
        }
//        return Math.floor(results);
        return (int) results;
    }

}
