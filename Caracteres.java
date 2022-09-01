package caracteres;
public class Caracteres {
public static void main(String[] args) {
       char v; 
       //Alterna entre 127 y 65535 para ver mas o menso caracteres
       for(int c = 0; c<65535; c++ )
       {
           v = (char)c;
           System.out.println(v);
       }
    }
    
}
