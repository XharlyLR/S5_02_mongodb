package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Player;

@Repository
public interface PlayerRepository extends MongoRepository<Player, Long>{

	Optional<Player> findByNomPlayer(String nom);

}
