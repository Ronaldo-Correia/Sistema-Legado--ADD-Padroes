package SistemaSensoresLegado;

public class SensorLuminosidadeFactory extends SensorFactory {
    @Override
    public Sensor criarSensor() {
        return SensorLuminosidade.getInstance();
    }
}
