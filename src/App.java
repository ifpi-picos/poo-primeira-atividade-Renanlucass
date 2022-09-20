import br.edu.ifpi.dominio.Aluno;
import br.edu.ifpi.dominio.Curso;
import br.edu.ifpi.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor("Eduardo", "capic.2022117tads", null);
        Curso c1 = new Curso("ADS", "Superior", 200, p1);
        Aluno a1 = new Aluno("Renan","capic.2022118tads" , "2022118");
        Aluno a2 = new Aluno("João", "capic.2022119tads", "2022119");
        
        System.out.println("Qtd de alunos: " + c1.getQuantidadeDeAlunosMatriculados());
        
        c1.realizarMatricula(a1);
        c1.realizarMatricula(a2);
        
        System.out.println("Qtd alunos: " + c1.getQuantidadeDeAlunosMatriculados());
        
        System.out.println("Nome do curso: " + c1.getNome() + ", professor: " + c1.getNomeProfessor());
    }

        
}
