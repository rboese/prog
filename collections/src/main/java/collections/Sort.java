package collections;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String args[]) {

        List<String> l = new ArrayList<>();
        for (String s : args) {
            l.add(s);
        }

        l.stream().sorted().forEach(e -> System.out.println(e));

    }
}
