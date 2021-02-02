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
public class LimitesPerfilPessoaDTO {
    private Integer codPerfilPessoa;
    private Integer vlrLimite;
    private String desPrefixo;
    private String desMensagemGerencial;
    private Boolean staAtivo;
    private Boolean staLimiteMinimo;
    private Boolean staLimiteSuperior;
}
