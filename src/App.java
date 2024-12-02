
import cajas.Caja;
import cajas.Par;


public class App {
    
        public static void main(String[] args) {
            Caja<String> cajastring = new Caja<>();
            Caja<Integer> cajaintere = new Caja<>();
            Caja<Persona> cajaPersona = new Caja<>();
            Par<String, Integer> par1 = new Par<>();
            Par<Integer, String> par2 = new Par<>();
    
            // Guardar valores en las cajas y pares
            cajastring.guardar("Guarda un string");
            cajaintere.guardar(10);
            cajaPersona.guardar(new Persona("Carlos", 25));
            par1.establecerClave("Hola");
            par1.establecerValor(10);
            par2.establecerClave(20);
            par2.establecerValor("Adiós");
    
            // Imprimir contenido de las cajas
            System.out.println("Caja Persona: " + cajaPersona.getContenido().getNombre());
            System.out.println("Caja String: " + cajastring.getContenido());
            System.out.println("Caja Entero: " + cajaintere.getContenido());
    
            // Imprimir contenido de los pares
            System.out.println("Par1 -> Clave: " + par1.obtenerClave() + ", Valor: " + par1.obtenerValor());
            System.out.println("Par2 -> Clave: " + par2.obtenerClave() + ", Valor: " + par2.obtenerValor());
    
            // Crear arreglo de personas
            Persona[] personas = new Persona[10];
            personas[0] = new Persona("Sapito", 10);
            personas[1] = new Persona("Rapito", 15);
            personas[2] = new Persona("Marrón", 20);
            personas[3] = new Persona("Rojo", 25);
            personas[4] = new Persona("Juan", 30);
            personas[5] = new Persona("Christian", 35);
            personas[6] = new Persona("Alfredo", 40);
            personas[7] = new Persona("Pedro", 45);
            personas[8] = new Persona("Lucas", 50);
            personas[9] = new Persona("Maria", 55);
    
            // Crear arreglos para mayores y menores de edad
            Par<Integer, String>[] arreglorPars2 = new Par[10];
            Par<String, Integer>[] arregloPars = new Par[10];
            
    
            for (int i = 0; i < personas.length; i++) {
                if (personas[i].getEdad() > 18) {
                    arregloPars[i] = new Par<>();
                    arregloPars[i].establecerClave(personas[i].getNombre());
                    arregloPars[i].establecerValor(personas[i].getEdad());
                } else {
                    arreglorPars2[i] = new Par<>();
                    arreglorPars2[i].establecerClave(personas[i].getEdad());
                    arreglorPars2[i].establecerValor(personas[i].getNombre());
                }
            }
    
            // Imprimir menores de edad
            System.out.println("Menores de edad:");
            for (Par<Integer, String> Par : arreglorPars2) {
                if (Par != null) {
                    System.out.println("Edad: " + Par.obtenerClave() + ", Nombre: " + Par.obtenerValor());
                }
            }
    
            // Imprimir mayores de edad
            System.out.println("Mayores de edad:");
            for (Par<String, Integer> Par : arregloPars) {
                if (Par != null) {
                    System.out.println("Nombre: " + Par.obtenerClave() + ", Edad: " + Par.obtenerValor());
                }
            }
        }
    }
