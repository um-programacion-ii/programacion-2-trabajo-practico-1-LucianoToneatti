package Vehiculos;

import java.time.Year;

public abstract class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        }
        if (anio < 1900 || anio > Year.now().getValue()) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y el actual.");
        }
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser mayor a 0.");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    // Método abstracto para polimorfismo
    public abstract String obtenerInformacion();
}

