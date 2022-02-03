/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lv1821
 */
public class Fecha extends java.util.GregorianCalendar {

    public Fecha() {
        super();
        set(HOUR, 0);
        set(MINUTE, 0);
        set(SECOND, 0);
        set(MILLISECOND, 0);

    }

    public Fecha(int dia, int mes, int año) {

        super(año, mes, dia);
        set(HOUR, 0);
        set(MINUTE, 0);
        set(SECOND, 0);
        set(MILLISECOND, 0);
    }

    public Fecha(Fecha fecha) {
        super(fecha.get(YEAR), fecha.get(MONTH)+1, fecha.get(DAY_OF_MONTH));
        set(HOUR, 0);
        set(MINUTE, 0);
        set(SECOND, 0);
        set(MILLISECOND, 0);

    }

    public int getDia() {
        return get(DAY_OF_MONTH);
    }

    public int getMes() {
        return get(MONTH)+1;
    }

    public int getAño() {
        return get(YEAR);
    }

    public void setDia(int dia) {
        set(DAY_OF_MONTH, dia);
    }

    public void setMes(int mes) {
        set(MONTH, mes-1);
    }

    public void setAño(int año) {
        set(YEAR, año);
    }

    public void setFecha(int dia, int mes, int año) {
        super.set(DAY_OF_MONTH, dia);
        super.set(MONTH, mes);
        super.set(YEAR, año);

    }

    public Fecha vencimiento(int dias, int meses, int años) {
        Fecha f = new Fecha(this);
        f.add(DAY_OF_MONTH, dias);
        f.add(MONTH, meses);
        f.add(YEAR, años);

        return f;
    }
    
    public Fecha vencimiento(int dias,int meses){
        return this.vencimiento(dias, meses, 0);
    }
    
    public Fecha vencimiento(int dias){
        return this.vencimiento(dias, 0);
    }
    
    public int lapso(Fecha desde){
        long desdeInMillis = desde.getTimeInMillis();
        long thisInMillis = this.getTimeInMillis();
        long diferencia = thisInMillis-desdeInMillis;
        long segundos = diferencia/1000;
        long minutos = segundos/60;
        long horas = minutos/60;
        long dias = horas/24;
        
        return (int)dias;    
    }
    
    public String toString(){
        return this.getDia()+"/"+this.getMes()+"/"+this.getAño();
    }

}
