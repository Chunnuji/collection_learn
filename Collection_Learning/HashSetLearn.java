import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{

    public Student(String name, int rollNo) {
        Name = name;
        RollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", RollNo=" + RollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return RollNo == student.RollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(RollNo);
    }

    int RollNo;
    String Name;

}
public class HashSetLearn {

    public static void main(String[] args){

        Set<Student> set = new HashSet<>(0);
        set.add(new Student("A",1));
        set.add(new Student("A",2));
        set.add(new Student("B",1));
        set.add(new Student("B",3));

        System.out.println(set);

    }
}
