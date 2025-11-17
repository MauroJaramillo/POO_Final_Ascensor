//Representa a un "piso del edificio"
public class Piso {
    private int numero;
    private Boton botonSubir;
    private Boton botonBajar;

    //Contructor del piso
    public Piso(int numero) {
        this.numero = numero;
        botonSubir = new Boton();
        botonBajar = new Boton();
    }

    //Devuelve el numero del piso
    public int getNumero() {
        return numero;
    }

    //Devuelve el boton de subir
    public Boton getBotonSubir() {
        return botonSubir;
    }

    //Devuelve el boton d bajar
    public Boton getBotonBajar() {
        return botonBajar;
    }
}
