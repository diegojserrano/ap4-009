public class ClienteOnline extends Cliente {
    private String email;

    public ClienteOnline() {
    }

    public ClienteOnline(int numero, String nombre, String email) {
        // Llamo al constructor de la clase base
        super(numero, nombre);
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Soy un cliente online " + numero + " " + nombre + " " + email;
    }
}
