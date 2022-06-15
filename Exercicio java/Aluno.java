public class Aluno extends Pessoa {

    private int matricula;
    private String Mesalidade;
    private int faltas;
    private String curso;
    private String advertencia;
 
    public Aluno(String nome, int idade, int cpf, String telefone, String endereco, int matricula, String mesalidade,int faltas, String curso, String advertencia) {

      super(nome, idade, cpf, telefone, endereco);
      this.matricula = matricula;
      this.Mesalidade = mesalidade;
      this.faltas = faltas;
      this.curso = curso;
      this.advertencia = advertencia;  
    }
    
    public int getMatricula() {
      return matricula;
    }
    public void setMatricula(int matricula) {
      this.matricula = matricula;
    }
    public String getMesalidade() {
      return Mesalidade;
    }
    public void setMesalidade(String mesalidade) {
      Mesalidade = mesalidade;
    }
    public int getFaltas() {
      return faltas;
    }
    public void setFaltas(int faltas) {
      this.faltas = faltas;
    }
    public String getCurso() {
      return curso;
    }
    public void setCurso(String curso) {
      this.curso = curso;
    }
    public String getAdvertencia() {
      return advertencia;
    }
    public void setAdvertencia(String advertencia) {
      this.advertencia = advertencia;
    }

}
