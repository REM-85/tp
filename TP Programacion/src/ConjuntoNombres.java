import java.util.HashSet;

public class ConjuntoNombres {
private HashSet<String> nombresUnicos = new HashSet<>();
public void agregarNombre(String nombre) {
if (nombresUnicos.add(nombre)) {
System.out.println(nombre + " ha sido agregado.");
} else {
System.out.println(nombre + " ya existe en el conjunto.");
}
}
public void mostrarNombres() {
System.out.println("Nombres únicos:");
String[] nombresArray = nombresUnicos.toArray(new String[0]);
for (int i = 0; i < nombresArray.length; i++) {
System.out.println(nombresArray[i]);
}
// for (String nombre : nombresUnicos) {
//System.out.println(nombre);
//}
}
public static void main(String[] args) {
ConjuntoNombres conjunto = new ConjuntoNombres();
conjunto.agregarNombre("Ana");
conjunto.agregarNombre("Nico");
conjunto.agregarNombre("Luis");
conjunto.agregarNombre("Clara");
conjunto.agregarNombre("Pedro");
conjunto.agregarNombre("Roberto");
conjunto.agregarNombre("Ana");
conjunto.mostrarNombres();
}
}