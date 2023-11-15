public class Perro extends Animal {
    private boolean tieneCola;
 private boolean tieneOrejas;
 private String raza;

   //metodo constructor
    public Perro(String Nombre, double peso, boolean tienePiernas, boolean tieneOjos, boolean tieneCola, boolean tieneOrejas, String raza) {
        super(Nombre, peso, tienePiernas, tieneOjos);
        this.tieneCola=tieneCola;
        this.tieneOrejas=tieneOrejas;
        this.raza=raza;
        
    }
    //metodos funcionales
    public void Masticar(){
        System.out.println(super.MostrarNombre() + " esta masticando!");
    }
    //aplicando polimorfismo
    @Override
    public void Comer (){
        System.out.println(super.MostrarNombre() + " esta comiendo!");
       Masticar();
       super.Moverse();
    }
 


    
}
