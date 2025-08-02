package SistemaSensoresLegado.Factory;

import SistemaSensoresLegado.Sensor.Sensor;
import SistemaSensoresLegado.Legado.SensorLuminosidade;

public class SensorLuminosidadeFactory extends SensorFactory {
    @Override
    public Sensor criarSensor() {
        return SensorLuminosidade.getInstance();
    }
}
