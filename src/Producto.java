public class Producto {

    private String codigo;
    private String nombre;
    private int stock;
    private double precio;

    public Producto(String codigo, String nombre, int stock, double precio) {
        if (stock < 0) {
            System.out.println("El stock no puede ser negativo.");
        }
        if (precio <= 0) {
            System.out.println("El precio debe ser mayor a cero.");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public boolean vender(int cantidad) {
            if (cantidad <= stock) {
                stock -= cantidad;
                return true;
            } else {
                System.out.println("Stock insuficiente.");
                return false;
            }
    }

    public void reponer(int cantidad) {
        if(cantidad > 0) {
            stock += cantidad;
        }
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double nuevoPrecio) {
        if(nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
        } else {
            System.out.println("El precio debe ser mayor a cero.");
        }
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("C01", "Camisa", 5, 1160);

        p1.vender(4);
        p1.reponer(10);
        p1.setPrecio(1044);

        System.out.println("Producto: " + p1.getNombre() + ", Precio: $" + p1.getPrecio() + ", Stock: " + p1.getStock());
    }
}
