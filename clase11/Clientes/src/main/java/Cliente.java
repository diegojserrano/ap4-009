public class Cliente {
    protected int numero;
    protected String nombre;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente() {
    }

    public Cliente(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public String toString() {
        return "Soy un cliente " + numero + " " + nombre;
    }
}
