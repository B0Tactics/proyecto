package edu.eci.arsw.acount.repository;
import edu.eci.arsw.acount.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
