import lombok.*;

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
    private String cpf;

    @Getter
    @Setter
    private List<Disciplina> disciplinaList = new ArrayList<Disciplina>();

    public  double getMediaNota(){
        double somaNotas = 0.00;
        for (Disciplina disciplina : disciplinaList ){
            somaNotas += disciplina.getNota();
        }
        return somaNotas/disciplinaList.size();
    }

}
