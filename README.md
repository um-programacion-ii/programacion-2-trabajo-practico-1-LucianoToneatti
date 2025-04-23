[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/-JQrLgaz)
# 🧠 Trabajo Práctico: Sistema de Gestión de Vehículos (Java + SOLID + GitHub)

## Alumno: Luciano Toneatti

## ⚙️ Requisitos previos
Para compilar y ejecutar este proyecto necesitás tener instalado lo siguiente:

✅ Java Development Kit (JDK) 8 o superior

✅ IntelliJ IDEA (recomendado)

✅ Git para clonar el repositorio desde GitHub

## 🚀 Instrucciones para ejecutar el proyecto
🛠️ Pasos para compilar y ejecutar:

Clonar el repositorio: git@github.com:um-programacion-ii/programacion-2-trabajo-practico-1-Luciano-Toneatti.git

Navegar al directorio del proyecto:
cd programacion-2-trabajo-practico-1-Luciano-Toneatti
cd src

Compilar la carpeta src 

Ejecutar el programa de Main que esta dentro de src/app:
java app.Main

## 💡 Ejemplos de uso
Cuando ejecutes el proyecto, se imprimirá en consola una lista de vehículos gestionados (camiones y autos) con sus datos:

🚛 Vehículo: Camión
Patente: ABC123
Marca: Scania
Año: 2020
Capacidad de Carga: 5000.0kg
¿Tiene acoplado?: Sí

🚗 Vehículo: Auto
Patente: XYZ789
Marca: Toyota
Año: 2022
Capacidad de Carga: 300.0kg
Cantidad de pasajeros: 5


## 📌 Objetivo General

Desarrollar una aplicación en Java para gestionar vehículos de una empresa, aplicando los principios de programación orientada a objetos y los **primeros tres principios SOLID**:  
**SRP (Single Responsibility), OCP (Open/Closed) y LSP (Liskov Substitution)**.

A lo largo del trabajo se utilizará también la estructura `ArrayList` para manejar listas dinámicas de vehículos.

Además, deberán aplicar buenas prácticas de **gestión de proyectos usando GitHub**: `Issues`, `Milestones`, `Projects` y `Pull Requests`.

---

## 🧩 Tecnologías y Herramientas

- Java SE (cualquier versión compatible con JDK 8+)
- Git y GitHub
- GitHub Projects
- GitHub Issues
- GitHub Pull Requests

---

## 📘 Etapas del Trabajo

El trabajo está dividido en etapas. Cada etapa deberá registrarse como un **Milestone** en GitHub.

### Etapa 1: Clases Básicas
- Crear la clase `Vehiculo` con atributos: `patente`, `marca`, `año`, `capacidadCargaKg`.
- Agregar constructor, getters/setters y método `mostrarInformacion()`.
- Crear la clase `Main` que cree e imprima al menos 3 vehículos.

### Etapa 2: Aplicar SRP
- Extraer la responsabilidad de impresión a una nueva clase `VehiculoPrinter`.
- Eliminar el método `mostrarInformacion()` de `Vehiculo`.

### Etapa 3: Aplicar OCP
- Crear subclase `Camion` con atributo `tieneAcoplado`.
- Modificar `VehiculoPrinter` para imprimir camiones sin modificar el código existente (usar polimorfismo).

### Etapa 4: Aplicar LSP
- Crear subclase `Auto` con atributo `cantidadPasajeros`.
- Validar que se puedan tratar todos los vehículos desde una misma interfaz (`Vehiculo`).

### Etapa 5: Uso de ArrayList
- Usar `ArrayList<Vehiculo>` para gestionar todos los vehículos.
- Recorrer e imprimir usando `VehiculoPrinter`.
- (Opcional) Buscar por patente dentro de la lista.

---

## ✅ Entrega y Flujo de Trabajo con GitHub

Cada grupo debe:

1. Usar la asignación del repositorio compartido por Slack

2. **Proteger la rama main**:
    - Ir a Settings > Branches > Branch protection rules
    - Agregar regla para la rama `main`
    - Requerir que los tests pasen antes de mergear
    - No permitir push directo a main

3. Crear un **Project** nuevo tipo _Kanban_ con columnas:
    - `To Do`, `In Progress`, `In Review`, `Done`

4. Crear un **Milestone por etapa**:
    - `Etapa 1 - Clases básicas`
    - `Etapa 2 - SRP`
    - `Etapa 3 - OCP`
    - `Etapa 4 - LSP`
    - `Etapa 5 - ArrayList`

5. Crear **Issues** por cada tarea concreta, por ejemplo:
    - "Crear clase Vehiculo"
    - "Crear clase VehiculoPrinter"
    - "Crear subclase Camion"

   Cada Issue debe:
    - Tener un título claro y descripción breve
    - Estar asociado a un `Milestone` y al `Project`
    - Tener asignado al menos un miembro del equipo
    - Incluir labels apropiados (ej: `enhancement`, `bug`, `documentation`)
    - Ser implementado en una nueva rama (branch) creada desde `main`
    - La rama debe seguir el formato: `feature/descripcion-corta` o `fix/descripcion-corta`
    - Ser cerrado mediante un Pull Request (PR) que mergee la rama a `main`
    - Actualizar su estado en el Kanban board según corresponda

6. Hacer **Pull Requests** por cada Issue.
    - Cada PR debe mencionar el Issue que cierra (ej: `Closes #2`)
    - Debe incluir los mismos labels que el Issue asociado
    - Debe estar asociado al mismo Milestone que el Issue
    - Debe estar asociado al mismo Project que el Issue
    - El código debe estar revisado antes de ser fusionado a `main`
    - Al mergear, actualizar el estado del Issue en el Kanban board a `Done`

---

## ✅ Ejemplo de Issue

### Título
Crear clase Vehiculo

### Descripción
Implementar la clase base `Vehiculo` que servirá como punto de partida para la jerarquía de vehículos.

#### Requisitos
- Crear la clase con los siguientes atributos privados:
  ```java
  private String patente;
  private String marca;
  private int anio;
  private double capacidadCargaKg;
  ```
- Implementar:
    - Constructor con todos los atributos
    - Getters y setters para cada atributo
    - Método `mostrarInformacion()` que imprima todos los datos del vehículo

#### Validaciones
- La patente no puede ser null ni vacía
- El año debe ser mayor a 1900 y menor o igual al año actual
- La capacidad de carga debe ser positiva

#### Criterios de Aceptación
- [ ] La clase compila sin errores
- [ ] Se incluyen todos los atributos requeridos
- [ ] Se implementan todos los métodos necesarios
- [ ] Se incluyen las validaciones especificadas
- [ ] Se agrega documentación JavaDoc básica

#### Notas Adicionales
- Considerar agregar constantes para los valores mínimos/máximos
- Incluir mensajes de error descriptivos en las validaciones

### Labels
- `enhancement`
- `good first issue`

### Asignación
- Milestone: `Etapa 1 - Clases básicas`
- Project: `Sistema de Gestión de Vehículos`
- Estado: `To Do`

## ✅ Requisitos para la entrega final

- ✅ Todos los Issues cerrados
- ✅ Todos los Milestones completos
- ✅ Todos los PRs revisados y mergeados
- ✅ Project con todas las tareas en `Done`
- ✅ Este archivo `README.md` completo con:
    - Nombre y apellido del alumno
    - Instrucciones detalladas de cómo ejecutar el proyecto
    - Requisitos previos (JDK, IDE, etc.)
    - Pasos para compilar y ejecutar
    - Ejemplos de uso

> ⏰ **Fecha de vencimiento**: 09/04/2025 a las 13:00 hs