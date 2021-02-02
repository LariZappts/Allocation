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
public class CongelamentoPessoaFisica {
    private Id id;
    private String numFonteDado;
    private String numOrigemDado;
    private String codUsuarioRPFC;
    private FonteDado fonteDado;
    private String dhrAlterPFc;
}
