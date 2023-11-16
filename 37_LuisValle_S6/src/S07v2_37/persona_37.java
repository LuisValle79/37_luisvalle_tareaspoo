/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07v2_37;

public class persona_37 {
    
    /*Atributos*/
    int edad;
    String nombre;
    String sexo;
    
    /*Metodos*/
    public void saludar(){
        System.out.println("buenos dias"+nombre);
    }
    public void hablar(String sexo,String nombre){
        System.out.println("buenas tardes "+nombre+" de sexo "+sexo);
    }
    
    /*sobrecarga de metodos*/
    public void saludar(String nombre){
        System.out.println("buenas noches "+nombre);
    }
    
    /*metodos con parametros y argumentos*/
    public void saludar(String nombre, int edad){
        System.out.println("hola me llamo "+nombre+" y tengo "+edad+" años.");
    }
    public void hablar(String nombre, int edad){
        System.out.println("buenos dias me llamo"+nombre+" y tengo "+edad+" años.");
    }
    public void hablar(String nombre, String sexo, int edad){
        System.out.println(nombre+" es de sexo "+sexo+"y tiene "+edad+" años");
    }
               
    /*metodos con retorno*/        
    public int metodoInt(){
    return 20;
    }
    public String metodoString(){
    return "buenas noches colega";
    }
    public boolean metodoBoolean(){
    return true;
    }       
}
