package SistemaSensoresLegado.Adaptor;

import SistemaSensoresLegado.Sensor.Sensor;


public class SensorAdapter implements Sensor {
    private Object sensorLegado;

    public SensorAdapter(Object sensorLegado) {
        this.sensorLegado = sensorLegado;
    }

    @Override
    public String lerValor() {
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
