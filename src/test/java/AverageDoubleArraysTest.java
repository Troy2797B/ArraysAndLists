import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {
//TROY: COMPLETED
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        AverageDoubleArrays obj = new AverageDoubleArrays();
        double[] array = {1.0, 5.5, 2.0, 2.0, 9.8, 3.3};
        int expected = 6;
        int actual = obj.count(array);
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        AverageDoubleArrays obj = new AverageDoubleArrays();
        double[] array = {1.0, 5.0, 2.0, 2.0, 9.0, 3.0};
        int expected = 22;
        int actual = obj.sum(array);
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        AverageDoubleArrays obj = new AverageDoubleArrays();
        double[] array = {1.0, 5.0, 2.0, 2.0, 9.0, 3.0};
        int expected = 3;
        int actual = obj.average(array);
        assertEquals(expected, actual);
    }
}