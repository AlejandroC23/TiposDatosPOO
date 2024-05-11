package modelo;

/**
 *
 * @author AlejandroC
 */

//1. ESTABLECIENDO EL NOMBRE DE LA CLASE
public class Persona {
    
//2. ATRIBUTOS -> DECLARACIÓN GLOBAL DE VARIBLES
    
    /**
     * public
     * private
     * protected
     */
    
    public int idPersona;
    public String nombres;
    public String apellidos;
    public String etnia;
    public int cedula;
    public int numTelefono;
    
//3.- MÉTODOS, ACCIONES O COMPORTAMIENTOS
    /**
     * public
     * private
     */
    
    //MÉTODO DE NO RETORNO - SON SECCIONES DE CÓDIGO
    //pueden tener variables locales
    public void saludar(){
        System.out.println("Hola " + nombres + " " + apellidos);
    }
    
    //MÉTODO DE NO RETORNO CON ARGUMENTOS DE ENTRADA
    //argumento es una variable local
    public void saludarEdad(int edad){
        if(edad>18){
            System.out.println("Hola mayor de edad");
        }else{
            System.out.println("Hola menor de edad");
        }
    }
    
    //MÉTODO QUE NOS INDIQUE EL HORÓSCOPO
    public void horoscopo(String signoZodiacal){
        if(signoZodiacal=="Aries"){
            System.out.println("Encontrarás al amor de tu vida en el "
                    + "asensor.");
        }else if(signoZodiacal=="Tauro"){
            System.out.println("Mañana vas a pisar caca de perro.");
        }else if(signoZodiacal=="Géminis"){
            System.out.println("Encontrarás a la persona que extrañas "
                    + "sentada en el parque.");
        }else if(signoZodiacal=="Cáncer"){
            System.out.println("Te va a caer caca de pájaro.");
        }else if(signoZodiacal=="Leo"){
            System.out.println("Te ahogarás con agua.");
        }else if(signoZodiacal=="Virgo"){
            System.out.println("Mañana te encontrarás con el amor "
                    + "de tu vida.");
        }else if(signoZodiacal=="Libra"){
            System.out.println("Te escribirá la persona que gusta.");
        }else if(signoZodiacal=="Escorpio"){
            System.out.println("Ganarás la loteria.");
        }else if(signoZodiacal=="Sagitario"){
            System.out.println("Te caerás en un charco de agua.");
        }else if(signoZodiacal=="Capricornio"){
            System.out.println("Verás pasar a un burro volador.");
        }else if(signoZodiacal=="Acuario"){
            System.out.println("Mañana tu mejor amigo te traicionará.");
        }else if(signoZodiacal=="Piscis"){
            System.out.println("Se te ensuciará tu pantalón favorito.");
        }else{
            System.out.println("No es posible dar un horoscopo debido "
                    + "a que no existe registro de ese signo zodiacal.");
        }
    }
}
