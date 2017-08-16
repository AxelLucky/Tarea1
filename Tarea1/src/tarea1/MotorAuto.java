/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Propietario
 */
public class MotorAuto {
    private String marca;
    private int velocidad;
    private final String color="negro";

    public MotorAuto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void arrancar(){
        System.out.println("Se arranco el motor");
    }
    public void apagar(){
        System.out.println("Se apago el motor");
    }
    public void acelerar(){
        int x=getVelocidad();
        x=x*2;
        setVelocidad(x);
        System.out.println("La velocidad se aumento a "+getVelocidad()+"porque el carro acelero");       
    }
    
    @Override
    public String toString() {
        return "MotorAuto{" + "marca=" + marca + ", velocidad=" + velocidad + ", color=" + color + '}';
    }
    
    
}
