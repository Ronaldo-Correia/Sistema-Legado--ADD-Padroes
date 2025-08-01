package SistemaSensoresLegado;


public class SensorUmidadeFactory extends SensorFactory {
    @Override
    public Sensor criarSensor() {
        return SensorUmidade.getInstance();
    }
}
