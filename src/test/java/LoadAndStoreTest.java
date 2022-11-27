import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.
    @BeforeEach
    void setUp() {
//        //build test array
//        String[] array = {"1", "2", "3", "4", "5"};
//        //write to temporary file
//        try {
//            BufferedWriter bw = new BufferedWriter(new FileWriter("testfile1"));
//            for (String s : array) {
//                bw.write(s + "\n");
//            }
//            bw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        //close the file
    }

    @AfterEach
    void tearDown() {
    }
    LoadAndStore bloop = new LoadAndStore();

    @Test
    void loadIntArrayFromFileT() {
        //given an arraylist
        //when
        //then
        assertEquals(null, "");
    }

    @Test
    void loadIntegerArrayListFromFileT() {
        //given
        //when
        //then
        assertEquals(null, "");
    }

    @Test
    void loaddoubleArrayFromFileT() {
        double[] expected = {4.4, 5.5, 6.34, 11.0001, 13.004, 8.7, 9.97060, 7.4532, 14.5, 18.00023132123};
        double[] actual = bloop.loaddoubleArrayFromFile("testDoubleData2.txt");
        assertArrayEquals(expected, actual);
    }

    @Test
    void loadDoubleArrayListFromFileT() {
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(4.4, 5.5, 6.34, 11.0001, 13.004, 8.7, 9.97060, 7.4532, 14.5, 18.00023132123));
        ArrayList<Double> actual = bloop.loadDoubleArrayListFromFile("testDoubleData2.txt");
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayFromFileT() {
        //given a text file
        String[] expected = {"4.4", "5.5", "Foo", "11.0001", "Bar", "Lost in Space",
                "Lido Shuffle", "How much data was destroyed?", "I think therefore I compute", "0", "NaN", "ZipCode Rocks!"};
        String[] actual = bloop.loadStringArrayFromFile("testStringData3.txt");
        assertArrayEquals(expected, actual);
    }

    @Test
    void loadStringArrayListFromFileT() {
        //given a text file
        //when oyu call the method
        ArrayList<String> actual = bloop.loadStringArrayListFromFile("testStringData3.txt");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("4.4", "5.5", "Foo", "11.0001", "Bar", "Lost in Space",
        "Lido Shuffle", "How much data was destroyed?", "I think therefore I compute", "0", "NaN", "ZipCode Rocks!"));
        //it returns an arraylist
        assertEquals(expected, actual);
    }
}