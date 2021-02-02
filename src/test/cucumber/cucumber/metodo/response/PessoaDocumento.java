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
public class PessoaDocumento {
    private Id id;
    private TipoDocumento tipoDocumento;
    private String codDocumentoPessoa;
    private Integer codOrgaoEmissor;
    private String dataEmissaoDoc;
    private Integer unidadeFederal;
    private String codUsuarioPD;
    private String dataAlteracaoPD;
}
