package pl.rafalprojects.coinhub.models;

import lombok.Getter;
import lombok.Setter;
import pl.rafalprojects.coinhub.models.enums.KindTransaction;
import pl.rafalprojects.coinhub.models.enums.Role;

@Getter
@Setter
public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
}
