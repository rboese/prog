package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class NameSort {
    public static void main(String args[]) {
        Name n[] = {
                new Name("John", "Lennon"),
                new Name("Karl", "Marx"),
                new Name("Groucho", "Marx"),
                new Name("Oscar", "Grouch")
        };
        List<Name> l = Arrays.asList(n);
        Collections.sort(l);
        System.out.println(l);
    }
}

