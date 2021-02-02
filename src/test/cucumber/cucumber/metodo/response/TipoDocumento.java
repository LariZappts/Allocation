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
public class TipoDocumento {
    private Integer idTipoDocumento;
    private String descricaoTipoDocumento;
    private String siglaTipoDocumento;
    private String codigoUsuarioTipoDocumento;
    private String dataAlteracaoTipoDocumento;
}
