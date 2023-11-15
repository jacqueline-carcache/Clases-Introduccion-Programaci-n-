import java.util.Scanner;
public class App {
    static Scanner lector = new Scanner(System.in);
    static double IngBruto, ingAntiguedad, ingtotal, inss, ir, deduccionesTotales; 
    public static void main(String[] args) throws Exception {
       
        //Datos de entrada
        //tasas sos constantes y algunos las pueden poner como variable
        //el usuario puede ingresar solo el usuario bruto
        //pero tanbien se le podria pedir las tasas de inss, ir, antiguedad
        //calcular ingreso total 
        //calcular deducciones totales 
        //calcular salario neto
       IngTotal();
       lector.close();
    }
    public static void IngTotal(){
        System.out.print("ingrese su salario bruto: ");
        double IngBruto= lector.nextInt();
        while(IngBruto <0){
         System.out.print("ingrese su salario bruto: ");
         IngBruto= lector.nextInt();
         double ingAntiguedad = 0.15 * IngBruto ;
        double ingtotal = IngBruto + ingAntiguedad ;
        System.out.println("El ingreso por antiguedad es: " + ingAntiguedad);
        System.out.println("El ingreso total es: " + ingtotal);
        } 
        
    }
    public static void deduccionesTotales(){
        inss = IngBruto * 0.15;
        ir= IngBruto * 0.7;
    }

}
