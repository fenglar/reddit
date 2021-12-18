package pl.marcin.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcin.reddit.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
