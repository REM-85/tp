import java.util.ArrayList;

public class GestorAlumnos {
private ArrayList<String> alumnos = new ArrayList<>();
public void agregarAlumno(String nombre) {
alumnos.add(nombre);
System.out.println(nombre + " ha sido agregado.");
}
public void eliminarAlumno(String nombre) {
if (alumnos.remove(nombre)) {
System.out.println(nombre + " ha sido eliminado.");
} else {
System.out.println(nombre + " no se encontró.");
}
}
public void mostrarAlumnos() {
System.out.println("Lista de alumnos:");
for (String alumno : alumnos) {
System.out.println(alumno);
}
}
public static void main(String[] args) {
GestorAlumnos gestor = new GestorAlumnos();
gestor.agregarAlumno("Clara");
gestor.agregarAlumno("Rama");
gestor.agregarAlumno("Ana");
gestor.agregarAlumno("Nico");
gestor.agregarAlumno("Celeste");
gestor.agregarAlumno("Marcelo");
gestor.agregarAlumno("Roberto");
gestor.agregarAlumno("Lionel");
gestor.mostrarAlumnos();
gestor.eliminarAlumno("Lionel");
gestor.eliminarAlumno("Marcelo");
gestor.eliminarAlumno("Roberto");
gestor.mostrarAlumnos();
}
}