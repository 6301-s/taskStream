import java.util.*;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[]args)
    {
        List<Integer>list=Arrays.asList(6,7,8,3,9,5);
        System.out.println("elements in the list are:" +list);
        
        System.out.println("distinct method");
        list.stream().distinct().forEach(System.out::println);
        
        System.out.println("count method");
        long count=list.stream().count();
        System.out.println(count);
        
        List<Integer>Filtering=list.stream().filter(n->n%2==1).collect(Collectors.toList());
        System.out.println("filter method");
        System.out.println(Filtering);
        
        List<Integer>mapping=list.stream().map(n->n*4).collect(Collectors.toList());
         System.out.println("map method");
         System.out.println(mapping);
         
         System.out.println("reduce method");
         Optional<Integer>reduce=list.stream().reduce((a,b)->{return (a*b);});
         System.out.println(reduce);

         
         System.out.println("max & min method");
         Optional<Integer>maximum=list.stream().max((val1,val2)->{return val1.compareTo(val2);});
         System.out.println(maximum.get());
         Optional<Integer>minimum=list.stream().min((val1,val2)->{return val1.compareTo(val2);});
         System.out.println(minimum.get());
         
         System.out.println("Ascending and descending order");
         List<Integer>Ascending=list.stream().sorted().collect(Collectors.toList());
         System.out.println(Ascending);
         List<Integer>Descending=list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
         System.out.println(Descending);
         
         System.out.println("Limit method");
         list.stream().limit(4).forEach(System.out::println);
              
    }
    
}
