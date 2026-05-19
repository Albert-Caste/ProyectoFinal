package co.edu.uniquindio.model;

public class Carro extends Vehiculo {

    private TipoCarro tipoCarro;

    public Carro (String placa, String color, TipoCarro tipoCarro) {
        super(placa,color);
        this.tipoCarro = tipoCarro;

    }
    @Override
    public double calcularServicioHoras(int horas){
        double servicio = 0;

        return servicio;

    }


}
