package main.userInteractions;

public interface SecurityService {

    String findLoggedInUserName();
    void autoLogIn(String username, String password);

}
