/*
26/01/2021 
Autor: Marc Climent
 */
package pzeller01;

import java.util.Scanner;

public class PZeller01 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int dia = 13, mes = 9, any;
        System.out.println("Marc Climent");
        System.out.print("Year? ");
        any = keyboard.nextInt();

        String strDia = InicioDiaMesZeller(dia, mes, any);
        System.out.println("Autor: Marc Climent");
        System.out.println("Programers' International Day: " + strDia);
    }

    private static int functionBisiesto(int any) {
        int bisiesto = 0;
        if (any % 4 == 0 && (any % 100 != 0 || any % 400 == 0)) bisiesto = 1;
        return bisiesto;
    }
    

    private static String InicioDiaMesZeller(int dia, int mes, int any) {
        String diaString = "";
        String[] semana = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - mes) / 12;
        y = any - a;
        m = mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        diaString = semana[d];
        return diaString;
    }
}
