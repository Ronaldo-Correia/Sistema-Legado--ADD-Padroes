package SistemaSensoresLegado;

public class SensorTemperatura implements Sensor {
    private static SensorTemperatura instancia;

    private SensorTemperatura() {}

    public static SensorTemperatura getInstance() {
        if (instancia == null) {
            instancia = new SensorTemperatura();
        }
        return instancia;
    }
    public String getTipo() {
        return "Temperatura";
    }

    public String lerValor() {
        return lerTemperatura() + " C";
    }

    private double lerTemperatura() {
        return 36.5;
    }

}
