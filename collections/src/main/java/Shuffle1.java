package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shuffle1 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();

        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");

        Collections.shuffle(list);

        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
