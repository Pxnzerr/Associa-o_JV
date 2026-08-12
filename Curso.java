import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private Professor professor;
    private List<Estudante> estudantes;

    public Curso(String nome) {
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void adicionarEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + nome);
        if (professor != null) {
            System.out.println("Professor: " + professor.getNome() + " (" + professor.getEspecialidade() + ")");
        } else {
            System.out.println("Professor: Não atribuído");
        }
        System.out.println("Estudantes Matriculados:");
        if (estudantes.isEmpty()) {
            System.out.println("- Nenhum estudante matriculado.");
        } else {
            for (Estudante e : estudantes) {
                System.out.println("- " + e.getNome() + " (Matrícula: " + e.getMatricula() + ")");
            }
        }
    }
}
