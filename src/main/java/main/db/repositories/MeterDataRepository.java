package main.db.repositories;

import main.db.entities.MeterData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeterDataRepository extends CrudRepository<MeterData, Long> {

    List<MeterData> findByMeterId(int meterId);

}
