import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListLearn {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(35);
        list.add(152);

        //Collection Interface methods

//        System.out.println(list);
//        System.out.println(list.contains(1));
        list.remove(Integer.valueOf(1));
//        System.out.println(list);
        Object ob[] = list.toArray();

        for(Object i:ob){
            Integer x = (Integer) i;
//            System.out.println(x);
        }

        //List Methods

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.set(2,2);
        list2.add(1);

        list2.add(3,7);
        System.out.println(list2);


//        System.out.println(list2);

//        for(Integer i:list2){
//            System.out.println(i);
//        }


    }
}
