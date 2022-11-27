import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {
//TROY COMPLETED
    @Test
    void count() {
        AverageDoubleLists obj = new AverageDoubleLists();
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(1.0, 5.5, 2.0, 2.0, 9.8, 3.3));
        double expected = 6.0;
        double actual = obj.count(array);
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        AverageDoubleLists obj = new AverageDoubleLists();
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(1.0, 5.0, 2.0, 2.0, 9.0, 3.0));
        double expected = 22.0;
        double actual = obj.sum(array);
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        AverageDoubleLists obj = new AverageDoubleLists();
        ArrayList<Double> array = new ArrayList<>(Arrays.asList(1.0, 5.0, 2.0, 2.0, 9.0, 3.0));
        double expected = 3.6;
        double actual = obj.average(array);
        assertEquals(expected, actual, .1);
    }
}