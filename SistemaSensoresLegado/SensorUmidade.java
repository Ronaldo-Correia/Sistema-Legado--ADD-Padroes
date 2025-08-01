package SistemaSensoresLegado;

public class SensorUmidade implements Sensor {
    private static SensorUmidade instancia;

    private SensorUmidade() {}

    public static SensorUmidade getInstance() {
        if (instancia == null) {
            instancia = new SensorUmidade();
        }
        return instancia;
    }
    @Override
    public String getTipo() {
        return "Umidade";
    }

    @Override
    public String lerValor() {
        return lerUmidade() + " %";
    }

    private double lerUmidade() {
        return 72.3;
    }
}
