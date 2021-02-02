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
public class AnaliseDTO {
    private String idCnpjCertificadoDigital;
    private String cnpjCertificadoDigital;
    private Integer idCnpjClienteContrato;
    private String cnpjClienteContrato;
    private Integer idCnpjEmbarcador;
    private String cnpjEmbarcador;
    private Integer idCnpjFilialCliente;
    private String cnpjFilialCliente;
    private String idCnpjPagador;
    private String cnpjPagador;
    private Integer origemConsulta;
    private String motoristaCpf;
    private String motoristaNome;
    private boolean motoristaExistente;
    private boolean motoristaTipoEspecializacaoMotorista;
    private MotoristaTipoVinculo motoristaTipoVinculo;
    private boolean motoristaAtivo;
    private String motoristaMotivoDescad;
    private String motoristaSituacaoCadastro;
    private MotoristaCategoriaOcorrencia motoristaCategoriaOcorrencia;
    private boolean motoristaSemCobertura;
    private List<String> motoristaDesTipOcorrencias;
    private boolean motoristaLiberacaoCliente;
    private String motoristaLimite;
    private boolean motoristaClonagem;
    private String motoristaReToken;
    private boolean motoristaTokenValido;
    private Integer motoristaPontuacao;
    private Integer motoristaPerfilPessoa;
    private boolean motoristaRestricaoTransportadora;
    private boolean motoristaRestricaoEmbarcador;
    private boolean motoristaServicoToken;
    private Integer motoristaToken;
    private Integer motoristaSeqPessoa;
    private List<Integer> consultaNeutralizacaoId;
    private List<Integer> motoristaTelefones;
    private List<AnaliseVeiculoDTOS> analiseVeiculoDTOS = new ArrayList<>();
    private FaixaValorDTO faixaValorDTO;
    private List<DetalheResDTOS> detalheResDTOS = new ArrayList<>();
    private FilialLocalidadeDTO filialLocalidadeDTO;
    private PessoaMotoristaDTO pessoaMotoristaDTO;
    private PessoaVinculoDTO pessoaVinculoDTO;
    private String consultaLimite;
    private String consultaPerfil;
    private LimitesPerfilPessoaDTO limitesPerfilPessoaDTO;
}
