public class StringArrayDemo {

    public static void main(String[] args) {
        // 1) String de entrada (podés cambiar el texto)
        String frase = "   Programación en Java es genial, Java!   ";

        // 2) Normalizamos: quitamos espacios extremos y bajamos a minúsculas
        String normalizada = frase.trim().toLowerCase();

        // 3) Reemplazamos signos de puntuación por espacio (muy simple)
        normalizada = normalizada.replace(",", " ").replace("!", " ");

        // 4) Partimos en palabras usando split (devuelve un ARRAY de String)
        String[] palabras = normalizada.split("\\s+"); // 1+ espacios

        // 5) Recorremos el array e imprimimos
        System.out.println("Palabras (" + palabras.length + "):");
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("palabras[%d] = %s%n", i, palabras[i]);
        }

        // 6) Extra: convertir String -> char[] y char[] -> String
        String lenguaje = "Java";
        char[] letras = lenguaje.toCharArray(); // String -> array de char
        System.out.print("Letras de 'Java': ");
        for (char c : letras) System.out.print(c + " ");
        System.out.println();

        String reconstruida = new String(letras); // array de char -> String
        System.out.println("Reconstruida: " + reconstruida);
    }
}
