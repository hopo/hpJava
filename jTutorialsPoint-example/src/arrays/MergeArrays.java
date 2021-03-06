package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {
    public static void main(String args[]) {
        String a[] = {"A", "E", "I"};
        String b[] = {"O", "U"};
        
        List<String> list = new ArrayList<String>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();

        System.out.println(Arrays.toString(c));
    }
}
