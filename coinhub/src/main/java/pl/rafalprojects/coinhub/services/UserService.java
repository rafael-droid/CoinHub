package pl.rafalprojects.coinhub.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.rafalprojects.coinhub.models.User;
import pl.rafalprojects.coinhub.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }
}
