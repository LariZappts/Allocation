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
public class PessoaVinculoDTO {
    private String codUsuario;
    private String dhrAlter;
    private Integer seqPessoaFilial;
    private List<PessoaVinculoVigencias> pessoaVinculoVigencias = new ArrayList<>();
    private TipoPessoaVinculo tipoPessoaVinculo;
    private String dhrCadastro;
    private Boolean staAtivo;
    private String dhrInativacao;
}
