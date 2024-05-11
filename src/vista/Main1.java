package vista;
import modelo.Persona;
/**
 *
 * @author Alejandro
 */

//1.- CONSUMIENDO OBJETOS
public class Main1 {
    
//2.- LLAMAR A MÉTODO MAIN (TRADUCTOR O INTERPRETE)
    public static void main(String[] args) {
        //1.- CREAR/INSTANCIAR/DECLARAR OBJETO
        //NombreClase nombreObjeto = new NombreClase();
        Persona alejandro = new Persona();
        Persona ricardo = new Persona();
        Persona paola = new Persona();
        Persona iker = new Persona();
        Persona william = new Persona();
        
        //2.- DARLE DATOS AL OBJETO
        //nombreObjeto.atributo/variable = "dato";
            //acceder a atributos
            
        //Objecto 1
        alejandro.idPersona = 001;
        alejandro.nombres = "Alejandro";
        alejandro.apellidos = "Cevallos";
        alejandro.etnia = "Mestizo";
        alejandro.cedula = 1004587919;
        alejandro.numTelefono = 995196339;
        
            //acceder a los métodos
        alejandro.saludar();
            //EL DATO DENTRO DEL PARANTESIS ES UN PARÁMETRO
        alejandro.saludarEdad(18);
        alejandro.horoscopo("Géminis");
        
  
        //Objecto 2
        ricardo.idPersona = 002;
        ricardo.nombres = "Ricardo";
        ricardo.apellidos = "Rosales";
        ricardo.etnia = "Mestizo";
        ricardo.cedula = 1003487912;
        ricardo.numTelefono = 995668712;
        
        ricardo.saludar();
        ricardo.saludarEdad(27);
        ricardo.horoscopo("Tauro");
        
        //Objecto 3
        paola.idPersona = 003;
        paola.nombres = "Paola";
        paola.apellidos = "Lomas";
        paola.etnia = "Mestizo";
        paola.cedula = 1004587927;
        paola.numTelefono = 984551818;
        
        paola.saludar();
        paola.saludarEdad(24);
        paola.horoscopo("Capricornio");
        
        //Objecto 4
        iker.idPersona = 004;
        iker.nombres = "Iker";
        iker.apellidos = "Castillo";
        iker.etnia = "Afrodescendiente";
        iker.cedula = 1005692927;
        iker.numTelefono = 993248744;
        
        iker.saludar();
        iker.saludarEdad(17);
        iker.horoscopo("Acuario");
        
        //Objecto 5
        william.idPersona = 005;
        william.nombres = "William";
        william.apellidos = "Paez";
        william.etnia = "Indígena";
        william.cedula = 1709315460;
        william.numTelefono = 995513274;
        
        william.saludar();
        william.saludarEdad(21);
        william.horoscopo("Leo");
    }
}
