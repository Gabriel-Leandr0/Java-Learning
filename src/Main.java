import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<Aluno>();

        System.out.println("Digite a quantidade de alunos: ");

        final int qtdAluno = scanner.nextInt();

        for (int posAluno = 1; posAluno <= qtdAluno; posAluno++) {

            Aluno aluno = new Aluno();
            System.out.println("Digite o nome do aluno " + posAluno + " : ");
            aluno.setNome(scanner.next());
            System.out.println("Digite a data de nascimento do aluno " + aluno.getNome() + " Formato:(dd-MM-yyyy) : ");
            aluno.setDataNascimento(scanner.next());

            alunos.add(aluno);

            System.out.println("Digite a quantidade de disciplinas");
            final int qtdDisciplina = scanner.nextInt();

            for (int posDisciplina = 1; posDisciplina <= qtdDisciplina; posDisciplina++) {

                Disciplina disciplina = new Disciplina();
                System.out.println("Digite o nome da disciplina "+ posDisciplina +" : ");
                disciplina.setNomeDisciplina(scanner.next());
                System.out.println("Digite a noda da disciplina" + disciplina.getNomeDisciplina()+ " : ");
                disciplina.setNota(scanner.nextDouble());

                aluno.getDisciplinaList().add(disciplina);
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

        for (Aluno aluno : alunos){
            System.out.println("NOME: " + aluno.getNome());
            System.out.println("DATA DE NASCIMENTO:"+aluno.getDataNascimento());
            System.out.println("IDADE: "+ aluno.getIdade());
            System.out.println("DISCIPLINAS: "+aluno.getDisciplinaList().get(0).getNomeDisciplina());
        }
    }
}