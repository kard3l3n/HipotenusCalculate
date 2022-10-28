package hipotenuscalc;
import java.util.Scanner;
import java.math.*;

public class HipotenusCalc {
    public static void main(String[] args) {
        double ucgenkenarbir,ucgenkenariki;
        double hipotenus;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Üçgenin birinci kenarını giriniz:");
        ucgenkenarbir=input.nextDouble();
        System.out.println("Üçgenin ikinci kenarını giriniz:");
        ucgenkenariki=input.nextDouble();
        double total=Math.pow(ucgenkenarbir,2)+Math.pow(ucgenkenariki,2);
        hipotenus=Math.pow(total,0.5);
        
        System.out.println(hipotenus);
        
        
    }
    
}
