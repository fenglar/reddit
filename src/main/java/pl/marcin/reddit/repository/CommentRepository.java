package pl.marcin.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcin.reddit.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
