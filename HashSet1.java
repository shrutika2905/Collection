import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Hi");
        hs.add("Hi");
        hs.add("Hello");
        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

// linked HashSet/sorted is same is HashSet
