package ua.avd1ev.poj.repository.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.avd1ev.poj.model.User;
import ua.avd1ev.poj.repository.UserRepository;

import java.util.List;

@Repository
public class DataJpaUserRepository implements UserRepository {
    @Autowired
    private CrudUserRepository crudUserRepository;

    @Override
    public User get(int id) {
        return crudUserRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return crudUserRepository.findAll();
    }

    @Override
    public User create(User user) {
        return crudUserRepository.save(user);
    }
}
