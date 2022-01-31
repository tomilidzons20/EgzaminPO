package Z1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {
    public static void main(String[] args) {
        LocalTime[] tab = {
                LocalTime.of(5, 40),
                LocalTime.of(6, 30),
                LocalTime.of(2, 50),
                LocalTime.of(3, 55),
                LocalTime.of(5, 40)
        };
        Character[] tab1 = {'c', 'b', 'g', 'f', 'c', 'g'};
        System.out.println(removeRepeatedElements(tab));
        System.out.println(removeRepeatedElements(tab1));
    }

    public static <T extends Comparable<? super T>> ArrayList<T> removeRepeatedElements(T[] tab){
        ArrayList<T> tab1 = new ArrayList<>(List.of(tab));
        for(int i = 0; i < tab.length; i++) {
            boolean tym = false;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i].compareTo(tab[j]) == 0) {
                    tym = true;
                    tab1.remove(tab[j]);
                }
            }
            if(tym){
                tab1.remove(tab[i]);
            }
        }
        return tab1;
    }
}
