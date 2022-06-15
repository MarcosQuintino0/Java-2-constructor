public class Empregado extends Pessoa {

  private float salario;
  private String cargo;

  public Empregado
  (String nome, int idade, int cpf, String telefone, String endereco, float salario, String cargo) {

    super(nome, idade, cpf, telefone, endereco);

    this.salario = salario;
    this.cargo = cargo;

  }

  public float getSalario() {
    return salario;
  }
  public void setSalario(float salario) {
    this.salario = salario;
  }
  public String getCargo() {
    return cargo;
  }
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

}
