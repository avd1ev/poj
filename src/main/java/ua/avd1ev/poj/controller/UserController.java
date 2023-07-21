package ua.avd1ev.poj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.avd1ev.poj.dto.UserTo;
import ua.avd1ev.poj.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public UserTo get(@PathVariable int id) {
        return userService.get(id);
    }

    @GetMapping
    public List<UserTo> getAll() {
        return userService.getAll();
    }


}
