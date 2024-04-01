package pl.rafalprojects.coinhub.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import pl.rafalprojects.coinhub.models.User;
import pl.rafalprojects.coinhub.services.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    public Iterable<User> getAllUsers(){
        return userService.getUsers();
    }

}
