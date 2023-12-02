package uniandes.edu.co.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.demo.modelo.productos;
import uniandes.edu.co.demo.modelo.tipoHabitacion;

public interface tipoHabitacionRepository extends MongoRepository<tipoHabitacion, String>  {


    @Query("{}")
    List<tipoHabitacion> buscar();
    
}
