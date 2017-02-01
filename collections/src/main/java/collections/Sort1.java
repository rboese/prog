package collections;

import java.util.*;

public class Sort1 implements Comparator<String> {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();

        list.add("abc");
        list.add("DEF");
        list.add("ghi");

        // standard sort

        Collections.sort(list);
        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        // sort, ignoring case

        Collections.sort(list, new Sort1());
        for (String s : list)
            System.out.println(s);
    }

    public int compare(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
    }
}
