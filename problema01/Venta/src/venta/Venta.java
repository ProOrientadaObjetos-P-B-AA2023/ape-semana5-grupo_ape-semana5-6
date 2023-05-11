package venta;

import java.util.Scanner;

/**
 *
 * @author joseph
 */
public class Venta {

    private double precioProducto;
    private int productos;
    private double descuento;
    private double precioFinal;

    public Venta(int productos, double precioProducto) {
        this.productos = productos;
        this.precioProducto = precioProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void CalcularDescuento() {

        if (this.precioProducto >= 1000 && this.productos >= 10) {
            this.descuento = this.precioProducto * 0.10;
        } else if (this.precioProducto < 1000) {
            this.descuento = this.precioProducto * 0.05;
        }
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void CalcularPrecioFinal() {
        this.precioFinal = precioProducto - descuento;
    }

    @Override
    public String toString() {
        return String.format("Ventas"
                + "\nProductos: %d"
                + "\nPrecio de los productos: %.2f"
                + "\nDescuento: %.2f"
                + "\nPrecioFinal: %.2f",
                this.getProductos(),
                this.getPrecioProducto(),
                this.getDescuento(),
                this.getPrecioFinal());

    }
}

class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de productos y el precio: ");
        Venta venta1 = new Venta(sc.nextInt(), sc.nextDouble());
        venta1.CalcularDescuento();
        venta1.CalcularPrecioFinal();
        System.out.println(venta1);
    }
}
