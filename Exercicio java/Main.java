//import java.util.Scanner;
//import javax.swing.JFrame;
public class Main {


  public static void main(String[] args) {

       System.out.println("\n-----------Aluno de Graduação---------------- ");

      AlunoDeGraduacao Gradu = new AlunoDeGraduacao("Marcos", 19, 101300909,  "991533768", "Rua: São Paulo", 5, "1000", 2, "Informática", "5", "area", "Orientação a Objeto");

      System.out.println("\n Nome: " + Gradu.getNome());
      System.out.println("\n Cpf: " + Gradu.getCpf());
      System.out.println("\n Telefone: " + Gradu.getTelefone());
      System.out.println("\n Matricula: " + Gradu.getMatricula());
      System.out.println("\n Mensalidade: " + Gradu.getMesalidade());
      System.out.println("\n Faltas: " + Gradu.getFaltas());
      System.out.println("\n Curso: " + Gradu.getCurso());
      System.out.println("\n Advertencia: " + Gradu.getAdvertencia());
      System.out.println("\n Matéria: " + Gradu.getMateria());
     
     
      System.out.println("\n-------------Aluno pós Graduação--------------- ");

  AlunoDePos pos = new AlunoDePos( " Lucas", 20, 200300, "3025-3768", "Rua: Vasco", 1010,"R$ 1000,00",1, "Informática", "2","Tecnico", "Tarde");

    System.out.println("\nNome: "+pos.getNome());
    System.out.println("Idade: "+pos.getIdade());
    System.out.println("Cpf: "+pos.getCpf());
    System.out.println("Telefone: "+pos.getTelefone());
    System.out.println("Endereço: "+ pos.getEndereco());
    System.out.println("Matricula: " + pos.getMatricula());
    System.out.println("Mesalidade: " + pos.getMesalidade());
    System.out.println("Faltas: " + pos.getFaltas());
    System.out.println("Curso: " +pos.getCurso());
    System.out.println("Advertencias: " + pos.getAdvertencia());
    System.out.println("Tipo: " + pos.getTipo());
    System.out.println("Turno: " + pos.getTurno());


    System.out.println("\n------------Ex_Aluno------------- ");

    Ex_Aluno Ex = new Ex_Aluno("string",0, 0,"null","null","null","null");

      Ex.setNome(" Marcos");
      Ex.setIdade(19);
      Ex.setCpf(100200300);
      Ex.setTelefone("30253768");
      Ex.setEndereco("Rua bla bla");
      Ex.setDtEntrada("20/10/2020");
      Ex.setDtSaida("20/10/2022");

      System.out.println("Nome: "+Ex.getNome());                     
      System.out.println("Idade: "+Ex.getIdade());
      System.out.println("Cpf: "+Ex.getCpf());
      System.out.println("Telefone: "+Ex.getTelefone());                       
      System.out.println("Endereço: "+Ex.getEndereco());
      System.out.println("Data de entrada: "+Ex.getDtEntrada());
      System.out.println("Data de saída: "+Ex.getDtSaida());  

      System.out.println("\n------------Administrador------------- ");

    Administrador Adm = new Administrador("Leticia",18 , 101300, "20530256040", "Rua Palmeiras",0, "Diretor", "A Burra","0", "marcenaria", 100);

    System.out.println("\nNome:"+Adm.getNome());                     
    System.out.println("Idade: "+Adm.getIdade());
    System.out.println("Cpf: "+Adm.getCpf());
    System.out.println("Telefone: "+Adm.getTelefone());                       
    System.out.println("Endereço: "+Adm.getEndereco());
    System.out.println("Cargo: "+Adm.getCargo()); 
    System.out.println("Nivel de escolaridade: "+Adm.getNivelEscolaridade());                       
    System.out.println("Dias trabalhados: "+Adm.getDias_trabalhado());
    System.out.println("Setor: "+Adm.getSetor());
    System.out.println("Carga Horaria: "+Adm.getCargaHorario()); 
    Adm.salarioFinalAdm();      //polimorfimo

    System.out.println("\n------------Professor------------- ");

    Professor prof = new Professor("Marcelo", 53, 101010, "202010", "Rua: corinthians", 0, "Porfessor", "O mestre", "1", "Progamação objeto", "Tarde");

    System.out.println("\nNome:"+prof.getNome());                     
    System.out.println("Idade: "+prof.getIdade());
    System.out.println("Cpf: "+prof.getCpf());
    System.out.println("Telefone: "+prof.getTelefone());                       
    System.out.println("Endereço: "+prof.getEndereco());
    System.out.println("Cargo: "+prof.getCargo()); 
    System.out.println("Nivel de escolaridade: "+prof.getNivelEscolaridade());                       
    System.out.println("Dias trabalhados: "+prof.getDias_trabalhado());
    Adm.salarioFinalAdm(); 

  }
}
  
