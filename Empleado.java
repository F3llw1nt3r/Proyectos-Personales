public class Empleado extends MiembrosEmpres 
        
{
    
    private int idEmpleado;
    private int horasTrabajadas;
    private String sección;

    //super llama al constructor de la clase principal
    public Empleado(int idEmpleado, int horasTrabajadas, String sección, String Nombre, String Apellidos, int edad, int AñosTraba, int salario) {
        super(Nombre, Apellidos, edad, AñosTraba, salario);
        this.idEmpleado = idEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.sección = sección;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public String getSección() {
        return sección;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setSección(String sección) {
        this.sección = sección;
    }
    public void Trabajarequipo()
    {
        System.out.println("Esta desarrollando un proyecto en equipo");
    }
    public void subirPuesto()
    {
        System.out.println("Por su arduo trabajo ascendio de puesto ;D");
    }
}
