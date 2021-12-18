package pl.marcin.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcin.reddit.model.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
