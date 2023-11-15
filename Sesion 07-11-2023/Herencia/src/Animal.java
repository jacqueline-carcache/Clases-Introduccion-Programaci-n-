public class Animal {
    private String Nombre;
    private double peso;
    private boolean tienePiernas;
    private boolean tieneOjos;
    


    public String MostrarNombre() {
        return Nombre;
    }

    public void EstablecerNombre(String nombre) {
        this.Nombre = nombre;
    }

    public Animal(String Nombre, double peso, boolean tienePiernas, boolean tieneOjos){
        this.Nombre = Nombre;
        this.peso = peso;
        this.tienePiernas = tienePiernas;
        this.tieneOjos = tieneOjos;

    }
    public void Comer(){
        System.out.println("El animal esta comiendo");
    }
    public void Moverse(){
        System.out.print("El animal se esta moviendo");
    }
}
