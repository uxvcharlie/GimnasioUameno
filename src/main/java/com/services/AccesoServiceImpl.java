package com.services;

import com.model.Miembro;

public class AccesoServiceImpl implements IAccesoService {

    @Override
    public void procesarEntrada(Miembro miembro) {
        if (miembro.isAccesoPermitido()) {
            System.out.println("Acceso concedido a: " + miembro.getNombre());
        } else {
            System.out.println("Acceso denegado a " + miembro.getNombre() + ". Saldo pendiente: C$" + miembro.getSaldoPendiente());
        }
    }
}
