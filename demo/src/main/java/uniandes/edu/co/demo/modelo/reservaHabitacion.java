package uniandes.edu.co.demo.modelo;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@Document(collection="reserva_habitacion")
@ToString
public class reservaHabitacion {
    @Id
    private String _id;
    private Date fechaEntrada;
    private Date fechaSalida;
    private float costo_total;
    private int numero_habitacion;
    private String plan_consumo;
    private Cliente cliente;
    public reservaHabitacion(String _id, Date fechaEntrada, Date fechaSalida, float costo_total, int numero_habitacion,
            String plan_consumo, Cliente cliente) {
        super();
        this._id = _id;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.costo_total = costo_total;
        this.numero_habitacion = numero_habitacion;
        this.plan_consumo = plan_consumo;
        this.cliente = cliente;
    }
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public Date getFechaEntrada() {
        return fechaEntrada;
    }
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public Date getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public float getCosto_total() {
        return costo_total;
    }
    public void setCosto_total(float costo_total) {
        this.costo_total = costo_total;
    }
    public int getNumero_habitacion() {
        return numero_habitacion;
    }
    public void setNumero_habitacion(int numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }
    public String getPlan_consumo() {
        return plan_consumo;
    }
    public void setPlan_consumo(String plan_consumo) {
        this.plan_consumo = plan_consumo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
    
}
