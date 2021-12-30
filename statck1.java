
import java.util.Stack;
import java.util.*;

public class statck1 {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();
        stk.push("java");
        stk.push("stack");
        stk.push("example");
        stk.pop();
        Iterator<String> itr = stk.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }    

}
