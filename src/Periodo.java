
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lv1821
 */
public class Periodo extends GregorianCalendar {

    private Fecha desde;
    private Fecha hasta;

    public Periodo(Fecha desde, Fecha hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    public Fecha getDesde() {
        return desde;
    }

    public void setDesde(Fecha desde) {
        this.desde=desde;
    }
    
    public Fecha getHasta(){
        return hasta;
    }
    
    public void setHasta(Fecha hasta){
        this.hasta=hasta;
    }
    
    public boolean contiene(Fecha fecha){
        if(fecha.after(hasta))
            return false;
        if(fecha.before(desde))
            return false;
        return true;
    }

}
