package main.db.repositories;

import main.db.entities.Meter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterRepository extends CrudRepository<Meter, Integer> {

    Meter findByApiKey(String apiKey);

}
