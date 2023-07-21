package ua.avd1ev.poj.util;

import ua.avd1ev.poj.dto.UserTo;
import ua.avd1ev.poj.model.User;

import java.util.List;

public class UsersUtil {
    private UsersUtil () {}

    public static UserTo createTo(User user) {
        return new UserTo(user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                user.getPhone());
    }

    public static List<UserTo> getTos(List<User> users) {
        return users.stream().map(UsersUtil::createTo).toList();
    }
}
