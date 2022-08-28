
import java.util.ArrayList;

public class Main {
    public static ArrayList<MiembrosEmpres> familia = new ArrayList<MiembrosEmpres>();
    
    public static void main(String Args[])
    {
        Ceo Rodriguez = new Ceo(1626, 20005, 4, "Abraham","Rodriguez", 35, 10,75000 );
        Gerente Muratalla = new Gerente(50,"Investigación y desarrollo",8,"Alejandra","Muratalla", 28, 8, 40000);
        Empleado Ximenes = new Empleado(1023,32,"Recursos Humanos","Alejandro","Ximenes", 26, 5,25000);
        familia.add(Rodriguez);
        familia.add(Muratalla);
        familia.add(Ximenes);
        //Trabajar
        System.out.println("Todos en la empresa estan trabajando.(Todos realizan el mismo metodo)");
        for (MiembrosEmpres integrante : familia)
        {
            System.out.println(integrante.getNombre()+""+integrante.getApellidos()+" ->");
            integrante.Trabajar();
        }
        //Descansar
        System.out.println("Todos en la empresa estan de vacaciones.(Todos realizan el mismo metodo)");
        for (MiembrosEmpres integrante : familia)
        {
            System.out.println(integrante.getNombre()+""+integrante.getApellidos()+" ->");
            integrante.Descansar();
        }
    }
}
