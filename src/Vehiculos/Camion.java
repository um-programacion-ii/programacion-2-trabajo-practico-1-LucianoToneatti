package Vehiculos;

public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String obtenerInformacion() {
        return String.format(
                "Camión | Patente: %s | Marca: %s | Año: %d | Capacidad: %.2f kg | Acoplado: %s",
                getPatente(), getMarca(), getAnio(), getCapacidadCargaKg(), tieneAcoplado ? "Sí" : "No"
        );
    }
}


