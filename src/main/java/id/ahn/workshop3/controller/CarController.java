package id.ahn.workshop3.controller;

import id.ahn.workshop3.domain.Car;
import id.ahn.workshop3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


/*
@Autowired >> dependensi injection,,

{} >> pathVariable
tanpa {} >> param request


 */
@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;


    @GetMapping
    public Iterable<Car> getCar(){
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable("id") String id){
        return carRepository.findById(Long.parseLong(id));
    }

    /*
    @PostMapping
    public Car addNewCar(@RequestBody Car car){
        return carRepository.save(car);
    }

     */

    @PostMapping
    public ResponseEntity<Car> addNewCar(@RequestBody Car car){
        Car car1 =  carRepository.save(car);

        return new ResponseEntity<>(car1, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable("id") Long id){
        carRepository.deleteById(id);
    }
}
