/***************************  Heap.java  **********************************/

/*
 *  Iteratives Sortieren mit Heapsort
 *  Entnimm einem Heap so lange das kleinste Element, bis er leer ist.
 *  Die entnommenen Elemente werden im selben Array gespeichert.
 */

public class Heap {
    private static long vergleiche = 0;

    private static int heapSize = 0;

    private static void lasseEinsinken(int[] feld, int root) {
        if (root >= heapSize) {
            return;
        }

        int smallest = root;
        if (getLeftChild(root) < heapSize && feld[getLeftChild(root)] < feld[root]) {
            smallest = getLeftChild(root);
        }

        if (getRightChild(root) < heapSize && feld[getRightChild(root)] < feld[smallest]) {
            smallest = getRightChild(root);
        }

        if (getRightChild(root) < heapSize) {
            vergleiche++;
        }


        if (getLeftChild(root) < heapSize) {
            vergleiche++;
        }


        if (smallest != root) {
            changeElements(feld, smallest, root);
            lasseEinsinken(feld, smallest);
        }

    }

    private static void changeElements(int[] array, int indexA, int indexB) {
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }

    private static void createHeap(int[] array) {
        for (int i = heapSize / 2; i >= 0; i--) {
            lasseEinsinken(array, i);
        }
    }

    public static void heapSort(int[] feld) {
        heapSize = feld.length;

        createHeap(feld);

        for (int i = 0; i < feld.length; i++) {
            changeElements(feld, 0, --heapSize);
            lasseEinsinken(feld, 0);
        }
    }

    private static int getLeftChild(final int i) {
        return i * 2 + 1;
    }

    private static int getRightChild(final int i) {
        return i * 2 + 2;
    }


    private static void feldAusgabe(int[] feld) {
        for (int i = 0; i < feld.length; i++)
            System.out.print(feld[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        vergleiche = 0;
        int feld[] = {56, 22, 79, 27, 9, 30, 61, 4, 69, 38, 52, 89, 23, 17, 68, 30};
        heapSort(feld);
        feldAusgabe(feld);
        System.out.println("Anzahl Vergleiche: " + vergleiche);


        int[] zahlenfolge = new int[100000];
        for (int i = 0; i < zahlenfolge.length; i++)
            zahlenfolge[i] = (int) (Math.random() * 1000);
        //feldAusgabe(zahlenfolge)

        vergleiche = 0;
        // Laufzeit bestimmen usw.

//        feldAusgabe(zahlenfolge);
        MyTimer timer = new MyTimer();
        heapSort(zahlenfolge);
        long time = timer.getElapsed();

        //      feldAusgabe(zahlenfolge);
        System.out.println("Anzahl Vergleiche: " + vergleiche);
        System.out.println("Elapsed time (ms): " + time);

    }
}

