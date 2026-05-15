package com;

import com.model.Docente;
import com.model.Estudiante;
import com.model.Miembro;
import com.services.AccesoServiceImpl;
import com.services.FacturacionServiceImpl;
import com.services.IAccesoService;
import com.services.IFacturacionService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Miembro estudiante = new Estudiante("UAM-001", "Carlos", "Ingeniería en Sistemas");
        Miembro docente = new Docente("UAM-D01", "Prof. Roberto", "Ciencias Básicas");


        IAccesoService accesoService = new AccesoServiceImpl();
        IFacturacionService facturacionService = new FacturacionServiceImpl();

        System.out.println("--- DÍA 1 ---");
        accesoService.procesarEntrada(estudiante);

        System.out.println("\n--- CIERRE DE MES ---");
        facturacionService.generarFacturaMensual(estudiante);
        facturacionService.generarFacturaMensual(docente);

        System.out.println("\n--- DÍA 2 ---");
        accesoService.procesarEntrada(estudiante);

        System.out.println("\n--- REALIZANDO PAGOS ---");
        estudiante.registrarPago(15.00);
        System.out.println("Pago registrado para Carlos.");

        System.out.println("\n--- DÍA 3 ---");
        accesoService.procesarEntrada(estudiante);
        accesoService.procesarEntrada(docente);
    }
}
