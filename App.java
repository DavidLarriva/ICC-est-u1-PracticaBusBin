import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Utilidades utilidades = new Utilidades();

        System.out.println("Ingrese la cantidad de personas que desea Ingresar");

        int tamanio = utilidades.crearYValidarEdad(sc);
        sc.nextLine();

        Persona[] personas = new Persona[tamanio];

        System.out.println();

        for (int i = 0;i<tamanio;i++){

            System.out.print("");

            System.out.print("Ingrese la persona # " + (i+1));
            System.out.println();
            


            
            
            personas[i] =     utilidades.agregarNuevaPersona(sc);
            System.out.println();

        }


        System.out.println();
        System.out.println("EDAD DE ARREGLO DE PERSONAS DESORDENADO");
        System.out.println();

        for(int i=0;i<tamanio;i++) 
        {

            System.out.print(personas[i].getEdad() + " | ");
        }

        utilidades.arregloBurbujaPlus(personas);

        System.out.println();
        System.out.println();
        System.out.println("EDAD DE ARREGLO DE PERSONAS ORDENADO");
        System.out.println();

        for(int i=0;i<tamanio;i++) 
        {

            System.out.print(personas[i].getEdad() + " | ");
        }

        System.out.println();

        System.out.println("Ingrese una edad para buscar porfavor");

        int edadAbuscar = sc.nextInt();

        int posicionNombre = utilidades.busquedaBinaria(personas, edadAbuscar);

        if(posicionNombre == -1){
            System.out.println("Persona no encontrada conesa edad");
            System.exit(0);

        }else {
            System.out.println();
            System.out.println();
            System.out.println("Persona encontrada !!");
            System.out.println("Nombre: " + personas[posicionNombre].getNombre());
            System.out.println("Apellido: " + personas[posicionNombre].getApellido());
            System.out.println("Edad: " + personas[posicionNombre].getEdad());
        }

        







        



        
        


    }
}