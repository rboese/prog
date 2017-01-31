import java.util.NoSuchElementException;

class Stack {
    private ListElement stackpointer;

    boolean isEmpty() {
        return stackpointer == null;
    }

    void durchlaufe() {
        ListElement aktuell = stackpointer;
        while (aktuell != null) {
            // bearbeite aktuelles Element, z.B.
            System.out.print(aktuell.getDaten() + " ");
            // gehe ein Element weiter
            aktuell = aktuell.getNaechstes();
        }
        System.out.println();
    }

    void push(Object newObject) {
        ListElement newElement =
                new ListElement(newObject, stackpointer);
        stackpointer = newElement;
    }

    Object pop() {
        if (isEmpty())
            throw new NoSuchElementException("pop() for empty stack");
        Object popObject = stackpointer.getDaten();
        stackpointer = stackpointer.getNaechstes();
        return popObject;
    }
}
