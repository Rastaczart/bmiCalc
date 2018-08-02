package pl.akademiakodu.bmiCalc.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.bmiCalc.model.Value;

public interface BmiDao extends CrudRepository<Value,Integer> {
}
