package co.edu.uniquindio.model;

public class Cliente extends Persona {

    private Usuario tipoUsuario;

    public Cliente (String nombre, String documento, String apellido, String telefono, Usuario tipoUsuario) {
        super(nombre, documento, apellido, telefono);
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }





}
