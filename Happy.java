package happy;
import java.util.Scanner;
public class Happy {
public static void main(String[] args) {
         char v;
         char a = 'a';
         System.out.println("Introduce la letra a ");
         Scanner ent = new Scanner(System.in);
         char b =ent.next().charAt(0);
          if(b==a)
         {
             for(int c = 0; c<=477; c++ )
             a=(char)c;
             System.out.println(a);
         }
         else
         {
             System.out.println("No es la letra correcta");
         }
       
         
       //Alterna entre 127 y 65535 para ver mas o menso caracteres
       //for(int c = 0; c<65535; c++ )
       //{
          // v = (char)c;
         //  System.out.println(v);
      // }
    }
    
}
