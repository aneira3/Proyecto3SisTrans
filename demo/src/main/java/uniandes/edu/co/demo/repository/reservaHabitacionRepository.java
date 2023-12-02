package uniandes.edu.co.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.demo.modelo.reservaHabitacion;

public interface reservaHabitacionRepository extends MongoRepository<reservaHabitacion, String> {

    @Query("{}")
    List<reservaHabitacion> buscar();
    
}
