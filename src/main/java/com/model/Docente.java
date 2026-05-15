package com.model;

public class Docente extends Miembro {
    private String departamento;

    public Docente(String identificacion, String nombre, String departamento) {
        super(identificacion, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double calcularCuotaMensual() {
        // Tarifa estándar para docentes
        return 25.00;
    }
}
