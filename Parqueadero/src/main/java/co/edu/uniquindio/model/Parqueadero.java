package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero {

    private String nombre;
    private String nit;

    private List<Vehiculo> listVehiculos;
    private List<Espacio> listEspacios;
    private List<Persona> listPersonas;
    private List<Servicio> listServicios;

    public Parqueadero(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;

        this.listVehiculos = new ArrayList<>();
        this.listEspacios = new ArrayList<>();
        this.listPersonas = new ArrayList<>();
        this.listServicios = new ArrayList<>();
    }
}
