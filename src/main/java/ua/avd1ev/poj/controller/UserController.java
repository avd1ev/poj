package ua.avd1ev.poj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.avd1ev.poj.dto.UserTo;
import ua.avd1ev.poj.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/{id}")
    public UserTo get(@PathVariable int id) {
        return service.get(id);
    }

    @GetMapping
    public List<UserTo> getAll() {
        return service.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserTo> create(@RequestBody UserTo userTo) {
        return ResponseEntity.ok(service.create(userTo));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserTo> update(@RequestBody UserTo userTo) {
        return ResponseEntity.ok(service.update(userTo));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
