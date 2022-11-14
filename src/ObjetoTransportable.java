public class ObjetoTransportable {

    private double peso;
    private boolean esFragil;
    private Dimensiones dimensiones;
    private String nombre;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsFragil() {
        return esFragil;
    }

    public void setEsFragil(boolean esFragil) {
        this.esFragil = esFragil;
    }

    public ObjetoTransportable(double peso, boolean esFragil, Dimensiones dimensiones, String nombre) {
       setNombre(nombre);
       setPeso(peso);
       setDimensiones(dimensiones);
       setEsFragil(esFragil);
    }
}
