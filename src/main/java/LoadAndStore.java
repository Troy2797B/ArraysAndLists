import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Double.parseDouble;

public class LoadAndStore {

    public int[] loadIntArrayFromFile(String filename) {
        ArrayList<Integer> arrList = loadIntegerArrayListFromFile(filename);
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = arrList.get(i);
        return arr;
    }
    //TROY: this method above takes the array list made from the file
    //and turns it into a normal array

    public ArrayList<Integer> loadIntegerArrayListFromFile(String filename) {
        // Creating an object of BufferedReader class
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line ="";
        ArrayList<Integer> result = new ArrayList<Integer>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines
                Integer number = Integer.parseInt(line);
                result.add(number);
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
//TROY: this method above reads the integers of a given file
// and adds them to an array, then it returns that arrayList

    // Build these out:

    // use testDoubleData2.txt to test

    public double[] loaddoubleArrayFromFile(String filename) {
        ArrayList<Double> loaded = loadDoubleArrayListFromFile(filename);
        double[] arr = new double[loaded.size()];
        for (int i = 0; i < loaded.size(); i++)
            arr[i] = loaded.get(i);
        return arr;
    }

    public ArrayList<Double> loadDoubleArrayListFromFile(String filename) {
        ArrayList <String> arrayList = loadStringArrayListFromFile(filename);
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        double newS = 0;
        for (String s : arrayList){
            newS = parseDouble(s);
            doubleArrayList.add(newS);
        }
        return doubleArrayList;
    }

    // use testStringData3.txt to test

    public String[] loadStringArrayFromFile(String filename) {
        ArrayList<String> loaded = loadStringArrayListFromFile(filename);
        String[] arr = new String[loaded.size()];
        for (int i = 0; i < loaded.size(); i++)
            arr[i] = loaded.get(i);
        return arr;
    }

    public ArrayList<String> loadStringArrayListFromFile(String filename) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line ="";
        ArrayList<String> result = new ArrayList<String>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines
                result.add(line);
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    //
    // Finally:
    //
    // Is there some way to re-factor these routines so that
    // loadStringArrayListFromFile() becomes the general case routine
    // and is the only one with IO code in it?
    // All the others become like loadIntArrayFromFile(),
    // where it calls the general case routine?
}

