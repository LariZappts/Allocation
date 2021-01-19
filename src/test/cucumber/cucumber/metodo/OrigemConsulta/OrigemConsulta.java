package cucumber.metodo.OrigemConsulta;

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
public class OrigemConsulta {
    private String origemConsulta;
    private String cnpjCertificadoDigital;
    private String cnpjClienteContrato;
    private String cnpjEmbarcador;
    private String cnpjFilialCliente;
    private String cpfUsuario;
    private MotoristaReqDTO motoristaReqDTO;
    private String tipoVeiculo;
    private List<VeiculoReqDTOS> veiculoReqDTOS = new ArrayList<>();
    private DadosViagemReqDTO dadosViagemReqDTO;
}
