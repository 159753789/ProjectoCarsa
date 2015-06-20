package pe.uni.fiis.aplicacion.model.bean;

/**
 * Created by lazaroguerra on 14/06/2015.
 */
public class Reserva {
    private String idreserva;
    private String idproducto;
    private String cantidad;
    private Float codigo;
    private Float precio;
    private Float fechaexpiracion;

    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Float getCodigo() {
        return codigo;
    }

    public void setCodigo(Float codigo) {
        this.codigo = codigo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getFechaexpiracion() {
        return fechaexpiracion;
    }

    public void setFechaexpiracion(Float fechaexpiracion) {
        this.fechaexpiracion = fechaexpiracion;
    }
}
