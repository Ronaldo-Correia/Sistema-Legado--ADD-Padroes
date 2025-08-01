package SistemaSensoresLegado;
import java.util.ArrayList;
import java.util.List;

public class SensorManager {
    private List<Sensor> sensores = new ArrayList<>();

    public void adicionarSensor(SensorFactory fabrica) {
        Sensor sensor = fabrica.criarSensor();
        sensores.add(sensor);
    }
    public void exibirDados(Display display) {
        for (Sensor sensor : sensores) {
            display.mostrarDados(sensor.getTipo(), sensor.lerValor());
        }
    }

}

