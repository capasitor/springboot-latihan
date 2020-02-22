package id.ahn.workshop3.repository;

import id.ahn.workshop3.domain.Car;
import org.springframework.data.repository.CrudRepository;

/*
<Car,Long>

Car : domain
Long : type data yang menjadi primary key

CrudRepository dari jpa
 */
public interface CarRepository extends CrudRepository<Car,Long> {

}
