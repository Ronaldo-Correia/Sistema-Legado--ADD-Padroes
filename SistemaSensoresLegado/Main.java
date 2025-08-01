package SistemaSensoresLegado;

public class Main {
    public static void main(String[] args) {
        SensorManager manager = new SensorManager();

        manager.adicionarSensor(new SensorTemperaturaFactory());
        manager.adicionarSensor(new SensorUmidadeFactory());
        manager.adicionarSensor(new SensorLuminosidadeFactory());

        Display display = new DisplayConsole();
        manager.exibirDados(display);
    }
}
