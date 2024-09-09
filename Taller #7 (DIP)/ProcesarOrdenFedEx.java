public class ProcesarOrdenFedEx {
    private IFedExEnvio fedExEnvio;

    public ProcesarOrdenFedEx(IFedExEnvio fedExEnvio) {
        this.fedExEnvio = fedExEnvio;
    }

    public void procesar(Orden orden) {
        fedExEnvio.enviarPorFedEx(orden);
    }
}