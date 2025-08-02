package SistemaSensoresLegado.Decorator;
import SistemaSensoresLegado.Sensor.Sensor;


public class Formatacao extends SensorDecorator {
    public Formatacao(Sensor sensor) {
        super(sensor);
    }

    @Override
    public String lerValor() {
        String valor = super.lerValor();
        switch (getTipo()) {
            case "Temperatura": return valor + " °C";
            case "Umidade": return valor + " %";
            case "Luminosidade": return valor + " lux";
            default: return valor;
        }
    }
}