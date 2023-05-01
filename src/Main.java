import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionesString operacionesString = new OperacionesString();
        String string = " ";
        int a,b;
        char c;
        System.out.println("\n\n\t\tPULSA 0 PARA SALIR");
        while (true){
            System.out.println("Ingresa una cadena");
            string = scanner.nextLine();
            if(string.equals("0"))
                break;
            operacionesString.contarMayusculasMinusculas(string);
            operacionesString.contarMinusculas(string);
            System.out.println("para extraer un fragmento de la cadena ingrese los indices: ");
            System.out.print("inicio: ");
            a = scanner.nextInt();
            System.out.print("fin: ");
            b = scanner.nextInt();
            operacionesString.extraerSubstring(string,a,b);
            operacionesString.invertirString(string);
            System.out.println("Ingresa el caracter a buscar");
            c = scanner.next().charAt(0);
            scanner.nextLine();
            operacionesString.contarLetra(string,c);
        }
    }
}
