import java.util.*;
class CollectionExample
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        // list.add("C");
        // list.add("D");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}