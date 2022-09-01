package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz {
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    int matriz [][],nFil,nCol;
    boolean simetry = true;
    nFil = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de filas: "));
    nCol = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de columnas: "));
    matriz = new int [nFil][nCol];
    System.out.println("Introduzca la matriz: ");
    for (int i=0;i<nFil;i++)
    {
        for (int j=0;j<nCol;j++)
        {
            System.out.print("Matriz ["+i+"]["+j+"]: "); 
            matriz[i][j] = ent.nextInt();
        }
    }
    //Si es cuadrada
    if(nFil==nCol)
    {
        int i,j;
        i=0;
        while(i<nFil&&simetry==true)
        {
            j=0;
        while(j<i&&simetry==true)
         {
             //Comprobar si la matriz es diferente a la matriz transpuesta
            if(matriz[i][j]!= matriz[j][i])
            {
                simetry=false;
            }
            j++;
         }
        i++;
        }
        if(simetry==true)
        {
            JOptionPane.showMessageDialog(null,"La matriz es simétrica");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"La matriz no es simétrica");
        }
    }
    else
    {
        JOptionPane.showMessageDialog(null,"La matriz no es simétrica");
    }
        //System.out.println("\n La Matriz es: ");
            //Numero de filas
           // for(int i=0;i<nFil;i++) 
           // {
                //Numero de columnas
             //  for(int j=0;j<nCol;j++)
             //  {
               //    System.out.print(matriz[i][j]); 
              // }
              //  System.out.println("");
            //}
    }
    
}
