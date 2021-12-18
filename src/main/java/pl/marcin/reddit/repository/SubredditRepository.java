package pl.marcin.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcin.reddit.model.Subreddit;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}
