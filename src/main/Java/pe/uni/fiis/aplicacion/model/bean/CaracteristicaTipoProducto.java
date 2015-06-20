package pe.uni.fiis.aplicacion.model.bean;

/**
 * Created by lazaroguerra on 14/06/2015.
 */
public class CaracteristicaTipoProducto {
    private String idcaracteristicaportipo;
    private String idcarateristica;
    private String idtipoproducto;
    private Caracteristica Caracteristica;
    private TipoProducto TipoProducto;

    public String getIdcaracteristicaportipo() {
        return idcaracteristicaportipo;
    }

    public void setIdcaracteristicaportipo(String idcaracteristicaportipo) {
        this.idcaracteristicaportipo = idcaracteristicaportipo;
    }

    public String getIdcarateristica() {
        return idcarateristica;
    }

    public void setIdcarateristica(String idcarateristica) {
        this.idcarateristica = idcarateristica;
    }

    public String getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(String idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public pe.uni.fiis.aplicacion.model.bean.Caracteristica getCaracteristica() {
        return Caracteristica;
    }

    public void setCaracteristica(pe.uni.fiis.aplicacion.model.bean.Caracteristica caracteristica) {
        Caracteristica = caracteristica;
    }

    public pe.uni.fiis.aplicacion.model.bean.TipoProducto getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(pe.uni.fiis.aplicacion.model.bean.TipoProducto tipoProducto) {
        TipoProducto = tipoProducto;
    }
}
