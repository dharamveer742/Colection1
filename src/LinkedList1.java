import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // System.out.println(list);        []

        list.add(5);    //      to add a single element in a  LinkedList
        list.add(10);
        list.add(15);
        list.add(1,23);

        ArrayList<Integer> A = new ArrayList<>();

        A.add(20);
        A.add(25);
        A.add(30);



        System.out.println(list.getFirst());

        // System.out.println(A.getFirst());           Difference between LL and other collections


        list.addAll(A);                            //       to add the elements of a collection
        System.out.println(list);

        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }


        System.out.println("maximum is "+ Collections.max(list));  //                                   *


        list.remove(0);  //                    to remove an element from a specified index in LinkedList         3

        System.out.println("List after removing"+list);

        list.set(2,45);      //      to update an element at a specified  index//                    4
        //       setFirst(),setLast()

        System.out.println(list.get(3));  //  returns the element of a given index
        //  getFirst(),getLast()
        System.out.println(list);

        System.out.println(list.size());         //  returns the size of  a LinkedList

        System.out.println(list.isEmpty());

        System.out.println(list.contains(20));


        list.clear();

        System.out.println(list.contains(15));




    }





}
