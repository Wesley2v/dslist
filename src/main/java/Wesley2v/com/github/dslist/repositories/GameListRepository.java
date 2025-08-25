package Wesley2v.com.github.dslist.repositories;

import Wesley2v.com.github.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList  , Long> {
}
