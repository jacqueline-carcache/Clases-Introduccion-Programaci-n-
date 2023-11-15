import java.util.Scanner;
public class App {
    Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
      
        //Metodos sobrecargados (sobre carga de metodos)
        //consiste en reutilizar el nombre de un metodo pero
        // lista de parametros de entrada

        mostrarHora();
    }
    public static void mostrarHora(){
        System.out.print("Horas: ");
        int hr = lector.nextInt();
        System.out.print("Minutos: ");
        int min = lector.nextInt();
    }
    //sobrecargar el metodo mostrarHora()
    public static void mostrarHora(int hr, int min, int seg){
        System.out.println(" La hora es "+ hr + " , " + min + " , " + seg );
    }
}
