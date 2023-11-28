package uniandes.edu.co.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.demo.modelo.habitaciones;

public interface habitacionesRepository extends MongoRepository<habitaciones, String> {

    @Query("{}")
    List<habitaciones> buscar();
    
}
