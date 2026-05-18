package co.edu.uniquindio.model;

import java.util.List;

public class Parqueadero {

    private String nombre;
    private String nit;

    private List<Vehiculo> listVehiculos;
    private List<Espacio> listEspacios;
    private List<Persona> listPersonas;

    public Parqueadero(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }
}
