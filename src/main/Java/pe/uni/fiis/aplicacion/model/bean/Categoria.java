package pe.uni.fiis.aplicacion.model.bean;

/**
 * Created by lazaroguerra on 14/06/2015.
 */
public class Categoria {
    private String nombrecategoria;
    private String idcategoria;
    private String idcategoriasup;

    public String getNombrecategoria() {
        return nombrecategoria;
    }
    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    public String getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(String idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getIdcategoriasup() {
        return idcategoriasup;
    }

    public void setIdcategoriasup(String idcategoriasup) {
        this.idcategoriasup = idcategoriasup;
    }
}
