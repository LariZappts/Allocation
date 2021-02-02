package cucumber.metodo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    private Integer retornoWs;
    private String mensagemRetorno;
    private String mensagemErros;
    private Integer seqConsulta;
    private String dataConsulta;
    private String horaConsulta;
    private ResultadoResDTO resultadoResDTO;
    private MotoristaResDTO motoristaResDTO;
    private List<VeiculoResDTOS> veiculoResDTOS = new ArrayList<>();
    private AnaliseDTO analiseDTO;
}
