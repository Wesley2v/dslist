package Wesley2v.com.github.dslist.repositories;

import Wesley2v.com.github.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
