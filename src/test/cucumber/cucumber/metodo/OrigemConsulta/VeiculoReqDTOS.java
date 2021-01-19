package cucumber.metodo.OrigemConsulta;

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
public class VeiculoReqDTOS {
    private String placa;
    private String reSenha;
    private String codigoSenha;
    private ProprietarioReqDTO proprietarioReqDTO;
}
