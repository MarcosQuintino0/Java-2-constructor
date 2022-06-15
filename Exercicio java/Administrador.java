public class Administrador extends docente{

  private String setor;
  private int cargaHorario;

  public Administrador( String nome, int idade, int cpf, String telefone, String endereco, float salario, String cargo,String nivelEscolaridade, String dias_trabalhado, String setor, int cargaHorario) {

    super(nome, idade, cpf, telefone, endereco,salario,cargo,nivelEscolaridade,dias_trabalhado);
    this.setor = setor;
    this.cargaHorario = cargaHorario;
  }
  public String getSetor() {
    return setor;
  }
  public void setSetor(String setor) {
    this.setor = setor;
  }
  public int getCargaHorario() {
    return cargaHorario;
  }
  public void setCargaHorario(int cargaHorario) {
    this.cargaHorario = cargaHorario;
  }

  public int salarioBruto() {
    return 2000;
  }

  public double participacaoLucro() {
    return 1.05 ;  //5%
  }

  public void salarioFinalAdm(){
     System.out.println( "Seu salario junto com a participção de lucro é de " + salarioBruto() * participacaoLucro());
 
  }
}
