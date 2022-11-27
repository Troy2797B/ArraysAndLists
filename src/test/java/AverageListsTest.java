import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageListsTest {
//TROY : COMPLETED

    @org.junit.jupiter.api.Test
    void count1() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        int expected = 3;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.count(a));
    }

    @org.junit.jupiter.api.Test
    void count2() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 1));
        int expected = 6;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.count(a));
    }

    @org.junit.jupiter.api.Test
    void count3() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int expected = 0;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.count(a));
    }

    @org.junit.jupiter.api.Test
    void sum1() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        int expected = 6;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.sum(a));
    }

    @org.junit.jupiter.api.Test
    void sum2() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 1));
        int expected = 1;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.sum(a));
    }

    @org.junit.jupiter.api.Test
    void sum3() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int expected = 0;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.sum(a));
    }

    @org.junit.jupiter.api.Test
    void average1() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(2, 4, 6));
        int expected = 4;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.average(a));
    }
    @org.junit.jupiter.api.Test
    void average2() {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 1));
        int expected = 2;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.average(a));
    }
    @org.junit.jupiter.api.Test
    void average3() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int expected = 0;
        AverageIntegerLists obj = new AverageIntegerLists();

        assertEquals(expected, obj.average(a));
    }

}