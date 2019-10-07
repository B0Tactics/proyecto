package main.java.edu.eci.arsw.acount.repository;
import main.java.edu.eci.arsw.acount.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}