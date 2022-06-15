public class AlunoDeGraduacao extends Aluno{

  private String area;
  private String materia;

  public AlunoDeGraduacao(String nome, int idade, int cpf, String telefone, String endereco, int matricula,
      String mesalidade, int faltas, String curso, String advertencia, String area, String materia) {
        
    super(nome, idade, cpf, telefone, endereco, matricula, mesalidade, faltas, curso, advertencia);
    this.area = area;
    this.materia = materia;
  }

  public String getArea() {
    return area;
  }
  public void setArea(String area) {
    this.area = area;
  }
  public String getMateria() {
    return materia;
  }
  public void setMateria(String materia) {
    this.materia = materia;
  }
  
}
