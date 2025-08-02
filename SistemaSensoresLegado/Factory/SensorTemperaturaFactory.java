package SistemaSensoresLegado.Factory;
import SistemaSensoresLegado.Sensor.Sensor;
import SistemaSensoresLegado.Legado.SensorTemperatura;

public class SensorTemperaturaFactory extends SensorFactory {
    public Sensor criarSensor() {
        return SensorTemperatura.getInstance();
    }
}
