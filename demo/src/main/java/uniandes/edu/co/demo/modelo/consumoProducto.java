package uniandes.edu.co.demo.modelo;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="consumo_producto")
@ToString
public class consumoProducto {

    @Id
    private String _id;
    private int numero_habitacion;
    private Date fecha;
    private String tipo;
    private float costo;
    private Cliente cliente;
    public consumoProducto(String _id, int numero_habitacion, Date fecha, String tipo, float costo, Cliente cliente) {
        this._id = _id;
        this.numero_habitacion = numero_habitacion;
        this.fecha = fecha;
        this.tipo = tipo;
        this.costo = costo;
        this.cliente = cliente;
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

    

    
    
}
