package SistemaSensoresLegado.Decorator;
import SistemaSensoresLegado.Sensor.Sensor;

public class SensorDecorator implements Sensor {
    protected Sensor sensor;

    public SensorDecorator(Sensor sensor) {
        this.sensor = sensor;
    }

    public String getTipo() {
        return sensor.getTipo();
    }

    public String lerValor() {
        return sensor.lerValor();
    }

}