import java.util.*;

class Queue1
{
    public static void main(String[] args) {
        PriorityQueue<String> que = new PriorityQueue<String>();
        que.add("This");
        que.add("is");
        que.add("example");
        que.add("of");
        que.add("Queue");
        System.out.println("head:"+que.element());  
        System.out.println("head:"+que.peek());  
        Iterator itr = que.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        que.remove();
        Iterator itr2 = que.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
    }
}