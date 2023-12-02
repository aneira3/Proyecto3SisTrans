package uniandes.edu.co.demo.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import lombok.ToString;
import uniandes.edu.co.demo.modelo.Cliente;
import uniandes.edu.co.demo.modelo.consumoProducto;
import uniandes.edu.co.demo.modelo.productos;


public interface consumoProductoRepository extends MongoRepository<consumoProducto, String> {

    @ToString
    public class Respuesta{
        @Id
        private String _id;
        private int numero_habitacion;
        private Date fecha;
        private String tipo;
        private float costo;
        private Cliente cliente;
        @DBRef
        List<productos> producto_relacionado;
        public Respuesta(String _id, int numero_habitacion, Date fecha, String tipo, float costo, Cliente cliente,
                List<productos> producto_relacionado) {
            this._id = _id;
            this.numero_habitacion = numero_habitacion;
            this.fecha = fecha;
            this.tipo = tipo;
            this.costo = costo;
            this.cliente = cliente;
            this.producto_relacionado = producto_relacionado;
        }
        public String get_id() {
            return _id;
        }
        public void set_id(String _id) {
            this._id = _id;
        }
        public int getNumero_habitacion() {
            return numero_habitacion;
        }
        public void setNumero_habitacion(int numero_habitacion) {
            this.numero_habitacion = numero_habitacion;
        }
        public Date getFecha() {
            return fecha;
        }
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        public float getCosto() {
            return costo;
        }
        public void setCosto(float costo) {
            this.costo = costo;
        }
        public Cliente getCliente() {
            return cliente;
        }
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
        public List<productos> getProducto_relacionado() {
            return producto_relacionado;
        }
        public void setProducto_relacionado(List<productos> producto_relacionado) {
            this.producto_relacionado = producto_relacionado;
        }
      
     }

     @Aggregation(pipeline={"{ $lookup: { from: productos, localField: tipo, foreignField: _id, as: producto_relacionado } }" , "{$match:{'fecha':?0 }}"})
     List<Respuesta> darTipoProducto(LocalDateTime fecha);

    @Query("{}")
    List<consumoProducto> buscar();

}
