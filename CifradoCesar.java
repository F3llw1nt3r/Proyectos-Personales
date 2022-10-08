package cifradocesar;
import java.util.Scanner;
public class CifradoCesar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        System.out.println("Introduzca el mensaje a descifar: ");
        String frase = teclado.next();
        String texto = codificar(letras,frase);
        System.out.println("Mensaje codificado: "+texto);
        texto = descodificar(letras,texto);
        System.out.println("Mensaje descodificado: "+texto);
    }
    
    public static String codificar(String letras, String texto){
        String textoCifrado = "";
        texto = texto.toUpperCase();
        char car;
        for( int i = 0; i<texto.length();i++){
        car = texto.charAt(i);
        int posicion = letras.indexOf(car);
        if(posicion == -1){
            textoCifrado += car;
        }
        else{
            textoCifrado += letras.charAt((posicion+3)%letras.length());
        }
    }
        return textoCifrado;
    }
    public static String descodificar(String letras, String texto){
        
        String textoDesifrado = "";
        texto = texto.toUpperCase();
        char car;
        for( int i = 0; i<texto.length();i++){
        car = texto.charAt(i);
        int posicion = letras.indexOf(car);
        if(posicion == -1){
            textoDesifrado += car;
        }
        else{
            if(posicion-3 < 0){
                textoDesifrado += letras.charAt(letras.length()+(posicion-3));
            }
            else{
                 textoDesifrado += letras.charAt((posicion-3)%letras.length());
            }
        }
    }
        return textoDesifrado;
}
}
