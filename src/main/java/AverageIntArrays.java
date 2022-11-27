public class AverageIntArrays {
//TROY: COMPLETED
// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        Integer results = 0;
        for (Integer n : aa) {
            results += n;
        }
        return results;
    }

    public int average(int[] aa) {
        int results = 0;
        if (count(aa) == 0) {
            results = 0;
        } else {
            results = sum(aa) / count(aa);
        } return results;
    }

}
