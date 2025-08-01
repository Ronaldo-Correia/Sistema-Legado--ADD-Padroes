package SistemaSensoresLegado;

public class SensorLuminosidade implements Sensor {
    
    private static SensorLuminosidade instancia;

    private SensorLuminosidade() {}

    public static SensorLuminosidade getInstance() {
        if (instancia == null) {
            instancia = new SensorLuminosidade();
        }
        return instancia;
    }
    @Override
    public String getTipo() {
        return "Luminosidade";
    }

    @Override
    public String lerValor() {
        return lerLuminosidade() + " lux";
    }

    private int lerLuminosidade() {
        return 850;
    }
}
