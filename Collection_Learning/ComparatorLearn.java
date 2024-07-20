import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Box1{

    int length;
    String nm;
    int wt;

    public Box1(int length, String nm, int wt) {
        this.length = length;
        this.nm = nm;
        this.wt = wt;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", nm='" + nm + '\'' +
                ", wt=" + wt +
                '}'+'\n';
    }

}

class ComparatorDef implements Comparator<Box1>{

    @Override
    public int compare(Box1 o1, Box1 o2) {
        return o1.nm.compareTo(o2.nm);
    }
}
public class ComparatorLearn {

    public static void main(String[] args){
        Box1 b1 = new Box1(1,"abc",50);
        Box1 b5 = new Box1(11,"xyz",10);
        Box1 b2 = new Box1(11,"abc2",80);
        Box1 b3 = new Box1(3,"abc3",20);
        Box1 b4 = new Box1(8,"abc4",100);

        List<Box1> ls = new ArrayList<>();

        ls.add(b1);
        ls.add(b2);
        ls.add(b3);
        ls.add(b4);
        ls.add(b5);

        System.out.println(ls);

        //sorting based on weigth
        ls.sort(new Comparator<Box1>() {
            @Override
            public int compare(Box1 o1, Box1 o2) {
                return o1.wt-o2.wt;
            }
        });

        System.out.println(ls);

        //sorting based on name
        ls.sort(new ComparatorDef());
        System.out.println(ls);

    }
}
