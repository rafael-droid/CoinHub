package pl.rafalprojects.coinhub.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import pl.rafalprojects.coinhub.models.enums.Role;

@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
