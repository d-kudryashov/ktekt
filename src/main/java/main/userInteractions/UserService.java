package main.userInteractions;

import main.db.entities.User;

public interface UserService {

    void saveNewUser(User user);
    User findByUserName(String username);

}
