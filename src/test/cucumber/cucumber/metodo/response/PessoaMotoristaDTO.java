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
public class PessoaMotoristaDTO {
    private Integer id;
    private String nomePessoa;
    private String nomeFantasia;
    private Integer codigoTipoPessoa;
    private Integer codigoTipoDocumento;
    private String cpfCnpj;
    private String codigoOrigemDadoPessoa;
    private String codigoUsuarioPessoa;
    private String codigoUsuarioInclusao;
    private String dataInclusao;
    private String dataAlteracaoPessoa;
    private TipoPessoa tipoPessoa;
    private TipoDocumento tipoDocumento;
    private OrigemDado origemDado;
    private PessoaFisica pessoaFisica;
    private List<PessoaDocumento> pessoaDocumento = new ArrayList<>();
    private String numFonteDado;
    private List<String> contatoPessoas;
}
