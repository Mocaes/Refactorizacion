package ejercicio5;

public class Cliente {
    private String nombre;
    private double saldo;
    private Producto[] productosComprados;
    private int numProductosComprados;

    public Cliente(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.productosComprados = new Producto[10];
        this.numProductosComprados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Producto[] getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(Producto[] productosComprados) {
        this.productosComprados = productosComprados;
    }

    public int getNumProductosComprados() {
        return numProductosComprados;
    }

    public void setNumProductosComprados(int numProductosComprados) {
        this.numProductosComprados = numProductosComprados;
    }

    public void comprarProducto(Producto producto) {
        if (saldo >= producto.getValor()) {
            saldo -= producto.getValor();
            productosComprados[numProductosComprados] = producto;
            numProductosComprados++;
            System.out.println(nombre + " ha comprado " + producto.getNombre() +
                    " por un valor de " + producto.getValor());
        } else {
            System.out.println(nombre+" no tiene suficiente saldo para comprar "+
                    producto.getNombre());

        }


    }

    public static class Producto {
        private String nombre;
        private double valor;

        public Producto(String nombre, double valor) {
            this.nombre = nombre;
            this.valor = valor;
        }
        //Getters y Setters

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Cliente cliente1 = new Cliente("Juan",199.99);
            Producto producto1 = new Producto("Camisilla", 49.95);
            Producto producto2 = new Producto("Pantalón",39.95);

            cliente1.comprarProducto(producto1);
            cliente1.comprarProducto(producto2);

            System.out.println(cliente1.getNombre()+" ha comprado los siguientes" +
                    " productos: ");
            for (int i = 0; i < cliente1.getNumProductosComprados();i++) {
                System.out.println(cliente1.getProductosComprados()[i].getNombre());
            }
        }
    }
}
