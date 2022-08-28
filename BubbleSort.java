package bubblesort;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class BubbleSort {
 public static void main(String[] args) {
      Scanner ent = new Scanner(System.in); 
      int arreglo[], nElem,aux;
      nElem = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de datos en el arreglo: "));
      //Guardamos el número de elemntos en el arreglo
      arreglo = new int [nElem];
      for(int i=0;i<nElem;i++)
      {
          System.out.print((i+1)+ "Digite un número");
          arreglo[i] = ent.nextInt();    
      }
      //Método Burbuja
       for(int i=0;i<(nElem-1);i++)
      {
          for(int k=0;k<(nElem-1);k++)
          {
              //Si número actual > número siguiente 
              if(arreglo[k]>arreglo[k+1])
              {
                  aux = arreglo[k];
                  arreglo[k] = arreglo[k+1];
                  arreglo[k+1] = aux;
              }
              
          }
      }
      //Imprimir el arreglo ordenado crecientemente
      System.out.println("\nArreglo ordenado de manera creciente: ");
      for(int i=0;i<nElem;i++)
      {
          System.out.print(arreglo[i]+" - ");
      }
      //Arreglo de manera decreciente 
      System.out.println("\nArreglo ordenado de manera decreciente: ");
                 for(int i = (nElem-1);i>=0;i--){
                  System.out.print(arreglo[i]+" - ");
      }
      System.out.println("");
    }
}
