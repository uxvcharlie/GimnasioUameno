```mermaid
classDiagram
    class Miembro {
        <<abstract>>
        -String identificacion
        -String nombre
        -double saldoPendiente
        -boolean accesoPermitido
        +Miembro(String, String)
        +calcularCuotaMensual()* double
        +registrarPago(double monto) void
        +aplicarCargo(double monto) void
        +getIdentificacion() String
        +getNombre() String
        +getSaldoPendiente() double
        +isAccesoPermitido() boolean
    }

    class Estudiante {
        -String carrera
        +Estudiante(String, String, String)
        +getCarrera() String
        +setCarrera(String) void
        +calcularCuotaMensual() double
    }

    class Docente {
        -String departamento
        +Docente(String, String, String)
        +getDepartamento() String
        +setDepartamento(String) void
        +calcularCuotaMensual() double
    }

    class IAccesoService {
        <<interface>>
        +procesarEntrada(Miembro miembro) boolean
    }

    class IFacturacionService {
        <<interface>>
        +generarFacturaMensual(Miembro miembro) void
    }

    class AccesoServiceImpl {
        +procesarEntrada(Miembro miembro) boolean
    }

    class FacturacionServiceImpl {
        +generarFacturaMensual(Miembro miembro) void
    }

    Miembro <|-- Estudiante : Hereda de
    Miembro <|-- Docente : Hereda de
    
    IAccesoService <|.. AccesoServiceImpl : Implementa
    IFacturacionService <|.. FacturacionServiceImpl : Implementa
    
    IAccesoService ..> Miembro : Usa
    IFacturacionService ..> Miembro : Usa
