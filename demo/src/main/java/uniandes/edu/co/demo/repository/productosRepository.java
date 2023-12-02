package uniandes.edu.co.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.demo.modelo.productos;

public interface productosRepository extends MongoRepository<productos, String> {


    @Query("{}")
    List<productos> buscar();
    
}
