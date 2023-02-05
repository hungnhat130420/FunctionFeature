package org.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        // define array of numbers and get smallest number and print it
        int [] arrayNumbers = {1,2,3,4,5};


//        List<Student> students = new ArrayList<>();
//        List<Student> students1 = new ArrayList<>();
//
//        students.add(new Student(1, "Alex"));
//        students.add(new Student(3, "King"));
//        students.add(new Student(2, "Wright"));
//        students.add(new Student(5, "Tom"));
//
//        Collections.sort(students, (s1, s2) -> {
//            return Integer.compare(s1.getId(), s2.getId());
//        });
//
//        Collections.copy(students, students1);

//        for (Student student : students1) {
//            System.out.println("List" + student);
//        }
        showInfo(students);
    }
    static void showInfo(List<Student> students) {
        for (Student student : students){
            System.out.println("List Students: " + student);
        }
    }
}
