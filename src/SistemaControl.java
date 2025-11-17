import java.util.ArrayList;
//Este ya es el definitivo este controla todo el sistema.
public class SistemaControl {
    private Ascensor ascensor;
    private ArrayList<Piso> pisos;

    //Constructor del sistema
    public SistemaControl(int cantidadPisos) {
        ascensor = new Ascensor();
        pisos = new ArrayList<>();

        for (int i = 0; i < cantidadPisos; i++) {
            pisos.add(new Piso(i));
        }
    }

    //Este presiona el boton de subir un piso
    public void presionarBotonSubir(int Piso) {
        pisos.get(Piso).getBotonSubir().presionar();
        ascensor.solicitarPiso(Piso);
    }

    //Lo mismo solo que para bajar
    public void presionarBotonBajar(int Piso) {
        pisos.get(Piso).getBotonBajar().presionar();
        ascensor.solicitarPiso(Piso);
    }

    //Simula un boton para elegir el piso
    public void presionarBotonInterno(int destino) {
        ascensor.solicitarPiso(destino);
    }

    //Ejecuta un movimiento del ascensor
    public void ejecutar() {
        ascensor.mover();
    }
}
