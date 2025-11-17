import java.util.ArrayList;
//Este sirve para controlar el ascensor
public class Ascensor {
    private int pisoActual;
    private String direccion;
    private Puerta puerta;
    private ArrayList<Integer> solicitudes;

    //Constructor del ascensor inicia en 0
    public Ascensor() {
        pisoActual = 0;
        direccion = "Subiendo";
        puerta = new Puerta();
        solicitudes = new ArrayList<>();
    }

    //Este agrega una solicitud de piso a la lista
    public void solicitarPiso(int piso) {
        solicitudes.add(piso);
        System.out.println("Solicitud para ir al piso " + piso);
    }

    //Este mueve el ascensor un piso a la vez
    public void mover() {
        if (solicitudes.isEmpty()) {
            System.out.println("No hay solicitudes");
            return;
        }

        int destino = solicitudes.get(0);

        if (destino > pisoActual) {
            direccion = "Subiendo";
            pisoActual++;
            System.out.println("Ascensor en piso " + pisoActual);
        } else if (destino < pisoActual) {
            direccion = "Bajando";
            pisoActual--;
            System.out.println("Ascensor en piso " + pisoActual);
        } else {
            System.out.println("Ascensor llego al piso " + pisoActual);
            puerta.abrir();
            solicitudes.remove(0);
        }
    }

    //Este devuelve al piso actual del ascensor
    public int getPisoActual() {
        return pisoActual;
    }

    //Este devuelve la puerta del ascensor
    public Puerta getPuerta() {
        return puerta;
    }
}
