public class Pessoa {
  protected String nome;
  private int idade;
  private int cpf;
  private String telefone;
  private String endereco;

  public Pessoa(String nome, int idade, int cpf, String telefone, String endereco) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;
  }

  //Métodos get and Setter
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public int getCpf() {
    return cpf;
  }
  public void setCpf(int cpf) {
    this.cpf = cpf;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
 
  
  
   
  
}
