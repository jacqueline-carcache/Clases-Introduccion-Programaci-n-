public class App {
    public static void main(String[] args) throws Exception {
       Pelicula endgame = new Pelicula();
       endgame.establecerNombre("Avengers: Endgame");
       endgame.establecerDuracion(125);
       endgame.establecerCalidad("4k");
       endgame.establecerClasificacion("PG-13");
       endgame.establecerGenero("Ciencia ficcion");
        System.out.println("Nombre: " + endgame.mostrarNombre());
        System.out.println("Duracion: " + endgame.mostrarDuracion()+ " minutos ");
       System.out.println("Calidad: " + endgame.mostrarCalidad());
       System.out.println("Clasificacion: " + endgame.mostrarClasificacion());
       System.out.println("Genero: " + endgame.mostrarGenero());
       System.out.println("******************************************");
       Pelicula justiceleague = new Pelicula("justiceleague", 240, "Ciencia Ficcion", "8k", "R");
        System.out.println("Nombre: " + justiceleague.mostrarNombre());
        System.out.println("Duracion: " + justiceleague.mostrarDuracion()+ " minutos ");
       System.out.println("Calidad: " + justiceleague.mostrarCalidad());
       System.out.println("Clasificacion: " + justiceleague.mostrarClasificacion());
       System.out.println("Genero: " + justiceleague.mostrarGenero());
       System.out.println("******************************************");

    }
}
