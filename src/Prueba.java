/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lv1821
 */
public class Prueba {

    public static void main(String args[]) {
        Fecha miFecha = new Fecha(2, 2, 2022);
        System.out.println(miFecha);

        System.out.println("----------");
        Periodo p = new Periodo(new Fecha(1, 1, 2022), new Fecha(31, 12, 2022));
        System.out.println(p.contiene(miFecha));
    }

}
