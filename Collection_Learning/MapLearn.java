import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapLearn {


    public static void main(String[] args){

        Map<Integer,String> mp = new HashMap<>();

        mp.put(1,"India");
        mp.put(2,"Nepal");
        mp.putIfAbsent(2,"USA");
        mp.putIfAbsent(3,"Russia");

        System.out.println(mp);
        System.out.println(mp.containsKey(11));
        System.out.println(mp.containsKey(1));

        mp.remove(2);
        System.out.println(mp);
        System.out.println(mp.getOrDefault(1,"others"));
        System.out.println(mp.getOrDefault(5,"others"));

        Set<Integer> keys = mp.keySet();
        System.out.println(keys);
//        System.out.println();

        Set<Map.Entry<Integer,String>> set = mp.entrySet();

        for(Map.Entry<Integer,String> ele: set){
            System.out.println(ele.getKey()+" - "+ele.getValue());
        }
    }
}
