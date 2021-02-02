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
public class GrauRelacPessoa {
    private Integer idGrauRelacionamento;
    private String desGrauRelacionamento;
    private String codUsuarioGR;
    private String dhrAlterGR;
}
