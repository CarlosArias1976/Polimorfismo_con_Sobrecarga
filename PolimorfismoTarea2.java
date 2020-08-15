/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismotarea2;

/**
 *
 * @author Carlos Arias
 */

class AreaContacto{

    int CalcularArea(int ancho, int circunferencia){
    return ancho*circunferencia;
    }
    double CalcularArea(double ancho, double circunferencia){
    return ancho*circunferencia;
    }
}
    class PolimorfismoTarea2 {
    public static void main(String[] args) {
    
        AreaContacto Objeto1=new AreaContacto();
        AreaContacto Objeto2=new AreaContacto();
        AreaContacto Objeto3=new AreaContacto();
        AreaContacto Objeto4=new AreaContacto();
        AreaContacto Objeto5=new AreaContacto();
        AreaContacto Objeto6=new AreaContacto();
        AreaContacto Objeto7=new AreaContacto();
        AreaContacto Objeto8=new AreaContacto();
        
        //Neumatico 185/60R14 
        int resultado1;
        Objeto1.CalcularArea(185, 257);
        resultado1=Objeto1.CalcularArea(185, 257);
        System.out.println("Area Contacto Neumatico 185/60R14 : "+resultado1+"[mm2]");
        System.out.println("-----------------------------------");
        
        double resultado2;
        Objeto2.CalcularArea(185, 257);
        resultado2=Objeto2.CalcularArea(185, 257);
        System.out.println("Area Contacto Neumatico 185/60R14: "+resultado2+"[mm2]");
        System.out.println("-----------------------------------");
        
        //Neumatico 235/60R16
        int resultado3;
        Objeto1.CalcularArea(235, 322);
        resultado1=Objeto1.CalcularArea(235, 322);
        System.out.println("Area Contacto Neumatico 235/60R16 : "+resultado1+"[mm2]");
        System.out.println("-----------------------------------");
        
        double resultado4;
        Objeto2.CalcularArea(185, 322.54);
        resultado2=Objeto2.CalcularArea(185, 322.54);
        System.out.println("Area Contacto Neumatico 235/60R16: "+resultado2+"[mm2]");
        System.out.println("-----------------------------------");
        
        //Neumatico 185/55R15
        int resultado5;
        Objeto1.CalcularArea(185, 241);
        resultado1=Objeto1.CalcularArea(185, 241);
        System.out.println("Area Contacto Neumatico 185/55R15: "+resultado1+"[mm2]");
        System.out.println("-----------------------------------");
        
        double resultado6;
        Objeto2.CalcularArea(185, 241.6);
        resultado2=Objeto2.CalcularArea(185, 241.6);
        System.out.println("Area Contacto Neumatico 185/55R15: "+resultado2+"[mm2]");
        System.out.println("-----------------------------------");
        
        //Neumatico 195/65R15
        int resultado7;
        Objeto1.CalcularArea(195, 291);
        resultado1=Objeto1.CalcularArea(195, 291);
        System.out.println("Area Contacto Neumatico 195/65R15: "+resultado1+"[mm2]");
        System.out.println("-----------------------------------");
        
        double resultado8;
        Objeto2.CalcularArea(195, 291.6);
        resultado2=Objeto2.CalcularArea(195, 291.6);
        System.out.println("Area Contacto Neumatico 195/65R15: "+resultado2+"[mm2]");
        System.out.println("-----------------------------------");
    }
    
}