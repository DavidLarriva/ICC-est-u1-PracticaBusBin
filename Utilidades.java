import java.util.Arrays;
import java.util.Scanner;
public class Utilidades {
    public int busquedaBinaria(Persona[] listaPersona, int numeroBuscado) {

        int tamanio = listaPersona.length;

        int inicio = 0;
        int fin = tamanio  - 1;
        int mitad;

        while (inicio <= fin) {

            mitad = inicio + (fin-inicio)/2;

            System.out.println();

            System.out.println("Inicio: " + inicio + " Mitad: " + mitad + " Fin: " + fin + " ");
            System.out.println();

            if (listaPersona[mitad].getEdad() == numeroBuscado) {
                return mitad;
            }else if(listaPersona[mitad].getEdad() < numeroBuscado) {
                System.out.println();
                System.out.print("IZQUIERDA");
                inicio = mitad + 1;
            }else {
                System.out.println();
                System.out.print("DERECHA");
                fin = mitad -1;

            }

            System.out.println();

        }

        return -1;


    }

    public void arregloBurbujaPlus(Persona[] arreglo) {

        for (int i = 0; i<arreglo.length;i++) {
            for (int j=0;j<(arreglo.length - 1);j++) {
                if (arreglo[j].getEdad() > arreglo[j+1].getEdad()) {
                    Persona personaAux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = personaAux;
                }
            }
        }
    }

    public void imprimirArreglo(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }


    public Persona agregarNuevaPersona( Scanner sc) {
        Persona persona = new Persona();
        System.out.println();

        System.out.println("Ingrese nombre");

        String nombre = sc.nextLine();
        persona.setNombre(nombre);

        System.out.println();

        System.out.println("Ingrese apellido");
        String apellido = sc.nextLine();
        persona.setApellido(apellido);

        System.out.println();

        System.out.println("Ingrese edad");
        int edad = crearYValidarEdad(sc);
        persona.setEdad(edad);
        sc.nextLine();

        return persona;





    }

    public  int crearYValidarEdad(Scanner sc) {

        int edad = sc.nextInt();
        

        while(edad < 0) {
            System.out.println("no puede ser negativa, ingrese de nuevo");
            edad = sc.nextInt();
        
            
        }

        //sc.nextLine();

        return edad;





        

    }


    
}
