import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Box implements Comparable<Box>{

    int Length;
    String name;
    int weigth;

    public Box(int length, String name, int weigth) {
        Length = length;
        this.name = name;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "Length=" + Length +
                ", name='" + name + '\'' +
                ", weigth=" + weigth +
                '}'+'\n';
    }

    @Override
    public int compareTo(Box o) {
        if(this.Length==o.Length){
            return this.name.compareTo(o.name);
        }
        return this.Length-o.Length;
    }
}
public class ComparableLearn {

    public static void main(String[] args){

        Box b1 = new Box(1,"abc",50);
        Box b5 = new Box(11,"xyz",80);
        Box b2 = new Box(11,"abc2",80);
        Box b3 = new Box(3,"abc3",50);
        Box b4 = new Box(8,"abc4",100);

        List<Box> list = new ArrayList<>();
        list.add(b1);
        list.add(b5);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
