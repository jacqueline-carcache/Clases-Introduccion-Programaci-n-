public class Pelicula{
    //Atributos
    private String nombre;
    private int duracion;
    private String genero;
    private String calidad;
    private String clasificacion;

    //metodos constructores
   public Pelicula (){
    this("No disponible", 52, "", "4k", "")

}
  public Pelicula(String nombre,int duracion,String genero,String calidad,String clasificacion ){
    this.nombre = nombre;
    this.duracion = duracion;
    this.genero = genero;
    this.calidad = calidad;
    this.clasificacion = clasificacion;

}
// metodos getters y setters son para mostrar
   public String mostrarNombre(){ //getters
    return this.nombre;

   }
   public void establecerNombre(String nombre){ //setters
    this.nombre=nombre;

   }
    public int mostrarDuracion() {
        return this.duracion;
    }
    public void establecerDuracion(int duracion) {
        if (duracion < 60) {
             this.duracion = 0;
        } else  {
            this.duracion= duracion;
        }
       
    }
    public String mostrarGenero() {
        return this.genero;
    }
    public void establecerGenero(String genero) {
        this.genero = genero;
    }
    public String mostrarCalidad() {
        return this.genero;
    }
    public void establecerCalidad(String genero) {
        this.genero = genero;
    }
     public String mostrarClasificacion() {
        return this.genero;
    }
    public void establecerClasificacion(String genero) {
        this.genero = genero;
    }

   
}