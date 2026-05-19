package co.edu.uniquindio.model;

public class Administrador extends Persona {

    private String codigoAdministrador;

    public Administrador(String nombre, String documento, String apellido, String telefono, String codigoAdministrador) {
        super(nombre, documento, apellido, telefono);
        this.codigoAdministrador = codigoAdministrador;
    }


}
