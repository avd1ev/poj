package ua.avd1ev.poj.repository;

import ua.avd1ev.poj.model.User;

import java.util.List;

public interface UserRepository {
    User get(int id);

    List<User> getAll();

    User save(User user);
}
