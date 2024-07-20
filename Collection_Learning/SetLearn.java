import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLearn {

    public static void main(String[] args){

        Set<Integer> set = new HashSet<>();

        int[] arr = {1,4,4,6,2,3,3,4,5,5};

        for(Integer i:arr){
            set.add(i);
        }

        System.out.println(set);


        set.remove(4);
        System.out.println(set);

        System.out.println("------------------");


        Set<String> setStr = new HashSet<>();
        setStr.add("Cat");
        setStr.add("Elephant");
        setStr.add("ant");
        System.out.println(setStr);
        System.out.println("------------------");

        Set<Integer> set2 = new LinkedHashSet<>();

        for(Integer i:arr){
            set2.add(i);
        }
        System.out.println(set2);


        System.out.println("------------------");

        //Binary Serach Tree

        Set<Integer> set3 = new TreeSet<>();

        set3.add(1);
        set3.add(12);
        set3.add(11);
        set3.add(5);
        set3.add(11);
        set3.add(5);

        System.out.println(set3);
    }
}
