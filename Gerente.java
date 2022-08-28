public class Gerente extends MiembrosEmpres
{
   private int empleados;
   private String departamento;
   private int aniosExp;
  //super llama al constructor de la clase principal
    public Gerente(int empleados, String departamento, int aniosExp, String Nombre, String Apellidos, int edad, int AñosTraba, int salario) {
        super(Nombre, Apellidos, edad, AñosTraba, salario);
        this.empleados = empleados;
        this.departamento = departamento;
        this.aniosExp = aniosExp;
    }
    public int getEmpleados() {
        return empleados;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }
   public void Contratar()
   {
       System.out.println("Esta contratando empleados");
   }
   public void AumentarSalario()
   {
       System.out.println("Esta dando aumentos :D");
   }
   
}
