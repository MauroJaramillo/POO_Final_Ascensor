//Aqui pruebo todo el sistema.
public class Main {
    public static void main(String[] args) {

        //Crea un sistema con 5 pisos
        SistemaControl sistema = new SistemaControl(5);

        //Simulacion de uso
        sistema.presionarBotonSubir(3);

        sistema.ejecutar();
        sistema.ejecutar();
        sistema.ejecutar();
        sistema.ejecutar();

        sistema.presionarBotonInterno(1);
        sistema.ejecutar();
        sistema.ejecutar();
    }
}
