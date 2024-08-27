// Clase base abstracta para Calculo
abstract class Calculo {
    protected double producto;
    protected int cantidad;

    public Calculo(double producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public abstract double calcularImpuesto();
}

// Clase concreta para CalculoImpuestoIva
class CalculoImpuestoIva extends Calculo {
    private final double tasaIva = 0.19; // IVA del 19%

    public CalculoImpuestoIva(double producto, int cantidad) {
        super(producto, cantidad);
    }

    @Override
    public double calcularImpuesto() {
        return producto * cantidad * tasaIva;
    }
}

// Clase concreta para CalculoImpuestoReteIva
class CalculoImpuestoReteIva extends Calculo {
    private final double tasaReteIva = 0.10; // Rete IVA del 10%

    public CalculoImpuestoReteIva(double producto, int cantidad) {
        super(producto, cantidad);
    }

    @Override
    public double calcularImpuesto() {
        return producto * cantidad * tasaReteIva;
    }
}

// Clase concreta para CalculoImpuestoSaludable con tasa configurable
class CalculoImpuestoSaludable extends Calculo {
    private double tasaSaludable; // IVA Saludable

    public CalculoImpuestoSaludable(double producto, int cantidad, double tasaSaludable) {
        super(producto, cantidad);
        this.tasaSaludable = tasaSaludable;
    }

    @Override
    public double calcularImpuesto() {
        return producto * cantidad * tasaSaludable;
    }
}

// Clase concreta para CalculoImpuestoIca con tasa configurable
class CalculoImpuestoIca extends Calculo {
    private double tasaIca; // ICA

    public CalculoImpuestoIca(double producto, int cantidad, double tasaIca) {
        super(producto, cantidad);
        this.tasaIca = tasaIca;
    }

    @Override
    public double calcularImpuesto() {
        return producto * cantidad * tasaIca;
    }
}

// Clase principal para pruebas
public class Factura {
    public static void main(String[] args) {
        double precioProducto = 100.0;
        int cantidad = 2;

        Calculo impuestoIva = new CalculoImpuestoIva(precioProducto, cantidad);
        Calculo impuestoReteIva = new CalculoImpuestoReteIva(precioProducto, cantidad);

        Calculo impuestoSaludable = new CalculoImpuestoSaludable(precioProducto, cantidad, 0.05);
        Calculo impuestoIca = new CalculoImpuestoIca(precioProducto, cantidad, 0.10);

        System.out.println("Impuesto IVA: " + impuestoIva.calcularImpuesto());
        System.out.println("Impuesto ReteIVA: " + impuestoReteIva.calcularImpuesto());
        System.out.println("Impuesto Saludable: " + impuestoSaludable.calcularImpuesto());
        System.out.println("Impuesto ICA: " + impuestoIca.calcularImpuesto());
    }
}
