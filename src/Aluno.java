import lombok.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Aluno {
    private String nome;
    private String dataNascimento;

    @Getter
    @Setter
    private List<Disciplina> disciplinaList = new ArrayList<Disciplina>();

    public int getIdade() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dataNascimento = String.valueOf(LocalDate.parse(dataNascimento, formatter));

        LocalDate currentDate = LocalDate.now();
        return Period.between(LocalDate.parse(this.dataNascimento), currentDate).getYears();
    }

    public double getMediaNota() {

        double somaNotas = 0.00;

        for (Disciplina disciplina : disciplinaList) {
            somaNotas += disciplina.getNota();
        }

        return somaNotas / disciplinaList.size();
    }

    public String getAprovado() {
        final double mediaNota = this.getMediaNota();

        if (mediaNota >= 50) {

            if (mediaNota >= 70) {

                return "Aluno aprovado";
            } else {

                return "Aluno em recuperação";
            }

        } else {

            return "Aluno repovado";
        }


    }
}
