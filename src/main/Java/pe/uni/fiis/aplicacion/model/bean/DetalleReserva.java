package pe.uni.fiis.aplicacion.model.bean;

/**
 * Created by lazaroguerra on 14/06/2015.
 */
public class DetalleReserva {
    private String idreserva;
    private String idproducto;
    private Reserva Reserva;

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

    public pe.uni.fiis.aplicacion.model.bean.Reserva getReserva() {
        return Reserva;
    }

    public void setReserva(pe.uni.fiis.aplicacion.model.bean.Reserva reserva) {
        Reserva = reserva;
    }
}
