package Teacher.service;

import Teacher.model.Teacher;

public class TeacherServise {
    public Teacher createTeacher(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }

    
}
