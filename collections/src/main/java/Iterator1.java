package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator1 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("ghi");

        ListIterator<String> iter1 = list.listIterator();
        boolean first = true;
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
            //list.add("xyz");
            if (first) {
                iter1.add("xyz");
                first = false;
            }
        }
    }
}
