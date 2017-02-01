package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test2 implements Comparable<Test2> {
    private int x;

    public Test2(int i) {
        x = i;
    }

    public int getX() {
        return x;
    }

    public int compareTo(Test2 t) {
        int val = t.x;
        if (x < val)
            return -1;
        else if (x > val)
            return 1;
        else
            return 0;
    }
}

public class Compare2 {
    public static void main(String args[]) {
        List<Test2> list = new ArrayList<Test2>();
        list.add(new Test2(5));
        list.add(new Test2(10));
        Collections.sort(list);
        for (Test2 t : list)
            System.out.println(t.getX());
    }
}
