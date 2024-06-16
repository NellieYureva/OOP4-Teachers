package Teacher.controller;

import Teacher.model.User;

public interface UserController {
    <T extends User> User create(T user);

    
}
