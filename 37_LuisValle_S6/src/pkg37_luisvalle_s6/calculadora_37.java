/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg37_luisvalle_s6;

public class calculadora_37 {
    
    /*atributos*/
    int a;
    int b;
    int c;
    int result;
    
    /*metodos*/
    public void sumar(){
        result=a+b;
        System.out.println("la suma es "+result);
    }
    public void restar(){
        result=a-b;
        System.out.println("la resta es "+result);
    }
    public void multiplicar(){
        result=a*b;
        System.out.println("la multiplicacion es "+result);
    }
    
    /*sobrecarga de constructor*/
    public calculadora_37(int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }
        public calculadora_37(int b, int result) {
        this.b = b;
        this.result = result;
    }
        
    /*sobrecarga de metodos*/
    public void sumar(int a,int b){
        result=a+b;
        System.out.println("la suma es "+result);
    }
    public void sumar(int a, int b, int c){
        result=a+b+c;
        System.out.println("la suma es "+result);
    }
    public void multiplicar(int b, int c){
        result=b*c;
        System.out.println("la multiplicacion es "+result);
        }
    public void multiplicar(int a, int b, int c){
        result=a*b*c;
        System.out.println("la multimplicacion es "+result);
    }
    
    /*metodos con valores de retorno*/
     public int sesumar(int a, int b,int c){
        return a+b+c;        
    }  
    public int semultiplicar(int c, int b){
        return c*b;
    }
    public int serestar(int a, int b, int c){
        return a-b-c;
    }
}
