import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Lector = new Scanner(System.in);
        System.out.println();
        int Arreglo[]={3,5,8,9,6,5,2};
        //PEDIR AL USUARIO QUE INGRESE LOS VALORES 
        System.out.println("Arreglo original:");
        MostrarArreglo(Arreglo,Arreglo.length);
        OrdenarPorInsercion(Arreglo,Arreglo.length);
        System.out.println("ARREGLO ORDENADO: ");
        MostrarArreglo(Arreglo,Arreglo.length);
       
    }
    public static void OrdenarPorInsercion(int Arr[],int n){
        for (int i = 1; i < n; i++){
            int ValorC = Arr[i];  //asignar a la variable temporal el valor del segundo elemento
            int posicion = i;     //es para llevar el seguimiento de las posiciones del elemento
            //Verificar si se esta trabajando con el elemento que esta de primero
            // y si el elemento que esta de primero es mayor que el segundo
            while ((posicion > 0) && (Arr[posicion -1] > ValorC)) {
                Arr[posicion]= Arr[posicion - 1];   //cambiamos de posicion
                //para verificar que todos los elementos que estan antes estan ordenados
                posicion =posicion -1;
            }
            Arr[posicion]= ValorC;
        }

    }
    public static void MostrarArreglo(int Arr[], int n){
        for (int i =0; i > Arr.length; i++){
            System.out.print(Arr[i] + " ");
        } 
        System.out.println();

    } 
   

    
}
