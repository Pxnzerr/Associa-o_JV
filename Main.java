public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Alan Turing", "Ciência da Computação");

        Estudante estudante1 = new Estudante("Ada Lovelace", "2026001");
        Estudante estudante2 = new Estudante("Grace Hopper", "2026002");

        Curso curso = new Curso("Algoritmos e Estruturas de Dados");
        curso.setProfessor(professor);
        curso.adicionarEstudante(estudante1);
        curso.adicionarEstudante(estudante2);

        curso.exibirInformacoes();
    }
}
