package CollectionStreamAndCollectors.CollectionProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCustomObject {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Sufyan", 92));
        studentList.add(new Student("Hamza", 72));
        studentList.add(new Student("Ali", 94));

        List<Student> studentList2 = new ArrayList<>(studentList);

        Comparator<Student> sortBymarks = (o1, o2) ->{

                if(o1.getMarks() > o2.getMarks()){
                    return -1;
                } else if (o2.getMarks() > o1.getMarks()) {
                    return 1;
                }
                return 0;

        };

        Collections.sort(studentList, sortBymarks);
        System.out.println(studentList);

        System.out.println("Another list");
        Collections.sort(studentList2);

        System.out.println(studentList2);

    }

}

class Student implements Comparable<Student> {
     private String name;

    public double getMarks() {
        return marks;
    }



    private double marks;

     Student(String name, double marks){
         this.name = name;
         this.marks = marks;
     }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare((int) o.getMarks(), (int) this.marks );
    }
}
