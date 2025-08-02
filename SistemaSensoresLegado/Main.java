package SistemaSensoresLegado;
import SistemaSensoresLegado.Display.DisplayConsole;
import SistemaSensoresLegado.Factory.SensorLuminosidadeFactory;
import SistemaSensoresLegado.Factory.SensorTemperaturaFactory;
import SistemaSensoresLegado.Factory.SensorUmidadeFactory;
import SistemaSensoresLegado.Manager.SensorManager;
import SistemaSensoresLegado.Display.Display;
import SistemaSensoresLegado.Sensor.Sensor;


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
