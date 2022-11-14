import java.util.ArrayList;

public class MedioDeTransporte {

    private ArrayList<ObjetoTransportable> transportable;
    private double capacidadMaxima;
    private Dimensiones dimensiones;
    private double capacidadActual;
    private int cantidadMaxima;

    public MedioDeTransporte(double capacidadMaxima, Dimensiones dimensiones, int cantidadMaxima)
    {
        setTransportable(new ArrayList<ObjetoTransportable>(0));
        setCapacidadActual(0);
        setCantidadMaxima(3);
        setCapacidadMaxima(capacidadMaxima);
        setDimensiones(dimensiones);
    }

    public ArrayList<ObjetoTransportable> getTransportable() {
        return transportable;
    }

    public void setTransportable(ArrayList<ObjetoTransportable> transportable) {
        this.transportable = transportable;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }


    public void cargar(ObjetoTransportable transportable) {
        if (getTransportable().size() >= getCapacidadMaxima()) return;
        getTransportable().add(transportable);
    }
}
