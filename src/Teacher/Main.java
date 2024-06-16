package Teacher;

import java.util.ArrayList;
import java.util.List;

import Teacher.controller.TeacherController;
import Teacher.model.Teacher;

public class Main {

    public static void main(String[] args) {
        
        Teacher t1 = new Teacher(2, "Olga", "Ivanova");
        Teacher t2 = new Teacher(1, "Dmitriy", "Petrov");
        Teacher t3 = new Teacher(3, "Igor", "Svetlov");
        List <Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        System.out.println(teachers);

        new TeacherController().sendOnConsole(teachers); 

        teachers.remove(t2);

        new TeacherController().sendOnConsole(teachers);
    }
}



