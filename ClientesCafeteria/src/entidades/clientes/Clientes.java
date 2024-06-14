
package entidades.clientes;

public class Clientes {
    private int idCliente;
    private String nombre;
    private String domicilio;
    private int dni;
    private int telefono;
    private String email;
    private String clave;
  
    public Clientes(){}

    public Clientes(int idCliente, String nombre, String domicilio, int dni, int telefono, String email, String clave) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }  
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", domicilio=" + domicilio + ", dni=" + dni + ", telefono=" + telefono + ", email=" + email + ", clave=" + clave + '}';
    }
    
}
