public class ProcesarOrdenDHL {
    private IDHLEnvio dhlEnvio;

    public ProcesarOrdenDHL(IDHLEnvio dhlEnvio) {
        this.dhlEnvio = dhlEnvio;
    }

    public void procesar(Orden orden) {
        dhlEnvio.enviarPorDHL(orden);
    }
}