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

    public static User createEntity(UserTo userTo) {
        return new User(userTo.getId(),
                userTo.getFirst_name(),
                userTo.getLast_name(),
                userTo.getEmail(),
                userTo.getPassword(),
                userTo.getPhone(),
                null,
                null);
    }
}
