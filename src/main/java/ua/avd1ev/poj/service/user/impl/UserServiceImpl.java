package ua.avd1ev.poj.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.avd1ev.poj.repository.UserRepository;
import ua.avd1ev.poj.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

}
