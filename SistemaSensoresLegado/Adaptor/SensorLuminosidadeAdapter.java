package SistemaSensoresLegado.Adaptor;

import SistemaSensoresLegado.Sensor.Sensor;
import SistemaSensoresLegado.Legado.SensorLuminosidade;

public class SensorLuminosidadeAdapter implements Sensor {
    private final SensorLuminosidade sensorLuminosidade;

    public SensorLuminosidadeAdapter(SensorLuminosidade sensorLuminosidade) {
        this.sensorLuminosidade = sensorLuminosidade;
    }

    @Override
    public String lerValor() {
        return sensorLuminosidade.lerValor();
    }

    @Override
    public String getTipo() {
        return sensorLuminosidade.getTipo();
    }
}
