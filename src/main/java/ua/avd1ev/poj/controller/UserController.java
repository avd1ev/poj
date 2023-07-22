package ua.avd1ev.poj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.avd1ev.poj.dto.UserTo;
import ua.avd1ev.poj.service.UserService;

import java.net.URI;
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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserTo> create(@RequestBody UserTo userTo) {
        return ResponseEntity.ok(userService.create(userTo));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserTo> update(@RequestBody UserTo userTo) {
        return ResponseEntity.ok(userService.update(userTo));
    }
}
