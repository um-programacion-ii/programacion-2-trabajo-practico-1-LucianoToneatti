package app;

import Vehiculos.Auto;
import Vehiculos.Camion;
import Vehiculos.Vehiculo;
import Vehiculos.VehiculoPrinter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Auto auto1 = new Auto("ABC123", "Toyota", 2015, 500, 5);
        Camion camion1 = new Camion("DEF456", "Mercedes", 2010, 8000, true);
        Camion camion2 = new Camion("GHI789", "Volvo", 2020, 10000, false);

        vehiculos.add(auto1);
        vehiculos.add(camion1);
        vehiculos.add(camion2);

        System.out.println("🚗 Lista de vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            VehiculoPrinter.imprimir(vehiculo);
        }

        // Búsqueda por patente
        String patenteBuscada = "DEF456";
        System.out.println("\n🔍 Buscando vehículo con patente " + patenteBuscada + "...");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equalsIgnoreCase(patenteBuscada)) {
                System.out.println("✅ Vehículo encontrado:");
                VehiculoPrinter.imprimir(vehiculo);
            }
        }
    }
}





