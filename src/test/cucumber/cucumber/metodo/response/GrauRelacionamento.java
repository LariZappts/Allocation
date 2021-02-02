package cucumber.metodo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrauRelacionamento {
    private Integer idGrauRelacionamento;
    private Integer codGrauRelacionamento;
    private GrauRelacPessoa grauRelacPessoa;
    private String nomeContato;
    private String codUsuarioRGR;
    private String dhrAlterRGR;
}
