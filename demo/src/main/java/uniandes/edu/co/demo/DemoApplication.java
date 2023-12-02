package uniandes.edu.co.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import uniandes.edu.co.demo.modelo.Bar;
import uniandes.edu.co.demo.modelo.consumoProducto;
import uniandes.edu.co.demo.modelo.habitaciones;
import uniandes.edu.co.demo.modelo.productos;
import uniandes.edu.co.demo.modelo.reservaHabitacion;
import uniandes.edu.co.demo.modelo.reservaServicio;
import uniandes.edu.co.demo.modelo.serviciosReservables;
import uniandes.edu.co.demo.modelo.tipoHabitacion;
import uniandes.edu.co.demo.repository.BarRepository;
import uniandes.edu.co.demo.repository.consumoProductoRepository;
import uniandes.edu.co.demo.repository.habitacionesRepository;
import uniandes.edu.co.demo.repository.productosRepository;
import uniandes.edu.co.demo.repository.reservaHabitacionRepository;
import uniandes.edu.co.demo.repository.reservaServicioRepository;
import uniandes.edu.co.demo.repository.serviciosReservablesRepository;
import uniandes.edu.co.demo.repository.tipoHabitacionRepository;
import uniandes.edu.co.demo.repository.BarRepository.RespuestaGrupo;
import uniandes.edu.co.demo.repository.consumoProductoRepository.Respuesta;

@ComponentScan({"uniandes.edu.co.demo.repository"})
@SpringBootApplication
@EnableMongoRepositories
public class DemoApplication  implements CommandLineRunner{

	@Autowired
	private reservaServicioRepository consumoRepo;
	private habitacionesRepository habRepo;
	


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{
		List<reservaServicio> res = consumoRepo.buscar();
		//System.out.print(res);
		for(reservaServicio b: res){
			System.out.println(b); 
		}


		//String dateString = "2023-01-10";

        //DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
		//LocalDateTime dateTime = LocalDateTime.of(2023, 1, 10,0,0,0); 
        //LocalDate localDate = LocalDate.parse(dateString, formatter);
		//String dateString = "2023-01-10T00:00:00.000Z";

        // Crea un objeto DateTimeFormatter para el formato ISO 8601
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX");

        // Parsea la cadena y obtén un objeto LocalDateTime
        //LocalDateTime localDateTime = LocalDateTime.parse("2023-01-10T00:00:00.000Z", formatter);
		


/* 
		//QUERIES
		List<Bar> res = barRepository.buscarPorId(60);

		for(Bar b: res){
			System.out.println(b);
		}
		

		//AGGREGATIONS
		List<RespuestaGrupo> res2 = barRepository.darBaresPorCiudad();

		for(RespuestaGrupo r: res2){
			System.out.println(r.getCiudad());
			System.out.println(r.getCantidad());
		}

		//INSERT / UPDATE
		barRepository.save(new Bar(101, "Bar de prueba","Cali","Alto",2));

		//Update
		barRepository.aniadirBebidaABar(101, "Bebida de prueba 2", "aperitivo", 10, "diurno", 10);
		*/
	}

}
