package service;

import domain.Users;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

    public Users createUsers(Users users) {
        Users.persist(users);
        return users;
    }

}
