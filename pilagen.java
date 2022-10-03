
import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;

public class pilagen <generica>{
  generica dato[];
  int tope;
  final int limOmision = 2;
  public pilagen()
  {
      tope = 0;
      dato = (generica[]) new Object[limOmision];
      
  }
  public void push(generica Item)throws BufferOverflowException{
      if(tope>=dato.length)
          redimensiona(2*dato.length);
          dato[tope]=Item;
          tope++;
  }
       public generica pop() throws NoSuchElementException {
          generica Item;
          if(tope<=dato.length/4)
              redimensiona(dato.length/2);
              tope--;
              Item = dato[tope];
          return Item;
       }
       private void redimensiona(int nuevCap){
           generica[] copia = (generica[]) new Object[nuevCap];
           for(int i = 0; i<dato.length;i++)
               copia[i] = dato[i];
               dato = copia;
       }
}

