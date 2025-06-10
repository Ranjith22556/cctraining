import java.util.*;
public class lists{
    public static void main(String[] args){
        List list1=new ArrayList();
        List<String> list2=new ArrayList<String>();
        list1.add(20);
        list1.add(30);
        list1.add(200);
        
        list2.add("SIZUKA");
        list2.add("NOBITA");
        list2.add("SUNIO");
        list2.add("GIAN");
    
        list1.addAll(list2);
        list1.remove("SUNIO");
        list1.removeAll(list2);
        list1.set(2,98);
        list1.indexOf(30);
        System.out.println(list1.lastIndexOf(30));
        System.out.println(list1.get(1));
        System.out.println(list1);
        System.out.println(list2);
    }
}