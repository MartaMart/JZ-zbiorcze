package ex1;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringServiceTest {

    @Test
    public void getSortedAlfabeticallyZAShouldSortCorrectly(){
        List<String> listUnsorted = getUnsortedString();

        StringService stringService=new StringService();
        List<String> listSorted=new ArrayList<>();
        listSorted=stringService.getSortedAlfabeticallyZA(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallyListSorted= Arrays.asList("zb", "cb", "aa", "aC", "ZZ","Ab");
        Assertions.assertEquals(manuallyListSorted,listSorted);

        //drugi test może być że 2 listy mają te samą liczbę elementów
    }

    @Test
    public void getSortedAlfabeticallyZACaseInsensitiveShouldSortCorrectly(){
        List<String> listUnsorted = getUnsortedString();

        StringService stringService=new StringService();
        List<String> listSorted=new ArrayList<>();
        listSorted=stringService.getSortedAlfabeticallyZACaseInsensitive(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallyListSorted= Arrays.asList("zb", "cb", "aa", "aC", "ZZ","Ab");
        Assertions.assertEquals(manuallyListSorted,listSorted);

        //drugi test może być że 2 listy mają te samą liczbę elementów
    }

    private List<String> getUnsortedString() {
        List<String> listUnsorted=new ArrayList<>();
        listUnsorted.add("aa");
        listUnsorted.add("Ab");
        listUnsorted.add("aC");
        listUnsorted.add("cb");
        listUnsorted.add("zb");
        listUnsorted.add("ZZ");
        return listUnsorted;
    }
}
