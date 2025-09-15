import java.util.HashMap;
import java.util.Map;

public class GestorEdades {
private HashMap<String, Integer> edades = new HashMap<>();
public void agregarEdad(String nombre, int edad) {
edades.put(nombre, edad);
System.out.println(nombre + " ha sido agregado con edad " + edad);
}
public void eliminarEdad(String nombre) {
if (edades.remove(nombre) != null) {
System.out.println(nombre + " ha sido eliminado.");
} else {
System.out.println(nombre + " no se encontró.");
}
}
public void mostrarEdades() {
System.out.println("Lista de edades:");
for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
System.out.println(entrada.getKey() + ": " + entrada.getValue() + " años");
}
}
public static void main(String[] args) {
GestorEdades gestor = new GestorEdades();
gestor.agregarEdad("Pedro", 25);
gestor.mostrarEdades();
gestor.eliminarEdad("Pedro");
gestor.mostrarEdades();
}
}