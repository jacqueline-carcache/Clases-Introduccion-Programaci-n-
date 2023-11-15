import java.util.Scanner;
public class App {
    static Scanner lector= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //sumarNumeros();
         // System.out.println("Ingrese Num1: ");
       //  double num1 = lector.nextDouble();

       //  System.out.println("Ingrese Num2: ");
       //  double num2 = lector.nextDouble();


     //restarNumeros(num1, num2);
      
       //System.out.println("El producto es: " +  multiplicarNumeros() );
       double x = (int)Math.round(Math.random() * 100);
       double y = (int)Math.round ( Math.random() * 100);
       System.out.println("El numero es:  " + x + " es menor que " + y + "?" verificarNumeros(x, y));

        }
    //declaracion de metodos
    //1- metodos que no requieren datos de entrada ni devuelvan datos de salida
    public static void sumarNumeros(){

        System.out.println("Ingrese a: ");
        double num1 = lector.nextDouble();

         System.out.println("Ingrese b: ");
        double num2 = lector.nextDouble();

        System.out.println("La suma de  " + num1 + " y " + num2 +  " = " + (num1+num2));

        
    }
    //2- metodo que requiera datos de entrada pero que no devuelva datos de salida

    public static void restarNumeros(double a, double b){
        System.out.println("La resta de " + a + " y " + b + " = " + (a-b));
    }
    //3.- metodo que no requiere datos de entrada pero que si devuelve datos de salida
    public static double multiplicarNumeros(){
         System.out.println("Ingrese a: ");
         double num1 = lector.nextDouble();

         System.out.println("Ingrese b: ");
         double num2 = lector.nextDouble();
         double producto = num1 * num2;
         
        return producto ;
       
    }
    //4.- metodos que requieran datos de entrada y devuelvan datos de salida.
    public static boolean  verificarNumeros(int x, int y){
        return (x<y);pñ

    }

}
