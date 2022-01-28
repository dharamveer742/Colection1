import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet1 {
    public static void main(String[] args) {


        HashSet<Character> h = new HashSet<>();
        h.add('g');
        h.add('i');
        h.add('h');           //               No specific Methods for HashSet
        h.add('j');
        System.out.println(h);
        char l= Collections.max(h);
        System.out.println(l);


        Iterator<Character> ob =h.iterator();
        while(ob.hasNext()){
            System.out.println("Printing Set by iterator "+ob.next());
        }


        for(Character c:h){
            System.out.println("Printing Set elements by for each loop "+c);
        }

        LinkedHashSet<Character> f = new LinkedHashSet<>();  // subclass of HashSet
        f.add('i');
        f.add('g');
        f.add('h');           //
        f.add('j');
        System.out.println(h);   // difference:- Insertion order is not preserved in HashSet but
        System.out.println(f);   // preserved in LinkedHashSet







    }



}
