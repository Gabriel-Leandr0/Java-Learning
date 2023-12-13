import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.setNome("Gabriel");
        aluno.setDataNascimento("09-09-2000");
/*
        Disciplina disciplina1 = new Disciplina();
        System.out.println("Digite o nome da Disciplina: ");
        disciplina1.setNomeDisciplina(scanner.next());
        System.out.println("Digite a nota da disciplina "+disciplina1.getNomeDisciplina());
        disciplina1.setNota(Double.parseDouble(scanner.next()));

        Disciplina disciplina2 = new Disciplina();
        System.out.println("Digite o nome da Disciplina: ");
        disciplina2.setNomeDisciplina(scanner.next());
        System.out.println("Digite a nota da disciplina "+disciplina2.getNomeDisciplina());
        disciplina2.setNota(Double.parseDouble(scanner.next()));

        Disciplina disciplina3 = new Disciplina();
        System.out.println("Digite o nome da Disciplina: ");
        disciplina3.setNomeDisciplina(scanner.next());
        System.out.println("Digite a nota da disciplina "+disciplina1.getNomeDisciplina());
        disciplina3.setNota(Double.parseDouble(scanner.next()));


        aluno.getDisciplinaList().add(disciplina1);
        aluno.getDisciplinaList().add(disciplina2);
        aluno.getDisciplinaList().add(disciplina3);

        System.out.println(aluno.getMediaNota());

*/
        System.out.println(aluno);
        System.out.println(aluno.getIdade());

    }
}