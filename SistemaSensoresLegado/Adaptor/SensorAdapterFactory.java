package SistemaSensoresLegado.Adaptor;

import SistemaSensoresLegado.Sensor.Sensor;
import SistemaSensoresLegado.Legado.SensorLuminosidade;
import SistemaSensoresLegado.Legado.SensorTemperatura;
import SistemaSensoresLegado.Legado.SensorUmidade;

public class SensorAdapterFactory {
    public static Sensor criarAdapter(Object sensorLegado) {
        return new SensorAdapter(sensorLegado);
    }

    public static Sensor criarAdapterLuminosidade() {
        return new SensorAdapter(SensorLuminosidade.getInstance());
    }

    public static Sensor criarAdapterTemperatura() {
        return new SensorAdapter(SensorTemperatura.getInstance());
    }

    public static Sensor criarAdapterUmidade() {
        return new SensorAdapter(SensorUmidade.getInstance());
    }
}
