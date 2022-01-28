import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {

        Stack<String> stack1 = new Stack<>();

        stack1.push("Ram");
        stack1.push("150");
        stack1.push("Child");
        stack1.push("Delhi");


        // stack1.remove(1);


        System.out.println(stack1.pop()); // return and removes the top element

        System.out.println(stack1.get(1));

        System.out.println(stack1.search("150"));    // returns the index of element from the top if present else -1

        System.out.println(stack1.empty());
        System.out.println(stack1.isEmpty());

        System.out.println(Collections.max(stack1));



        Iterator<String> it = stack1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }




    }
}
