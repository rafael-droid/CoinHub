package pl.rafalprojects.coinhub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.rafalprojects.coinhub.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
