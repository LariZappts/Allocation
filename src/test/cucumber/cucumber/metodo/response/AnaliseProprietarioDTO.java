package cucumber.metodo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnaliseProprietarioDTO {
    private String tipoPessoa;
    private Integer seqPessoa;
    private String cpf;
    private String nome;
    private String cnpj;
    private String codigoRntrc;
    private boolean existe;
    private String categoriaOcorrencia;
    private String tipoOcorrencia;
    private boolean liberacaoProprietario;
    private String limiteProprietario;
    private boolean semCobertura;
    private Integer pontuacao;
    private Integer perfilPessoa;
    private boolean restricaoTransportadora;
    private boolean restricaoEmbarcador;
    private String situacaoCadastral;
    private boolean clienteContratoCrm;
    private String dataValidadeRNTRC;
    private String situacaoRNTRC;
    private String situacaoRntrcTela;
    private String consultaNeutralizacaoId;
    private List<String> detalheResDTOS;
}
