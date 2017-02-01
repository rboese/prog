package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator2 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("ghi");

        ListIterator<String> iter =
                list.listIterator(list.size());

        while (iter.hasPrevious())
            System.out.println(iter.previous());
    }
}

