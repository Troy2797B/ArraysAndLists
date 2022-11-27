import static org.junit.jupiter.api.Assertions.*;

class AverageArraysTest {
//TROY: COMPLETED
    @org.junit.jupiter.api.Test
    void count1() {
        int[] a = { 1, 2, 3};
        int expected = 3;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.count(a));
    }

    @org.junit.jupiter.api.Test
    void count2() {
        int[] a = { 0, 0, 0, 0, 0, 1};
        int expected = 6;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.count(a));
    }

    @org.junit.jupiter.api.Test
    void count3() {
        int[] a = { };
        int expected = 0;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.count(a));
    }

    @org.junit.jupiter.api.Test
    void sum1() {
        int[] a = { 1, 2, 3};
        int expected = 6;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.sum(a));
    }

    @org.junit.jupiter.api.Test
    void sum2() {
        int[] a = {0, 0, 0, 0, 0, 1};
        int expected = 1;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.sum(a));
    }

    @org.junit.jupiter.api.Test
    void sum3() {
        int[] a = { };
        int expected = 0;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.sum(a));
    }

    @org.junit.jupiter.api.Test
    void average1() {
        int[] a = { 2, 4, 6};
        int expected = 4;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.average(a));
    }
    @org.junit.jupiter.api.Test
    void average2() {
        int[] a = { 1, 3, 4, 1};
        int expected = 2;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.average(a));
    }
    @org.junit.jupiter.api.Test
    void average3() {
        int[] a = { };
        int expected = 0;
        AverageIntArrays obj = new AverageIntArrays();

        assertEquals(expected, obj.average(a));
    }
}