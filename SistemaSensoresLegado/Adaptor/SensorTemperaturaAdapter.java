package SistemaSensoresLegado.Adaptor;

import SistemaSensoresLegado.Sensor.Sensor;
import SistemaSensoresLegado.Legado.SensorTemperatura;

public class SensorTemperaturaAdapter implements Sensor {
    private final SensorTemperatura sensorTemperatura;

    public SensorTemperaturaAdapter(SensorTemperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    @Override
    public String lerValor() {
        return sensorTemperatura.lerValor();
    }

    @Override
    public String getTipo() {
        return sensorTemperatura.getTipo();
    }
}
