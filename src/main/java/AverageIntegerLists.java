import java.util.ArrayList;

public class AverageIntegerLists {
//TROY: COMPLETED
    //counting the indexes in an ArrayList
    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    //getting the sum of all elements in an array list
    public int sum(ArrayList<Integer> aa) {
        Integer results = 0;
        for (Integer n : aa) {
            results += n;
        }
        return results;
    }

    //getting the average of all elements in an Array List
    public int average(ArrayList<Integer> aa) {
        int results = 0;
        if (count(aa) == 0) {
            results = 0;
        } else {
            results = sum(aa) / count(aa);
        } return results;
    }
}

