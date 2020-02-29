
package calcularedadpersona;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class CalcularEdadPersona {

    
    public static void main(String[] args) {
        try{
        Scanner scan =new Scanner(System.in);
        Calendar Cal= new GregorianCalendar();
        int mesActual=Cal.get(Calendar.MONTH)+1;
        
        int añoActual=Cal.get(Calendar.YEAR);
        int diaActual=Cal.get(Calendar.DAY_OF_MONTH);
        int dia,año,mes;
        int mesRes,diaRes, añoRes;
        System.out.println(mesActual);
        System.out.println(diaActual);
        System.out.println(añoActual);
        System.out.println("Calcular cuantos años tienes");
        
        System.out.println("Dime un día");
        dia=scan.nextInt();
        System.out.println("Dime un Mes");
        mes=scan.nextInt();
        System.out.println("Dime un Año");
        año=scan.nextInt();
        if(dia<=0&&dia>31){
            throw new Exception("Es Día No es Valido");
        }
        else if(mes<=0&&dia>12){
            throw new Exception("Es Mes No es Valido");
        }
        else if(año<=0){
            throw new Exception("Es año No es Valido");
        }
        mesRes=(mesActual-mes);
        diaRes=(diaActual-dia);
        añoRes=(añoActual-año);
        System.out.println(dia);
        System.out.println(diaActual);
       if(dia>diaActual){
        System.out.println("Tienes "+añoRes+" Años "+", "+mesRes+" meses"+" y "+diaRes+" dias");
       }else{
       System.out.println("Tienes "+añoRes+" Años "+", "+mesRes+" meses"+" y "+diaRes+" dias");
       }
        }catch(Exception ex){
        System.out.println("Ha Habido un Error "+ex.toString());
        
        }
    }
    
}
