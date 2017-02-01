package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
    public static void main(String args[]) {
        Set<String> hs = new HashSet<String>();
        hs.add("1");
        hs.add("2");
        hs.add("2");
        hs.add("3");

        Iterator<String> iter = hs.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}

