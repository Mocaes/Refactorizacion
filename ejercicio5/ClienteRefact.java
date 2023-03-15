package ejercicio5;

public class ClienteRefact {
    private String nombre;
    private static double saldo;
    private Producto[] productosComprados;
    private int numProductosComprados;

    public ClienteRefact(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.productosComprados = new Producto[10];
        this.numProductosComprados = 0;
    }

    public void agregarProductoComprado(Producto producto) {
        productosComprados[numProductosComprados] = producto;
        numProductosComprados++;
    }

    public void restarSaldo(double valor) {
        saldo -= valor;
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
    

    public static class Producto {
        private String nombre;
        private double valor;

        public Producto(String nombre, double valor) {
            this.nombre = nombre;
            this.valor = valor;
        }
        
        
        
        public void comprar(ClienteRefact ClienteRefact) {
            if (ClienteRefact.getSaldo() >= valor) {
                ClienteRefact.restarSaldo(valor);
                ClienteRefact.agregarProductoComprado(this);
                System.out.println(ClienteRefact.getNombre()+" ha comprado "
                +nombre+" por un valor de "+valor+"€");
            } else {
                System.out.println(ClienteRefact.getNombre()+" no tiene suficiente" +
                        " saldo para comprar "+nombre);
            }
        }

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
            ClienteRefact ClienteRefact1 = new ClienteRefact("Pablo", 169.69);
            Producto producto1 = new Producto("Minecraft",20);
            Producto producto2 = new Producto("Call of Duty: Black Cock 3",69);
            producto1.comprar(ClienteRefact1);
            producto2.comprar(ClienteRefact1);
            System.out.println(ClienteRefact1.getNombre()+ " ha comprado los siguientes productos: ");
            for (int i = 0; i < ClienteRefact1.getNumProductosComprados(); i++) {
                System.out.println(ClienteRefact1.getProductosComprados()[i].getNombre());
            }
        }
    }
}
