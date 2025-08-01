package SistemaSensoresLegado;

public class SensorTemperaturaFactory extends SensorFactory {
    public Sensor criarSensor() {
        return SensorTemperatura.getInstance();
    }
}
