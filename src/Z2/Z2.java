package Z2;

import java.util.*;

public class Z2 {
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<>();
        tab1.add(1);
        tab1.add(5);
        tab1.add(4);
        tab1.add(2);
        tab1.add(1);
        printWithSemicolon(tab1);
        System.out.println();
        LinkedList<Integer> tab2 = new LinkedList<>();
        tab2.add(1);
        tab2.add(5);
        tab2.add(4);
        tab2.add(2);
        tab2.add(1);
        printWithSemicolon(tab2);
        System.out.println();
        HashSet<Integer> tab3 = new HashSet<>();
        tab3.add(1);
        tab3.add(5);
        tab3.add(4);
        tab3.add(2);
        tab3.add(6);
        printWithSemicolon(tab3);
        System.out.println();
        PriorityQueue<Integer> tab4 = new PriorityQueue<>();
        tab4.add(1);
        tab4.add(5);
        tab4.add(4);
        tab4.add(2);
        tab4.add(1);
        printWithSemicolon(tab4);
    }

    public static <E, T extends Iterable<E>> void printWithSemicolon(T obj){
        Iterator<E> iter = obj.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + "; ");
        }
    }
}
