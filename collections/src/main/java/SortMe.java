package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortMe {
    public static void main(String args[]) {
        SortedSet<StringBuffer> s = new TreeSet<StringBuffer>();
        s.add(new StringBuffer("Red"));
        s.add(new StringBuffer("White"));
        s.add(new StringBuffer("Blue"));
        System.out.println(s.first());
    }
}



/*

Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
	at java.util.TreeMap.put(Unknown Source)
	at java.util.TreeSet.add(Unknown Source)
	at collections.SortMe.main(SortMe.java:10)

*/
