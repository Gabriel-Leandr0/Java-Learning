import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.setNome("Gabriel");
        aluno.setDataNascimento("09-09-2000");

        System.out.println("Digite a quantidade de disciplinas: ");

        final int qtdDisciplina = scanner.nextInt();

        for (int pos = 1; pos <= qtdDisciplina; pos++) {

            Disciplina disciplina = new Disciplina();
            System.out.println("Digite o nome da Disciplina " + pos + " : ");
            disciplina.setNomeDisciplina(scanner.next());
            System.out.println("Digite a nota da disciplina " + disciplina.getNomeDisciplina() + " : ");
            disciplina.setNota(Double.parseDouble(scanner.next()));

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
}