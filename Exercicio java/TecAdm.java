public class TecAdm extends Empregado{

  private String setor;
  private String grauQualificacao;
  
  

  public TecAdm(String nome, int idade, int cpf, String telefone, String endereco, float salario, String cargo,
      String setor, String grauQualificacao) {
    super(nome, idade, cpf, telefone, endereco, salario, cargo);
    this.setor = setor;
    this.grauQualificacao = grauQualificacao;
  }
  public String getSetor() {
    return setor;
  }
  public void setSetor(String setor) {
    this.setor = setor;
  }
  public String getGrauQualificacao() {
    return grauQualificacao;
  }
  public void setGrauQualificacao(String grauQualificacao) {
    this.grauQualificacao = grauQualificacao;
  }

  
  
}
