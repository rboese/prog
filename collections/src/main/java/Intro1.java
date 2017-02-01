package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Intro1 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= 10; i++)
            list.add(i + " * " + i + " = " + i * i);

        for (String s : list)
            System.out.println(s);

        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
