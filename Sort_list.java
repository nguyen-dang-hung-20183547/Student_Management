import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Sort_list{
    public static void Sorted(ArrayList<Student> mylist){
        Collections.sort(mylist, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGPA() > o2.getGPA() ? 1 : -1;
            }
        });
        System.out.println("List is sorted.");
    }
}