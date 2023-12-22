import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Aluno> alunoList = new ArrayList<Aluno>();

        System.out.println("Digite a quantidade de alunos : ");
        final int qtdAluno = scanner.nextInt();

        for (int posAluno = 1; posAluno <= qtdAluno; posAluno++) {

            Aluno aluno = new Aluno();
            System.out.println("Digite o nome do aluno "+posAluno+" : ");
            aluno.setNome(scanner.next());
            System.out.println("Digite a data de nascimento do aluno "+aluno.getNome()+" : ");
            aluno.setDataNascimento(scanner.next());

            alunoList.add(aluno);

            System.out.println("Digite a quantidade de disciplinas: ");

            final int qtdDisciplina = scanner.nextInt();

            for (int posDisciplina = 1; posDisciplina <= qtdDisciplina; posDisciplina++) {

                Disciplina disciplina = new Disciplina();
                System.out.println("Digite o nome da Disciplina " + posDisciplina + " : ");
                disciplina.setNomeDisciplina(scanner.next());
                System.out.println("Digite a nota da disciplina " + disciplina.getNomeDisciplina() + " : ");
                disciplina.setNota(Double.parseDouble(scanner.next()));

                aluno.getDisciplinaList().add(disciplina);

                //alunoList.get(aluno.getDisciplinaList().add(disciplina));
            }

            System.out.println("Deseja remover alguma disciplina? (1 - Sim / 0 - Não)");
            int resposta = scanner.nextInt();

            while (resposta == 1) {
                for (int i = 0; i < aluno.getDisciplinaList().size(); i++) {
                    Disciplina disciplina = aluno.getDisciplinaList().get(i);
                    System.out.println("Posição " + i + ": " + disciplina.getNomeDisciplina());
                }

                System.out.println("Digite o número da disciplina que deseja remover:");
                int posicaoRemover = scanner.nextInt();

                // Remover a disciplina da lista
                if (posicaoRemover >= 0 && posicaoRemover < aluno.getDisciplinaList().size()) {
                    aluno.getDisciplinaList().remove(posicaoRemover);
                    System.out.println("Disciplina removida com sucesso!");
                } else {
                    System.out.println("Posição inválida. Nenhuma disciplina removida.");
                }

                System.out.println("Deseja remover mais alguma disciplina? (1 - Sim / 0 - Não)");
                resposta = scanner.nextInt();
            }

        }
        for (int i = 0; i < alunoList.size(); i++) {

            Aluno aluno = alunoList.get(i);

            System.out.println("----------------------------------------------");

            System.out.println("ID do aluno : "+i);
            System.out.println("Nome do aluno : "+aluno.getNome());
            System.out.println("Data de nascimento : "+aluno.getDataNascimento());
            // Iterar sobre a lista de disciplinas do aluno
            System.out.println("Disciplinas:");

            for (Disciplina disciplina : aluno.getDisciplinaList()) {
                System.out.println("  - " + disciplina.getNomeDisciplina() + "Nota : "+disciplina.getNota());
            }
            System.out.println("Media : "+aluno.getMediaNota());

            System.out.println("----------------------------------------------");
        }
    }
}