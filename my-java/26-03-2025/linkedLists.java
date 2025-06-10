import java.util.*;
public class linkedLists{
    public static void main(String[] args){
        LinkedList list1=new LinkedList();
        LinkedList<String> list2=new LinkedList<String>();
        list1.add(20);
        list1.add(30);
        list1.add(390);
        list1.addFirst(200);
        list2.add("SIZUKA");
        list2.add("NOBITA");
        list2.addFirst("SUNIO");
        list2.add("GIAN");
        list2.offer("DEGISUKI");
        list2.offerFirst("DOREAMON");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("Get Position:"+list1.get(2));
        System.out.println("Get First:"+list1.getFirst());
        System.out.println("Get Last:"+list1.getLast());
        System.out.println("Element:"+list1.element());
        System.out.println("Peek:"+list1.peek());
        System.out.println("Index(30):"+list1.indexOf(30));
        System.out.println("Pop:"+list1.pop());
    }
}