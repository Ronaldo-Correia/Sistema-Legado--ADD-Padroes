package SistemaSensoresLegado.Decorator;
import SistemaSensoresLegado.Sensor.Sensor;

public class Log extends SensorDecorator {
    public Log(Sensor sensor) {
        super(sensor);
    }

    @Override
    public String lerValor() {
        String valor = super.lerValor();
        System.out.println("[LOG] " + getTipo() + " lida: " + valor);
        return valor;
    }
}