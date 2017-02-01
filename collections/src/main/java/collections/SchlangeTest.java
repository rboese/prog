package collections;

import java.util.LinkedList;
import java.util.Queue;

class SchlangeTest {
    public static void main(String args[]) {
        if (args.length == 0)
            throw new IllegalArgumentException("Ein Argument ist notwendig.");

        Queue<Object> q = new LinkedList<>();

        for (int i = 0; i < args[0].length(); i++)
            q.add(new Character(args[0].charAt(i)));

        System.out.println();
        System.out.println(q);

        while (!q.isEmpty()) {
            Character c = (Character) q.remove();
            System.out.print(c.charValue());
        }

        System.out.println();
    }
}
