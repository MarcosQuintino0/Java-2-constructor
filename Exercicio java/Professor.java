public class Professor extends docente {

  private String materia;
  private String turno;

  public Professor(String nome, int idade, int cpf, String telefone, String endereco, float salario, String cargo,String nivelEscolaridade, String dias_trabalhado,String materia, String turno) {
    super(nome, idade, cpf, telefone, endereco,salario,cargo,nivelEscolaridade,dias_trabalhado);

    this.materia = materia;
    this.turno = turno;
  }
  public String getMateria() {
    return materia;
  }
  public void setMateria(String materia) {
    this.materia = materia;
  }
  public String getTurno() {
    return turno;
  }
  public void setTurno(String turno) {
    this.turno = turno;
  }

  //criando métodos especificos

  public int salarioBruto() {
    return 2000;
  }

  public double participacaoLucro() {
    return 1.03 ;
  }

  public void salarioFinal(){
     System.out.println( "Seu salario é de " + salarioBruto() * participacaoLucro());
 
  }

}
