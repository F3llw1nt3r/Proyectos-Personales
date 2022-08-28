public class MiembrosEmpres {
    //Las variables de la clase padre son del tipo Protected
    private String Nombre;
    private String Apellidos;
    private int edad;
    private int AñosTraba;
    private int salario;

    public MiembrosEmpres(String Nombre, String Apellidos, int edad, int AñosTraba, int salario) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
        this.AñosTraba = AñosTraba;
        this.salario = salario;
    }
    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñosTraba() {
        return AñosTraba;
    }

    public int getSalario() {
        return salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAñosTraba(int AñosTraba) {
        this.AñosTraba = AñosTraba;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void Trabajar()
    {
       System.out.println("Esta trabajando");
    }
    public void Descansar()
    {
        System.out.println("Esta en tiempo libre");
    }
}
