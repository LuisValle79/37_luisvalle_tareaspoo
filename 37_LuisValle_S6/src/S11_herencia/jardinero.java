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
public class jardinero extends persona {
    
      public jardinero(String nombre,int edad,int talla,String ciudad,String salud){
        super(nombre,edad);
        this.salud=salud;
        this.ciudad=ciudad;
        this.talla=talla;
    }
    
    String ciudad;
    int talla;
    String salud;
    
    public void mostrarDatos(){
        System.out.println("nombre "+getNombre()+"edad "+getEdad()+"talla: "+talla+"ciudad: "+ciudad+"salud: "+salud);
    }
    public void cortar(){
        System.out.println("el jardinero de la icudad de "+ciudad+" corta el cesped");
    }
}

