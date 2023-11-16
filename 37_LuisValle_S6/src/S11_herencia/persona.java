/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_herencia;

/**
 *
 * @author Luis
 */
public class persona {
    
    private String nombre;
    private int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    
    public void hablar(){
        System.out.println("la persona habla con su amigo");
    }
    public void caminar(){
        System.out.println("el joven camina hacia su casa");
    }
    
}
