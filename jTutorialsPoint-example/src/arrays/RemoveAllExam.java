package arrays;

import java.util.ArrayList;

public class RemoveAllExam {
    public static void main(String args[]) {
        ArrayList<String> objArray = new ArrayList<>();
        ArrayList<String> objArray2 = new ArrayList<>();

        objArray.add(0, "common1");
        objArray.add(1, "common2");
        objArray.add(2, "notcommon2");

        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");

        System.out.println("Array elements of array1: " + objArray);
        System.out.println("Array elements of array2: " + objArray2);

        // objArray - objArray2
        objArray.removeAll(objArray2);
        System.out.println("Array after removing array2 from array1: " + objArray);
    }
}
