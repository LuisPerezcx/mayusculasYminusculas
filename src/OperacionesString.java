public class OperacionesString {

    public void contarMayusculasMinusculas(String str) {
        int mayusculas = 0;
        int minusculas = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            }
        }
        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Minúsculas: " + minusculas);
    }

    public void contarMinusculas(String str) {
        int minusculas = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                minusculas++;
            }
        }
        System.out.println("Minúsculas: " + minusculas);
    }

    public void contarLetra(String str, char letra) {
        int cont = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == letra || Character.toLowerCase(c) == letra || Character.toUpperCase(c) == letra){
                cont++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + cont + " veces.");
    }

    public void extraerSubstring(String str, int inicio, int fin) {
        String substring = str.substring(inicio, fin);
        System.out.println("Substring: " + substring);
    }

    public String invertirString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}

