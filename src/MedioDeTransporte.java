import sun.java2d.opengl.OGLContext;

import java.util.ArrayList;
import java.util.Arrays;

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
        if (getTransportable().size() >= getCantidadMaxima())  {
            System.out.println("Cantidad maxima excedida, su objeto no se cargo");
            return;
        }

        if (getCapacidadMaxima()<=getCapacidadActual()+transportable.getPeso()) {
            System.out.println("Peso maximo excedido, su objeto no se cargo");
            return;
        }
            getTransportable().add(transportable);
            setCapacidadActual(transportable.getPeso()+getCapacidadActual());
            System.out.println("Su objeto " + transportable.getNombre() + " fue cargado");
            System.out.println("Peso actual: " + getCapacidadActual());
    }

    public void descargar(ObjetoTransportable transportable) {
        getTransportable().remove(transportable);
        setCapacidadActual(getCapacidadActual()-transportable.getPeso());
        System.out.println("Su objeto " + transportable.getNombre() +  " fue removido");
        System.out.println("Peso actual: " + getCapacidadActual());
        }
    }

