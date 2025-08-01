package SistemaSensoresLegado;

public class DisplayConsole implements Display {
    @Override
    public void mostrarDados(String tipo, String valor) {
        System.out.println("[" + tipo + "]: " + valor);
    }
}
