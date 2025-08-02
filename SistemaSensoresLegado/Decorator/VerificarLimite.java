package SistemaSensoresLegado.Decorator;
import SistemaSensoresLegado.Sensor.Sensor;

public class VerificarLimite extends SensorDecorator {
    public VerificarLimite(Sensor sensor) {
        super(sensor);
    }

    @Override
    public String lerValor() {
        String valorStr = super.lerValor();
        try {
            double valor = Double.parseDouble(valorStr.replaceAll("[^\\d.]", ""));
            if ("Temperatura".equals(getTipo()) && valor > 50.0) {
                System.out.println("[ALERTA] Temperatura acima do limite!");
            }
        } catch (NumberFormatException e) {
            System.out.println("[ERRO] Valor inválido para verificação: " + valorStr);
        }
        return valorStr;
    }
}