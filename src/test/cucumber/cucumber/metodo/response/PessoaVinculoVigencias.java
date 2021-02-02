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
public class PessoaVinculoVigencias {
    private String codUsuario;
    private String dhrAlter;
    private Id id;
    private Integer numConsulta;
    private String datInicioVigencia;
    private String datFimVigencia;
    private String dhrRenovacao;
    private Periodicidade periodicidade;
    private Boolean staGratuito;
}
