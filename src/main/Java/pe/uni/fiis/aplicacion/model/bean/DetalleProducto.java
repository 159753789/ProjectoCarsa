package pe.uni.fiis.aplicacion.model.bean;

/**
 * Created by lazaroguerra on 14/06/2015.
 */
public class DetalleProducto {
    private String iddetalle;
    private String idproducto;
    private String idcarateristicaportipo;
    private String valorcaracteristica;
    private CaracteristicaTipoProducto CaracteristicaTipoProducto;
    private Producto Producto;

    public String getIddetalle() {
        return iddetalle;
    }

    public void setIddetalle(String iddetalle) {
        this.iddetalle = iddetalle;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getIdcarateristicaportipo() {
        return idcarateristicaportipo;
    }

    public void setIdcarateristicaportipo(String idcarateristicaportipo) {
        this.idcarateristicaportipo = idcarateristicaportipo;
    }

    public String getValorcaracteristica() {
        return valorcaracteristica;
    }

    public void setValorcaracteristica(String valorcaracteristica) {
        this.valorcaracteristica = valorcaracteristica;
    }

    public pe.uni.fiis.aplicacion.model.bean.CaracteristicaTipoProducto getCaracteristicaTipoProducto() {
        return CaracteristicaTipoProducto;
    }

    public void setCaracteristicaTipoProducto(pe.uni.fiis.aplicacion.model.bean.CaracteristicaTipoProducto caracteristicaTipoProducto) {
        CaracteristicaTipoProducto = caracteristicaTipoProducto;
    }

    public pe.uni.fiis.aplicacion.model.bean.Producto getProducto() {
        return Producto;
    }

    public void setProducto(pe.uni.fiis.aplicacion.model.bean.Producto producto) {
        Producto = producto;
    }
}
