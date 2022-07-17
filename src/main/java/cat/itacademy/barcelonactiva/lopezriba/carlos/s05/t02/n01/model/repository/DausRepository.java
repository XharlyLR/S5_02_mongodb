package cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cat.itacademy.barcelonactiva.lopezriba.carlos.s05.t02.n01.model.domain.Daus;

@Repository
public interface DausRepository extends MongoRepository<Daus, Long>{
	
	@Transactional
	List<Daus> deleteByPlayerID(long id);

	List<Daus> findAllByPlayerID(long id);
}
