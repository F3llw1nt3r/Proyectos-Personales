
public class Ceo extends MiembrosEmpres
{
    private int idJunta;
    private int Matricula;
    private int DepartamentosCargo;
      //super llama al constructor de la clase principal
   public Ceo(int idJunta, int Matricula, int DepartamentosCargo, String Nombre, String Apellidos, int edad, int AñosTraba, int salario) {
        super(Nombre, Apellidos, edad, AñosTraba, salario);
        this.idJunta = idJunta;
        this.Matricula = Matricula;
        this.DepartamentosCargo = DepartamentosCargo;
    }
    public int getIdJunta() {
        return idJunta;
    }

    public int getMatricula() {
        return Matricula;
    }

    public int getDepartamentosCargo() {
        return DepartamentosCargo;
    }

    public void setIdJunta(int idJunta) {
        this.idJunta = idJunta;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public void setDepartamentosCargo(int DepartamentosCargo) {
        this.DepartamentosCargo = DepartamentosCargo;
    }
    
    public void AsistirJunta()
    {
        System.out.println("Esta en una junta importante");
    }
    public void VotarJunta()
    {
        System.out.println("Esta tomando desiciones en la empresa");
    }
}
