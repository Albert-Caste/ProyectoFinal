package co.edu.uniquindio.model;

public class Moto extends Vehiculo {
    private Cilindraje cilindraje;

    public Moto (String placa, String color, Cilindraje cilindraje) {
        super(placa,color);
        this.cilindraje = cilindraje;

    }


    @Override
    public double calcularServicioHoras(int horas){
        double servicio = 0;

        return servicio;

    }
}
