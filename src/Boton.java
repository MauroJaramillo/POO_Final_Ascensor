//Esta clase representa un boton x del ascensor puede ser para subir o bajar.
public class Boton {
    //Esto indica si esta presionado
    private boolean presionado;

    //marca el boton como presionado y muestra un mensaje
    public void presionar() {
        presionado = true;
        System.out.println("Boton Presionado");
    }

    //Apaga el boton
    public void apagar() {
        presionado = false;
    }

    //Retoma si el boton esta presionado
    public boolean estaPresionado() {
        return presionado;
    }
}
