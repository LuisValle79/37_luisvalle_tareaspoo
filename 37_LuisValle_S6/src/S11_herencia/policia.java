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
public class policia extends persona {
    
    public policia(String nombre,int edad,String talla,int escuadron,int servicio){
        super(nombre,edad);
        this.escuadron=escuadron;
        this.servicio=servicio;
        this.talla=talla;
    }
    
    int escuadron;
    int servicio;
    String talla;


   
    
    public void arrestar(){
            System.out.println("el policia "+getNombre()+"arresta al delincuente");
}
    public void patrullar(){
        System.out.println("el policia patrulla en su escuadron "+escuadron);
    }
}
