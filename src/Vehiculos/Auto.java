package Vehiculos;

public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        super(patente, marca, anio, capacidadCargaKg);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String obtenerInformacion() {
        return String.format(
                "Auto   | Patente: %s | Marca: %s | Año: %d | Capacidad: %.2f kg | Pasajeros: %d",
                getPatente(), getMarca(), getAnio(), getCapacidadCargaKg(), cantidadPasajeros
        );
    }
}


