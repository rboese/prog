package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Max1 {
    public static void main(String args[]) {
        Set<String> hs = new HashSet<String>();
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("2");

        Iterator<String> iter = hs.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        System.out.println("max = " + Collections.max(hs));
    }
}

