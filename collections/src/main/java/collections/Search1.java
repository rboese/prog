package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Search1 {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        Random rn = new Random();

        for (int i = 1; i <= 25; i++) {
            int n = (int) (rn.nextFloat() * 10 + 1);
            Integer ival = new Integer(n);
            int pos = Collections.binarySearch(list, ival);
            if (pos < 0)
                list.add(-pos - 1, ival);
        }

        for (Integer i : list)
            System.out.println(i);
    }
}

