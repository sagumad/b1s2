package com.example;

public class jugadorFutbol {

    private String nombre;
    private int edad;
    private String posicion;
    private int numero;
    private String equipo;

    public jugadorFutbol(String nombre, String posicion, int numero, String equipo, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
        this.equipo = equipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("Posición: " + posicion);
        System.out.println("Número: " + numero);
        System.out.println("Equipo: " + equipo);
    }

    public void cambiarPosicion(String nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    public void presentarJugador() {
        System.out.println("El jugador " + nombre + " con el número " + numero + " juega como " + posicion + "."
                + "Su equipo es: " + equipo + " y tiene " + edad + " años.");
    }

}
