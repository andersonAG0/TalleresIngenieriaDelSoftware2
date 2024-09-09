public class Main {
    public static void main(String[] args) {
        Orden orden = new Orden("1", "Compra de computadores", "Cr 33, Colombia");

        // Usar UPS
        IUPSEnvio upsServicio = new UPSServicioImpl();
        ProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPS(upsServicio);
        procesarOrdenUPS.procesar(orden);

        // Usar FedEx
        IFedExEnvio fedExServicio = new FedExServicioImpl();
        ProcesarOrdenFedEx procesarOrdenFedEx = new ProcesarOrdenFedEx(fedExServicio);
        procesarOrdenFedEx.procesar(orden);

        // Usar DHL
        IDHLEnvio dhlServicio = new DHLServicioImpl();
        ProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHL(dhlServicio);
        procesarOrdenDHL.procesar(orden);
    }
}
