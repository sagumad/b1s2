package com.example;

public class Main {
    public static void main(String[] args) {

        estadio estadio1 = new estadio("Estadio atanacio girardot", "Medellin, Colombia", 46000);
        estadio estadio2 = new estadio("Estadio deportivo Cali", "Cali, Colombia", 52000);

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();

        jugadorFutbol jugador1 = new jugadorFutbol("James Rodriguez", "centrocampista", 10, "madrid", 32);
        jugadorFutbol jugador2 = new jugadorFutbol("Falcao Garcia", "delantero", 9, "millonarios", 37);
        jugadorFutbol jugador3 = new jugadorFutbol("David Ospina", "portero", 1, "nacional", 35);



        jugador1.mostrarInformacion();
        jugador2.mostrarInformacion();  
        jugador3.mostrarInformacion();

        jugador2.cambiarPosicion("defensa");
        jugador2.mostrarInformacion();

        jugador1.presentarJugador();
        jugador2.presentarJugador();
        jugador3.presentarJugador();
    }
}
