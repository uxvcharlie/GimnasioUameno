package com.services;

import com.model.Miembro;

public class FacturacionServiceImpl implements IFacturacionService {

    @Override
    public void generarFacturaMensual(Miembro miembro) {
        double cuota = miembro.calcularCuotaMensual();
        miembro.aplicarCargo(cuota);
        System.out.println("Factura generada para " + miembro.getNombre() + " por monto de: C$" + cuota);
    }
}
