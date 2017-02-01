package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse1 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= 10; i++)
            list.add(i + " * " + i + " = " + i * i);

        Collections.reverse(list);

        for (String s : list)
            System.out.println(s);
    }
}
