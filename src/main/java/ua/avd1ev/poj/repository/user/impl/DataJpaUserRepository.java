package ua.avd1ev.poj.repository.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.avd1ev.poj.repository.UserRepository;

@Repository
public class DataJpaUserRepository implements UserRepository {
    @Autowired
    private CrudUserRepository crudUserRepository;
}
