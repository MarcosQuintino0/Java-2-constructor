public class Ex_Aluno extends Pessoa {

  private String dtSaida;
  private String dtEntrada;


  public Ex_Aluno(String nome, int idade, int cpf, String telefone, String endereco, String dtSaida, String dtEntrada) {
    super(nome, idade, cpf, telefone, endereco);
    this.dtSaida = dtSaida;
    this.dtEntrada = dtEntrada;
  }
  
  public String getDtSaida() {
    return dtSaida;
  }
  public void setDtSaida(String dtSaida) {
    this.dtSaida = dtSaida;
  }
  public String getDtEntrada() {
    return dtEntrada;
  }
  public void setDtEntrada(String dtEntrada) {
    this.dtEntrada = dtEntrada;
  }
}
