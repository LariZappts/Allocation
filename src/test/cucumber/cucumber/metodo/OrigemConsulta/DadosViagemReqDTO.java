package cucumber.metodo.OrigemConsulta;

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
public class DadosViagemReqDTO {
    private String codigoMercadoria;
    private CidadeOrigem cidadeOrigem;
    private CidadeDestino cidadeDestino;
    private String faixaCarregamento;
}
