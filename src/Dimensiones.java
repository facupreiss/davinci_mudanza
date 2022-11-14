public class Dimensiones {

    private double altura;
    private double ancho;
    private double profundidad;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public Dimensiones(double altura, double ancho, double profundidad) {
        setAltura(altura);
        setAncho(ancho);
        setProfundidad(profundidad);
    }

}
