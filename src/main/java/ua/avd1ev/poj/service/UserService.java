package ua.avd1ev.poj.service;

import ua.avd1ev.poj.dto.UserTo;

import java.util.List;

public interface UserService {
    UserTo get(int id);

    List<UserTo> getAll();
}
