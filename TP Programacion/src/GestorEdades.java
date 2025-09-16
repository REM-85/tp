//import java.util.HashMap;
//import java.util.Map;
// EL IDE me sugiere no importar HashMap ni Map porque no los uso ahora
import java.util.ArrayList;


// creo una clase interna para manejar pares nombre-edad
public class GestorEdades {
    private static class Persona {
        String nombre;
        int edad;
        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }    
//private HashMap<String, Integer> edades = new HashMap<>();
// cambio hashmap por arraylist de objetos persona
private ArrayList<Persona> personas = new ArrayList<>();

public void agregarEdad(String nombre, int edad) {
personas.add(new Persona(nombre, edad));
System.out.println(nombre + " ha sido agregado con edad " + edad);
}
//cambio metodo agregarEdad para usar arraylist
//public void agregarEdad(String nombre, int edad) {
//edades.put(nombre, edad);
//System.out.println(nombre + " ha sido agregado con edad " + edad);
//}

public void eliminarEdad(String nombre) {
    for (int i = 0; i < personas.size(); i++) {
        if (personas.get(i).nombre.equals(nombre)) {
            personas.remove(i);
            System.out.println(nombre + " ha sido eliminado.");
            return;
        }
    }
    System.out.println(nombre + " no se encontró.");
}
// cambio metodo eliminarEdad para usar arraylist
//public void eliminarEdad(String nombre) {
//if (edades.remove(nombre) != null) {
//System.out.println(nombre + " ha sido eliminado.");
//} else {
//System.out.println(nombre + " no se encontró.");
//}
public void mostrarEdades() {
System.out.println("Lista de edades:");
for (Persona persona : personas) {
    System.out.println(persona.nombre + ": " + persona.edad + " años");
}
}
//cambio metodo mostrarEdades para usar arraylist
//public void mostrarEdades() {
//System.out.println("Lista de edades:");
//for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
//System.out.println(entrada.getKey() + ": " + entrada.getValue() + " años");
//}

public static void main(String[] args) {
GestorEdades gestor = new GestorEdades();
gestor.agregarEdad("Pedro", 25);
gestor.agregarEdad("Pablo", 31);
gestor.agregarEdad("Ana", 22);
gestor.agregarEdad("Luis", 28);
gestor.agregarEdad("Clara", 27);
gestor.agregarEdad("Rama", 40);
gestor.agregarEdad("Marta", 35);
gestor.mostrarEdades();
gestor.eliminarEdad("Pedro");
gestor.eliminarEdad("Pablo");
gestor.mostrarEdades();
}
}