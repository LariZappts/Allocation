package cucumber.metodo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MotoristaResDTO {
    private String cpf;
    private String nome;
    private List<VinculoResDTOS> vinculoResDTOS = new ArrayList<>();
    private List<String> detalheResDTOS;
    private List<String> imagemResDTOS;
}
