
import cajas.par;
public class App {
    public static void main(String[] args) throws Exception {
        // Caja<String> cajastring = new Caja<>();
        // Caja<Integer> cajaintere = new Caja<>();
        // Caja<Persona> cajaPersona = new Caja<>();
        // par<String, Integer> par1 = new par<>();
        // par<Integer,String> par2 = new par<>();
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
       

        // cajastring.guardar("Guarda un string");
        // cajaintere.guardar(10);
        // cajaPersona.guardar(new Persona("Carlos",10));
        // par1.establecerClave("Holas");
        // par1.establecerValor(10);
        // par2.establecerValor("Hola");
        // par2.establecerValor(10);
        



        // System.out.println(cajaPersona.getContenido().getNombre());
        // System.out.println(cajaPersona.getContenido());
        // System.out.println(cajastring.getContenido());
        // System.out.println(cajaintere.getContenido());
        // System.out.println(par1.obtenerClave());
        // System.out.println(par1.obtenerValor());
        // System.out.println(par2.obtenerClave());
        // System.out.println(par2.obtenerValor());


        par<String, Integer>[] arregloPars = new par[10];
        for (int i = 0; i < 10; i++) {
            if (personas[i].getEdad() > 18) {
                arregloPars[i].establecerClave(personas[i].getNombre());
                arregloPars[i].establecerValor(personas[i].getEdad());
            }
        }

        par<Integer, String>[] arreglorPars2 = new par[10];
        for (int i = 0; i < 10; i++) {
            if (personas[i].getEdad() < 19) {
                arreglorPars2[i].establecerClave(personas[i].getEdad());
                arreglorPars2[i].establecerValor(personas[i].getNombre());
            }
        }

        System.out.println("Menores");
        for (par<Integer, String> par : arreglorPars2) {
            if (par != null) {
                System.out.println("Edad: " + par.obtenerClave());
                System.out.println("Nombre: " + par.obtenerValor());
            }
        }

        System.out.println("Mayores");
        for (par<String, Integer> par : arregloPars) {
            if (par != null) {
                System.out.println("Nombre: " + par.obtenerClave());
                System.out.println("Edad: " + par.obtenerValor());
            }
        }
    }

    
}
