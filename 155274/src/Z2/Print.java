package Z2;

import java.util.ArrayList;

public class Print {
    public static<E, I extends Iterable<E>> void printMarginal(I object) {
        E last = null;
        E first = object.iterator().next();
        for(E element : object) {
            last = element;
        }
        System.out.println("Pierwszy element: " + first + "Ostatni element: " + last);
    }
}
