package SistemaSensoresLegado.Manager;
import java.util.ArrayList;
import java.util.List;
import SistemaSensoresLegado.Display.Display;
import SistemaSensoresLegado.Factory.SensorFactory;
import SistemaSensoresLegado.Sensor.Sensor;
import SistemaSensoresLegado.Decorator.Log;
import SistemaSensoresLegado.Decorator.Formatacao;      
import SistemaSensoresLegado.Decorator.VerificarLimite;
import SistemaSensoresLegado.Adaptor.SensorLuminosidadeAdapter;
import SistemaSensoresLegado.Adaptor.SensorTemperaturaAdapter;
import SistemaSensoresLegado.Adaptor.SensorUmidadeAdapter;
import SistemaSensoresLegado.Legado.SensorLuminosidade;
import SistemaSensoresLegado.Legado.SensorTemperatura;
import SistemaSensoresLegado.Legado.SensorUmidade;


public class SensorManager {
    private List<Sensor> sensores = new ArrayList<>();

    public void adicionarSensor(SensorFactory fabrica) {
        Sensor sensor = fabrica.criarSensor();
        
        sensor = new Log(sensor);
        sensor = new Formatacao(sensor);

        if (sensor.getTipo().equalsIgnoreCase("Temperatura")) {
            sensor = new VerificarLimite(sensor);
        }

        sensores.add(sensor);
    }

    public void adicionarSensorLuminosidadeLegado() {
        Sensor sensor = new SensorLuminosidadeAdapter(SensorLuminosidade.getInstance());
        sensor = new Log(sensor);
        sensor = new Formatacao(sensor);
        sensores.add(sensor);
    }

    public void adicionarSensorTemperaturaLegado() {
        Sensor sensor = new SensorTemperaturaAdapter(SensorTemperatura.getInstance());
        sensor = new Log(sensor);
        sensor = new Formatacao(sensor);
        sensor = new VerificarLimite(sensor);
        sensores.add(sensor);
    }

    public void adicionarSensorUmidadeLegado() {
        Sensor sensor = new SensorUmidadeAdapter(SensorUmidade.getInstance());
        sensor = new Log(sensor);
        sensor = new Formatacao(sensor);
        sensores.add(sensor);
    }

    public void exibirDados(Display display) {
        for (Sensor sensor : sensores) {
            display.mostrarDados(sensor.getTipo(), sensor.lerValor());
        }
    }

}

