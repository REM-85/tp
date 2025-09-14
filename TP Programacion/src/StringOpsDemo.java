import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StringOpsDemo {

    public static void main(String[] args) {
        // === 1. Mensaje de bienvenida dinámico ===
        System.out.println("=== 1. Mensaje de bienvenida dinámico ===");
        String base = "Hola mundo, hoy es :";
        Instant ahora = Instant.now(); // un "instante" universal (UTC)
        ZonedDateTime zdt = ahora.atZone(ZoneId.systemDefault()); // lo adapto a mi zona horaria
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = zdt.format(fmt);
        String mensaje = base + " " + fecha + "!!!"; // concatenación + sufijo
        System.out.println(mensaje);

        // === 2.a Longitud ===
        System.out.println("\n=== 2.a Longitud ===");
        String s1 = "Programación en Java";
        System.out.println("Cadena: \"" + s1 + "\"");
        System.out.println("Longitud: " + s1.length());

        // === 2.b Concatenación ===
        System.out.println("\n=== 2.b Concatenación ===");
        String h = "Hola";
        String m = " Mundo";
        System.out.println("concat(): " + h.concat(m));
        System.out.println("operador +: " + (h + m));

        // === 2.c Comparación ===
        System.out.println("\n=== 2.c Comparación ===");
        String a = "Java";
        String b = "java";
        System.out.println("\"Java\".equals(\"java\"): " + a.equals(b));
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + a.equalsIgnoreCase(b));
        // Nota: '==' compara referencias, no contenido.

        // === 2.d Búsqueda ===
        System.out.println("\n=== 2.d Búsqueda ===");
        String frase = "El lenguaje de programación es Java.";
        int indice = frase.indexOf("Java");
        System.out.println("Cadena: \"" + frase + "\"");
        System.out.println("Índice de \"Java\": " + indice); // -1 si no lo encuentra
        System.out.println("¿Contiene \"programación\"?: " + frase.contains("programación"));

        // === 2.e Reemplazo ===
        System.out.println("\n=== 2.e Reemplazo ===");
        String perros = "El perro es mi mascota favorita. El perro es leal.";
        String gatos = perros.replace("perro", "gato"); // reemplaza todas las ocurrencias
        System.out.println(gatos);

        // === 2.f Modificación ===
        System.out.println("\n=== 2.f Modificación ===");
        String datos = "Datos: 123456789";
        String soloNumeros1 = datos.substring(datos.indexOf(':') + 1).trim(); // desde ':' + trim
        String soloNumeros2 = datos.replaceAll("\\D+", ""); // quita todo lo que NO es dígito
        System.out.println("Original: \"" + datos + "\"");
        System.out.println("Subcadena de números (substring+trim): " + soloNumeros1);
        System.out.println("Solo dígitos (regex): " + soloNumeros2);
        System.out.println("Mayúsculas: " + datos.toUpperCase());
        System.out.println("Minúsculas: " + datos.toLowerCase());
        String conEspacios = " Hola Mundo ";
        System.out.println("Original con espacios: [" + conEspacios + "]");
        System.out.println("Aplicando trim():      [" + conEspacios.trim() + "]");

        // === 2.g División (split) ===
        System.out.println("\n=== 2.g División ===");
        String frutas = "manzana,banana,naranja";
        String[] partes = frutas.split(",");
        System.out.println("Cadena a dividir: \"" + frutas + "\"");
        for (String parte : partes) {
            System.out.println(parte);
        }
    }
}
