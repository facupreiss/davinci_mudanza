public class Main {
    public static void main(String[] args) {
        MedioDeTransporte camionDisponible = new MedioDeTransporte(
                500.0,
                new Dimensiones(2.5,1.5,4),
                3
        );

        ObjetoTransportable silla = new ObjetoTransportable(
                8.0, false,
                new Dimensiones(1.0, 0.4, 0.4),
                "Silla"
        );

        ObjetoTransportable televisor = new ObjetoTransportable(
                30, true,
                new Dimensiones(1.5, 2.0, 0.1),
                "Televisor"
        );
        ObjetoTransportable sillaDeMetal = new ObjetoTransportable(
                12.0, false,
                new Dimensiones(1.0, 0.4, 0.4),
                "Silla Pesada"
        );

        ObjetoTransportable televisorViejo = new ObjetoTransportable(
                30, true,
                new Dimensiones(1.5, 2.0, 0.8),
                "Televisor Viejo"
        );

        camionDisponible.cargar(silla);
        camionDisponible.cargar(sillaDeMetal);
        camionDisponible.cargar(televisor);
        camionDisponible.cargar(televisorViejo);

    }
}
