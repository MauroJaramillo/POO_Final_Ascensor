//Representa la supuesta puerta del ascensor
public class Puerta {
    //sirve para false = cerrada, true = abierta
    private boolean abierta;
    //es el "sensor" que detecta si algo esta bloqueando la puerta
    private boolean sensorObstaculo;

    //constructor: inicia la puerta cerrada y sin obstaculos
    public Puerta() {
        abierta = false;
        sensorObstaculo = false;
    }

    //abre la puerta
    public void abrir() {
        abierta = true;
        System.out.println("Puerta abierta");
    }

    //intenta cerrarse si el sensor detecta si hay un obstaculo ps no se cierra
    public void cerrar () {
        if (sensorObstaculo) {
            System.out.println("¡Se detecto un obstaculo! No se puede cerrar la puerta");
        } else {
            abierta = false;
            System.out.println("Puerta cerrada");
        }
    }

    //Sirve para activar o desactivar el sensor
    public void activarSensor(boolean estado) {
        sensorObstaculo = estado;
    }

    public boolean estaAbierta() {
        return abierta;
    }
}
