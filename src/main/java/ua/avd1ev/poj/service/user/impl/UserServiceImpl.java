package ua.avd1ev.poj.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.avd1ev.poj.dto.UserTo;
import ua.avd1ev.poj.repository.UserRepository;
import ua.avd1ev.poj.service.UserService;
import ua.avd1ev.poj.util.UsersUtil;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserTo get(int id) {
        return UsersUtil.createTo(repository.get(id));
    }

    @Override
    public List<UserTo> getAll() {
        return UsersUtil.getTos(repository.getAll());
    }

    @Override
    public UserTo create(UserTo userTo) {
        return UsersUtil.createTo(repository.save(UsersUtil.createEntity(userTo)));
    }

    @Override
    public UserTo update(UserTo userTo) {
        return UsersUtil.createTo(repository.save(UsersUtil.createEntity(userTo)));
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
