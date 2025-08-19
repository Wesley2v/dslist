package Wesley2v.com.github.dslist.services;

import Wesley2v.com.github.dslist.dto.GameMinDTO;
import Wesley2v.com.github.dslist.entities.Game;
import Wesley2v.com.github.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
