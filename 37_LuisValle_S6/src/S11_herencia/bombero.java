/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_herencia;

public class bombero extends persona {
    
    public bombero(String nombre,int edad,String talla,String ciudad,String apellido){
        super(nombre,edad);
        this.apellido=apellido;
        this.ciudad=ciudad;
        this.talla=talla;
    }
    
    private String talla;
    private String ciudad;
    private String apellido;
    
    
    public void mostrarDatos(){
        System.out.println("nombre "+getNombre()+"apellido: "+apellido+"edad: "+getEdad());
    }
    public void apagar(){
        System.out.println("el bombero "+apellido+" apaga el incendio");
    }
}
