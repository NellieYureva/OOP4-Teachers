package Teacher.controller;

import java.util.List;

import Teacher.view.UserView;
import Teacher.model.Teacher;
import Teacher.model.User;
import Teacher.view.TeacherView;


public class TeacherController implements UserController{

    private UserView <Teacher> view = new TeacherView();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }
}
