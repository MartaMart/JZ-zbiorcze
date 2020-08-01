package ex1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringService {
    public List<String> getSortedAlfabeticallyZA(List<String> list){
        //Collections.sort(list); sortuje od A do Z

        //http://www.asciitable.com/
        Collections.sort(list, Comparator.reverseOrder()); //sortuje wg tablicy ASCII wg numeru-kodu tych znaków

        return list;
    }

    public List<String> getSortedAlfabeticallyZACaseInsensitive(List<String> list){

        Collections.sort(list, Comparator.comparing((String s)->s.toLowerCase()).reversed());

        return list;
    }

}
