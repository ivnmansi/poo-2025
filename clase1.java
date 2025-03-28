/**
 * dta: 2025-03-28
 */
import java.util.Scanner;

public class clase1 {

    public static class Empresa{
        private String nombre;
        private String direccion;

        // constructor
        public Empresa(String nombre, String direccion){
            this.nombre = nombre;
            this.direccion = direccion;
        }
        
        // metodos
        public void showInfo(){
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Direccion: " + this.direccion);
        }
    }

    public static class Empleado{
        private String nombre;
        private int edad;
        private Empresa empresa;

        // constructor
        public Empleado(String nombre, int edad, Empresa empresa){
            this.nombre = nombre;
            this.edad = edad;
            this.empresa = empresa;
        }
        // metodos
        public void showInfo(){
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Edad: " + this.edad);
            System.out.println("Empresa: " + this.empresa.nombre);
        }
    }

    // metodo main
    public static void main(String[] args){

        Empresa empresa = new Empresa("umag", "calle 123");
        Empleado empleado = new Empleado("Juan", 20, empresa);
        empleado.showInfo();

        // crear un objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        scanner.close();

        
    }   
}
