public class Carro extends Vehiculo {
   
    private boolean tieneCajuela;
    private boolean tieneRadio;
    private int asientos;
    private int tienePuertas;
    private boolean tieneVolante;
    private boolean tieneAireAcondicionado;
    
    public Carro(boolean tieneLlantas, boolean tieneMotor, boolean tieneCambios, boolean tieneEspejos,
            boolean tieneFrenos, boolean tienePlaca, boolean tieneCajuela, boolean tieneRadio, int asientos,
            int tienePuertas, boolean tieneVolante, boolean tieneAireAcondicionado) {
        super(tieneLlantas, tieneMotor, tieneCambios, tieneEspejos, tieneFrenos, tienePlaca);
        TieneCajuela = tieneCajuela;
        TieneRadio = tieneRadio;
        Asientos = asientos;
        TienePuertas = tienePuertas;
        TieneVolante = tieneVolante;
        TieneAireAcondicionado = tieneAireAcondicionado;
    }

    public boolean isTieneCajuela() {
        return tieneCajuela;
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public int getAsientos() {
        return asientos;
    }

    public int getTienePuertas() {
        return tienePuertas;
    }

    public boolean isTieneVolante() {
        return tieneVolante;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneCajuela(boolean tieneCajuela) {
        this.tieneCajuela = tieneCajuela;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setTienePuertas(int tienePuertas) {
        this.tienePuertas = tienePuertas;
    }

    public void setTieneVolante(boolean tieneVolante) {
        this.tieneVolante = tieneVolante;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

   
}