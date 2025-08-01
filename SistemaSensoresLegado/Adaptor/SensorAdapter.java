package SistemaSensoresLegado.Adaptor;

import SistemaSensoresLegado.Sensor.Sensor;

/**
 * Adapter para sensores legados, permitindo que sejam usados no novo sistema modular.
 */
public class SensorAdapter implements Sensor {
    private Object sensorLegado;

    public SensorAdapter(Object sensorLegado) {
        this.sensorLegado = sensorLegado;
    }

    @Override
    public String lerValor() {
        // Chama o método correto do sensor legado
        if (sensorLegado instanceof SistemaSensoresLegado.Legado.SensorLuminosidade) {
            return ((SistemaSensoresLegado.Legado.SensorLuminosidade) sensorLegado).lerValor();
        } else if (sensorLegado instanceof SistemaSensoresLegado.Legado.SensorTemperatura) {
            return ((SistemaSensoresLegado.Legado.SensorTemperatura) sensorLegado).lerValor();
        } else if (sensorLegado instanceof SistemaSensoresLegado.Legado.SensorUmidade) {
            return ((SistemaSensoresLegado.Legado.SensorUmidade) sensorLegado).lerValor();
        }
        return "";
    }

    @Override
    public String getTipo() {
        if (sensorLegado instanceof SistemaSensoresLegado.Legado.SensorLuminosidade) {
            return ((SistemaSensoresLegado.Legado.SensorLuminosidade) sensorLegado).getTipo();
        } else if (sensorLegado instanceof SistemaSensoresLegado.Legado.SensorTemperatura) {
            return ((SistemaSensoresLegado.Legado.SensorTemperatura) sensorLegado).getTipo();
        } else if (sensorLegado instanceof SistemaSensoresLegado.Legado.SensorUmidade) {
            return ((SistemaSensoresLegado.Legado.SensorUmidade) sensorLegado).getTipo();
        }
        return "";
    }
}
