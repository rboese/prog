/* Hash: perfekte Hashfunktionen f?r Flughafen-Codes              */
/* Pos. der Buchstaben im Alphabet: A=1, B=2, ...,Z=26            */
/* F?r A=0, ... bei der Bucketberechnung jeweils das "+1" l?schen */


public class Perfekt {
    static final int N = 10;

    /* Feld f?r Ergebnisse (= Buckets) anlegen, Anzahl = Zahl der Flugh?fen */
    static String Codes[] = {"MUC", "LUX", "VLC", "FAO", "STR", "HAM", "CGN", "PMI", "FDH", "AGP"};
    static int Ziel_Buckets[] = new int[N];

    // kein Konstruktor notwendig
    Perfekt() {
    }

    public static void main(String[] args) {
        /* i,j,k entsprechen den Multiplikatoren f?r die Alphabetstelle, mit dem Schranken kann man
        entsprechend spielen */
        for (int i = -6; i < 7; i++)
            for (int j = -6; j < 7; j++)
                for (int k = -6; k < 7; k++) {
                    /* f?r alle 10 Flugh?fen Ziel-Bucket berechnen */
                    for (int m = 0; m < 10; m++) {
                        // da negative Zahlen auftreten koennen, wird der Betrag der Zahl verwendet
                        //  --> Verwendung der Methode Math.abs
                        // Char in Zahl umwandeln : Verwendung der Methode charAt

                        // ...

                        // Zahl auf den Ziel_Bucket Bereich abbilden
                        // ...
                        // Hash-Funktion und Abbildung auf Ziel_Bucket koennen auch in einem Befehl
                        // ausgefuehrt werden
                    }

                    boolean ok = true;


                    /* Jetzt f?r alle Ziel-Buckets pr?fen, ob 2 gleich sind, dann ok == false setzen */
                    // Hinweis: doppelte for-Schleife
                    // ...

                        /* Wenn alle Buckets verschieden, Werte f?r i,j,k sowie Divisor l ausgeben,
                           danach die Buckets f?ralle 10 Flugh?fen in obiger Reihenfolge ausgeben */
                    if (ok) {
                        System.out.println("(1. Buchstabe * " + i
                                + " + 2. Buchstabe * " + j
                                + " + 3. Buchstabe * " + k
                                + ") mod " + N);
                        for (int u = 0; u < 10; u++)
                            // Code und entsprechenden Ziel_Bucket ausgeben
                            // ...
                            ;
                    }
                }
    }
}

/*
Beispielausgabe des Programms:
(1. Buchstabe * -5 + 2. Buchstabe * -1 + 3. Buchstabe * -6) mod 10
MUC 4 | LUX 5 | VLC 0 | FAO 1 | STR 3 | HAM 9 | CGN 6 | PMI 7 | FDH 2 | AGP 8 |
(1. Buchstabe * -5 + 2. Buchstabe * 1 + 3. Buchstabe * -4) mod 10
MUC 6 | LUX 5 | VLC 0 | FAO 9 | STR 7 | HAM 1 | CGN 4 | PMI 3 | FDH 8 | AGP 2 |
(1. Buchstabe * -5 + 2. Buchstabe * 3 + 3. Buchstabe * -2) mod 10
MUC 8 | LUX 5 | VLC 0 | FAO 7 | STR 1 | HAM 3 | CGN 2 | PMI 9 | FDH 4 | AGP 6 |
(1. Buchstabe * -3 + 2. Buchstabe * 3 + 3. Buchstabe * 0) mod 10
MUC 4 | LUX 7 | VLC 0 | FAO 5 | STR 3 | HAM 1 | CGN 2 | PMI 9 | FDH 6 | AGP 8 |
(1. Buchstabe * -1 + 2. Buchstabe * 1 + 3. Buchstabe * 0) mod 10
MUC 8 | LUX 9 | VLC 0 | FAO 5 | STR 1 | HAM 7 | CGN 4 | PMI 3 | FDH 2 | AGP 6 |
(1. Buchstabe * 1 + 2. Buchstabe * -1 + 3. Buchstabe * 0) mod 10
MUC 8 | LUX 9 | VLC 0 | FAO 5 | STR 1 | HAM 7 | CGN 4 | PMI 3 | FDH 2 | AGP 6 |
(1. Buchstabe * 3 + 2. Buchstabe * -3 + 3. Buchstabe * 0) mod 10
MUC 4 | LUX 7 | VLC 0 | FAO 5 | STR 3 | HAM 1 | CGN 2 | PMI 9 | FDH 6 | AGP 8 |
(1. Buchstabe * 5 + 2. Buchstabe * -3 + 3. Buchstabe * 2) mod 10
MUC 8 | LUX 5 | VLC 0 | FAO 7 | STR 1 | HAM 3 | CGN 2 | PMI 9 | FDH 4 | AGP 6 |
(1. Buchstabe * 5 + 2. Buchstabe * -1 + 3. Buchstabe * 4) mod 10
MUC 6 | LUX 5 | VLC 0 | FAO 9 | STR 7 | HAM 1 | CGN 4 | PMI 3 | FDH 8 | AGP 2 |
(1. Buchstabe * 5 + 2. Buchstabe * 1 + 3. Buchstabe * 6) mod 10
MUC 4 | LUX 5 | VLC 0 | FAO 1 | STR 3 | HAM 9 | CGN 6 | PMI 7 | FDH 2 | AGP 8 |
*/