package collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Trim {
    static void listTrim(List<String> strings) {
        ListIterator<String> listIter = strings.listIterator();

        while (listIter.hasNext()) {
            String cur = listIter.next();
            listIter.set(cur.trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList("  red  ", "    white ", " blue    ");

        // ...
        listTrim(l);

        l.stream().forEach(e -> System.out.println(e + "|len: " + e.length()));

    }
}



/*
   The enhanced for statement does not allow you to modify the List.
   Using an Iterator allows you to delete elements, but not replace an existing element or add a new one.
   That leaves ListIterator.
*/
