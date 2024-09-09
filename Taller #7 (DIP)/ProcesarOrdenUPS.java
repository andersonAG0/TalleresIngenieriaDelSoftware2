public class ProcesarOrdenUPS {
    private IUPSEnvio upsEnvio;

    public ProcesarOrdenUPS(IUPSEnvio upsEnvio) {
        this.upsEnvio = upsEnvio;
    }

    public void procesar(Orden orden) {
        upsEnvio.enviarPorUPS(orden);
    }
}
