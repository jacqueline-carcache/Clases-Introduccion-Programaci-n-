public class Vehiculo {
    private boolean TieneLlantas;
    private boolean TieneMotor;
    private boolean TieneCambios;
    private boolean TieneEspejos;
    private boolean TieneFrenos;
    private boolean TienePlaca;
    
    


    public Vehiculo(boolean tieneLlantas, boolean tieneMotor, boolean tieneCambios, boolean tieneEspejos,
            boolean tieneFrenos, boolean tienePlaca) {
        TieneLlantas = tieneLlantas;
        TieneMotor = tieneMotor;
        TieneCambios = tieneCambios;
        TieneEspejos = tieneEspejos;
        TieneFrenos = tieneFrenos;
        TienePlaca = tienePlaca;
    }
    public boolean isTieneLlantas() {
        return TieneLlantas;
    }
    public void setTieneLlantas(boolean tieneLlantas) {
        TieneLlantas = tieneLlantas;
    }
    public boolean isTieneMotor() {
        return TieneMotor;
    }
    public void setTieneMotor(boolean tieneMotor) {
        TieneMotor = tieneMotor;
    }
    public boolean isTieneCambios() {
        return TieneCambios;
    }
    public void setTieneCambios(boolean tieneCambios) {
        TieneCambios = tieneCambios;
    }
    public boolean isTieneEspejos() {
        return TieneEspejos;
    }
    public void setTieneEspejos(boolean tieneEspejos) {
        TieneEspejos = tieneEspejos;
    }
    public boolean isTieneFrenos() {
        return TieneFrenos;
    }
    public void setTieneFrenos(boolean tieneFrenos) {
        TieneFrenos = tieneFrenos;
    }
    public boolean isTienePlaca() {
        return TienePlaca;
    }
    public void setTienePlaca(boolean tienePlaca) {
        TienePlaca = tienePlaca;
    }
   
    public void Moverse(){
        System.out.print("El vehiculo se esta moviendo");
    }
}