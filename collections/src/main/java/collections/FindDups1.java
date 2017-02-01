package collections;

import java.util.*;

// mysterious comparator, that is never needed...
class CaseComperator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.toLowerCase().compareTo(o2.toLowerCase());
    }
}

public class FindDups1 {
    public static void main(String args[]) {
        // Set<String> s = new HashSet<>();
        // Set<String> s = new TreeSet<>();
        SortedSet<String> s = new TreeSet<>(new CaseComperator());
        Set<String> dups = new HashSet<>();

        int counterDistinct = 0;

        System.out.println("Duplicates:");
        for (String i : args) {
            if (s.add(i)) {
                counterDistinct++;
            } else {
                dups.add(i.toLowerCase());
                System.out.println(i);
            }
        }


        System.out.println();
        System.out.println("Anzahl distinct: " + counterDistinct);

        System.out.println();
        System.out.println("Alle Elemente:");

        s.stream().forEach(e -> System.out.println(e));

        System.out.println();
        System.out.println("Differenz von dups und set");
        s.stream().filter(e -> !dups.contains(e.toLowerCase())).forEach(e -> System.out.println(e));

    }
}


/*
Bei Eingabe von

  java FindDups1 i came i saw i left

liefert das Programm die Ausgabe:

Duplicate detected: i
Duplicate detected: i
4 distinct words detected: [came, i, left, saw]

*/


/*
Note that the example code always refers to the collection by its interface type (Set), rather than by its implementation type (HashSet). This is a strongly recommended programming practice, as it gives you the flexibility to change implementations merely by changing the constructor. If the variables used to store a collection, or the parameters used to pass it around, are declared to be of the collection's implementation type rather than its interface type, then all such variables and parameters must be changed to change the collection's implementation type. Furthermore, there's no guarantee that the resulting program will work; if the program uses any non-standard operations that are present in the original implementation type but not the new one, the program will fail. Referring to collections only by their interface keeps you honest, in the sense that it prevents you from using any non-standard operations.
The implementation type of the Set in the example above is HashSet, which makes no guarantees as to the order of the elements in the Set. If you want the program to print the word list in alphabetical order, all you have to do is to change the set's implementation type from HashSet to TreeSet.

*/
