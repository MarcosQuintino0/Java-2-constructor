public class AlunoDePos extends Aluno{

  private String tipo;
  private String turno;

  public AlunoDePos(String nome, int idade, int cpf, String telefone, String endereco, int matricula, String mesalidade,
      int faltas, String curso, String advertencia,String tipo, String turno) {
    super(nome, idade, cpf, telefone, endereco, matricula, mesalidade, faltas, curso, advertencia);
    this.tipo = tipo;
    this.turno = turno;
    nome = "marcos";
    idade = 12;
    }

    
   
  
  
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getTurno() {
    return turno;
  }
  public void setTurno(String turno) {
    this.turno = turno;
  }
  
  

  
}
