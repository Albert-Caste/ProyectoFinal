package co.edu.uniquindio.model;

public class Operador extends Persona {

        private String codigoEmpleado;

        public Operador(String nombre, String documento, String apellido, String telefono, String codigoEmpleado) {
            super(nombre, documento, apellido, telefono);
            this.codigoEmpleado = codigoEmpleado;

        }

}
