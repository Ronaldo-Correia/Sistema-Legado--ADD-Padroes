package SistemaSensoresLegado.Factory;

import SistemaSensoresLegado.Sensor.Sensor;
import SistemaSensoresLegado.Legado.SensorUmidade;

public class SensorUmidadeFactory extends SensorFactory {
    @Override
    public Sensor criarSensor() {
        return SensorUmidade.getInstance();
    }
}
