package pl.marcin.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcin.reddit.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
