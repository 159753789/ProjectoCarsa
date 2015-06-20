package pe.uni.fiis.aplicacion.model.bean;

/**
 * Created by lazaroguerra on 14/06/2015.
 */
public class Producto {
    private String idproducto;
    private String nombreproducto;
    private String descripcioncorta;
    private String descripcionlarga;
    private Float precio;
    private String idcategoria;
    private Float tipo;
    private Float cantidad;
    private Categoria Categoria;
    private DetalleReserva DetalleReserva;

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getDescripcioncorta() {
        return descripcioncorta;
    }

    public void setDescripcioncorta(String descripcioncorta) {
        this.descripcioncorta = descripcioncorta;
    }

    public String getDescripcionlarga() {
        return descripcionlarga;
    }

    public void setDescripcionlarga(String descripcionlarga) {
        this.descripcionlarga = descripcionlarga;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(String idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Float getTipo() {
        return tipo;
    }

    public void setTipo(Float tipo) {
        this.tipo = tipo;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public pe.uni.fiis.aplicacion.model.bean.Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(pe.uni.fiis.aplicacion.model.bean.Categoria categoria) {
        Categoria = categoria;
    }

    public pe.uni.fiis.aplicacion.model.bean.DetalleReserva getDetalleReserva() {
        return DetalleReserva;
    }

    public void setDetalleReserva(pe.uni.fiis.aplicacion.model.bean.DetalleReserva detalleReserva) {
        DetalleReserva = detalleReserva;
    }
}
