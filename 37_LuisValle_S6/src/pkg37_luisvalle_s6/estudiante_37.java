
package pkg37_luisvalle_s6;

public class estudiante_37 {
    int edad;
    String nombre;
    String sexo;
  
    /*metodos*/
    public void jugar(){
        System.out.println("el estudiante de nombre: "+nombre+" juega futball");
    }
    public void correr(){
        System.out.println(nombre+" corre por el patio");
    }
    public void servir(){
        System.out.println("el estudiante "+nombre+" de sexo "+sexo+" sirvio a la patria");
    }
    
    /*sobrecarga de constructores*/
    
    public estudiante_37(String nombre) {
        this.nombre = nombre;
    }
        public estudiante_37(int edad, String nombre, String sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }
    
    /*sobrecarga de metodos*/
    public void jugar(int edad, String sexo){
        System.out.println("el estudiante tiene "+edad+" y es del sexo "+sexo);      
    }
    public void jugar(String nombre){
        System.out.println("el estudiante "+nombre+"es muy inteligente");
    }
    public void correr(int edad){
        System.out.println("el estudiante luis tiene "+edad+" años");
    }
    public void correr(String nombre, int edad, String sexo){
        System.out.println("el estudiante "+nombre+" de "+edad+" años es de sexo "+sexo);
    }
    
    
    /*metodos con valores de retorno*/
    public int tuedad(int edad){
        return edad;        
    }  
    public String tunombre(String nombre){
        return nombre;
    }
}
