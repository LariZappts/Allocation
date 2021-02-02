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
public class PessoaFisica {
    private Integer idPessoaFisica;
    private String pessoa;
    private String dataNascimentoPessoF;
    private String idSexo;
    private String idEstadoCivil;
    private String codMotivoDescadastramento;
    private Sexo sexo;
    private EstadoCivil estadoCivil;
    private String numLocalidade;
    private Integer numPais;
    private String dataObito;
    private Boolean aceitaSms;
    private Boolean aceitaBolRenov;
    private Boolean status;
    private String motivoDescadast;
    private String dataInativDescadast;
    private String apelido;
    private String codUsuarioPf;
    private String dhrAlterPf;
    private List<GrauRelacionamento> grauRelacionamento = new ArrayList<>();
    private List<CongelamentoPessoaFisica> congelamentoPessoaFisica = new ArrayList<>();
    private String segurancaPessoaFisica;
    private List<PessoaFisicaEspecializacaos> pessoaFisicaEspecializacaos = new ArrayList<>();
}
