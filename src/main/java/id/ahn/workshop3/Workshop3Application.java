package id.ahn.workshop3;

import id.ahn.workshop3.domain.Car;
import id.ahn.workshop3.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Workshop3Application {

	public static void main(String[] args) {
		SpringApplication.run(Workshop3Application.class, args);
	}


	//postgres tanpa @bean

	@Bean
	public CommandLineRunner demo(CarRepository repository){
		return (args) -> {
			repository.save(new Car("Toyota","Kijang","Red","Diesel",2015));
			repository.save(new Car("Toyota","Kijang","Blue","Diesel",2016));
			repository.save(new Car("Toyota","Kijang","Green","Diesel",2017));
			repository.save(new Car("Toyota","Kijang","Yellow","Diesel",2018));
			repository.save(new Car("Ford","Modeo","Yellow","Diesel",2018));
			repository.save(new Car("Ford","Modeo","Blue","Diesel",2018));

		};
	}
}
