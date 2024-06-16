package Teacher.view;

import java.util.Collections;
import java.util.List;

import Teacher.model.Teacher;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        Collections.sort(teachers);
        System.out.println(teachers);
    }
}
