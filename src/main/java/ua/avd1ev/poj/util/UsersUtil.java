package ua.avd1ev.poj.util;

import ua.avd1ev.poj.dto.UserTo;
import ua.avd1ev.poj.model.User;

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
}
