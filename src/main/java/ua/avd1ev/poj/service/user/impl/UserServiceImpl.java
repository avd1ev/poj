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
    private UserRepository userRepository;

    @Override
    public UserTo get(int id) {
        return UsersUtil.createTo(userRepository.get(id));
    }

    @Override
    public List<UserTo> getAll() {
        return UsersUtil.getTos(userRepository.getAll());
    }

    @Override
    public UserTo create(UserTo userTo) {
        return UsersUtil.createTo(userRepository.create(UsersUtil.createEntity(userTo)));
    }
}
