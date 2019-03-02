package Set;

import java.util.*;

public class Zadanie1 {

    public static void main(String[] args) {

        Integer[] tablica = {10,12,10,3,4,12,12,300,12,40,55};

        Set<Integer> integerSet = new HashSet<>(Arrays.asList(tablica));

        System.out.println(integerSet.size());
        for (Integer liczba: integerSet) {
            System.out.println(liczba);
        }
        integerSet.remove(10);
        integerSet.remove(12);

        System.out.println(integerSet.size());
        for (Integer liczba: integerSet) {
            System.out.println(liczba);
        }

    }
    public static boolean czyZawieraDuplikaty(String linia) {
        // czy mamy powtarzające się słowa/litery?
        String[] strings = linia.replaceAll(" ", "").replaceAll("[.]", "").replaceAll(",", "").split("");
        List<String> slowa = new ArrayList<>(Arrays.asList(strings));
        Set<String> bezDuplikatow = new HashSet<>(slowa);

        return slowa.size() == bezDuplikatow.size();
    }


}
