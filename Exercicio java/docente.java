public class docente extends Empregado{

  private String nivelEscolaridade;
  private String dias_trabalhado;
  

  public docente( String nome, int idade, int cpf, String telefone, String endereco, float salario, String cargo,String nivelEscolaridade, String dias_trabalhado) {
    
    super(nome, idade, cpf, telefone, endereco,salario,cargo);
    this.nivelEscolaridade = nivelEscolaridade;
    this.dias_trabalhado = dias_trabalhado;

  }
  public String getNivelEscolaridade() {
    return nivelEscolaridade;
  }
  public void setNivelEscolaridade(String nivelEscolaridade) {
    this.nivelEscolaridade = nivelEscolaridade;
  }
  public String getDias_trabalhado() {
    return dias_trabalhado;
  }
  public void setDias_trabalhado(String dias_trabalhado) {
    this.dias_trabalhado = dias_trabalhado;
  }

  public int salarioBruto() {
    return 2000;
  }

  public double participacaoLucro() {
    return 1.03 ; // 3%
  }

  public void salarioFinal(){
     System.out.println( "Seu salario é de " + salarioBruto() * participacaoLucro());
 
  }

}
