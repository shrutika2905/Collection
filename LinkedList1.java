import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("hii");
        list.add("hello");
        Iterator<String> it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
    
}
