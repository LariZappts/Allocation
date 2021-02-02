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
public class AnaliseVeiculoDTOS {
    private Integer seqVeiculo;
    private String placa;
    private Integer reSenha;
    private String codigoSenha;
    private boolean existe;
    private boolean possuiSenha;
    private boolean senhaValida;
    private Integer idSituacao;
    private String situacao;
    private String limite;
    private String consultaNeutralizacaoId;
    private List<DetalheResDTOS> detalheResDTOS = new ArrayList<>();
    private AnaliseProprietarioDTO analiseProprietarioDTO;
}
