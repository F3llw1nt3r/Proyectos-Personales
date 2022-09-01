package duke.choice.ShopApp;
public class ShopApp {
public static void main(String[] args) {
      double total;
      double iva = 0.2;
      String msg1;
      String msg2;
      System.out.println("Bienbenido a mi Duke ShopApp :D");
      Cliente c1 = new Cliente();
      c1.name = "Jerry";
      System.out.println("El cliente es "+c1.name);
      Ropa Ropa1 = new Ropa();
      Ropa1.descripcion =" Chamarra ";
      Ropa1.precio = 20.08;
      Ropa1.tamaño=" M ";
      Ropa Ropa2 = new Ropa();
      Ropa2.descripcion=" Playera ";
      Ropa2.precio = 5.16;
      Ropa2.tamaño = " S-M ";
      msg1 = Ropa1.descripcion+""+Ropa1.precio+""+Ropa1.tamaño;
      msg2 = Ropa2.descripcion+""+Ropa2.precio+""+Ropa2.tamaño;
      System.out.println("Las prendas son"+ msg1 + "y" + msg2 );
      total = (Ropa1.precio*2) + Ropa2.precio*iva;
      System.out.println("El precio total de la ropa es: " + total);
              
     
    
}
}