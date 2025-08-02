package SistemaSensoresLegado.Adaptor;

import SistemaSensoresLegado.Sensor.Sensor;
import SistemaSensoresLegado.Legado.SensorUmidade;

public class SensorUmidadeAdapter implements Sensor {
    private final SensorUmidade sensorUmidade;

    public SensorUmidadeAdapter(SensorUmidade sensorUmidade) {
        this.sensorUmidade = sensorUmidade;
    }

    @Override
    public String lerValor() {
        return sensorUmidade.lerValor();
    }

    @Override
    public String getTipo() {
        return sensorUmidade.getTipo();
    }
}
