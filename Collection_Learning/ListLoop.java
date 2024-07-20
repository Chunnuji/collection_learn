import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListLoop {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(String ele:list){
            System.out.println("ELement :"+ele);
        }

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println("Itr :"+itr.next());

        }
    }
}
