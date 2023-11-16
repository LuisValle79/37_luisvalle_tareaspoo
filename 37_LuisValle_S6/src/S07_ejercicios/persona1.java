/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_ejercicios;

public class persona1 {
   
    int edad;
    String nombre;
    String ciudad;
    
    public void estudiar(String nombre, int edad){
        System.out.println("yo "+nombre+" tengo "+edad+" años");
    }
     public void responder(String nombre){
        System.out.println("yo "+nombre+" respondo todos mis examenes");
    }
      public void danzar(String nombre, int edad, String ciudad){
        System.out.println("yo "+nombre+" tengo "+edad+" años y danzare en la ciudad de "+ciudad);
    }
}
