package com.model;

public class Estudiante extends Miembro {
    private String carrera;

    public Estudiante(String identificacion, String nombre, String carrera) {
        super(identificacion, nombre);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public double calcularCuotaMensual() {
        // Tarifa preferencial para estudiantes
        return 15.00;
    }
}
