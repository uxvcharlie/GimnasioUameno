package com.model;

public abstract class Miembro {
    // Atributos estrictamente encapsulados
    private final String identificacion;
    private final String nombre;
    private double saldoPendiente;
    private boolean accesoPermitido;

    public Miembro(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.saldoPendiente = 0.0;
        this.accesoPermitido = true;
    }


    public abstract double calcularCuotaMensual();

    public void registrarPago(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto del pago debe ser mayor a cero.");
        }
        this.saldoPendiente -= monto;
        if (this.saldoPendiente <= 0) {
            this.saldoPendiente = 0;
            this.accesoPermitido = true; // Se restaura el acceso al limpiar la deuda
        }
    }

    public void aplicarCargo(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El cargo debe ser mayor a cero.");
        }
        this.saldoPendiente += monto;
        this.accesoPermitido = false; // Se bloquea el acceso automáticamente por deuda
    }

    // Getters y Setters
    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldoPendiente() {
        return saldoPendiente;
    }


    public boolean isAccesoPermitido() {
        return accesoPermitido;
    }
}