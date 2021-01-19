package cucumber.metodo.CondicaoMotorista;

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
public class CondicaoMotorista {
    private String cnpjCertificadoDigital;
    private String cnpjClienteContrato;
    private String cpf;
}
