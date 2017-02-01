package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    public static void main(String args[]) {
        List<String> l = new ArrayList<>();

        for (String s : args) {
            l.add(s);
        }

        Collections.shuffle(l);

        l.stream().forEach(e -> System.out.println(e));
    }
}



/*

Bei Eingabe von
  java Shuffle i walk the line

liefert das Programm z.B. die Ausgabe:

[walk, line, i, the]


*/
