package co.edu.uniquindio.model;

public class Cliente {
    private String nombre;
    private String idCliente;
    private Usuario usuario;

    public Cliente(String nombre, String idCliente, Usuario usuario) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.usuario = usuario;
    }
}
