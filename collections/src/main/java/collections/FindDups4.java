package collections;

import java.util.HashSet;
import java.util.Set;

public class FindDups4 {
    public static void main(String args[]) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups = new HashSet<String>();

        // ...

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}


/*

Bei Eingabe von

  java FindDups4 i came i saw i left

liefert das Programm die Ausgabe:

Unique words:    [came, left, saw]
Duplicate words: [i]

*/
