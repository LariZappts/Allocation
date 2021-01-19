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
public class ProprietarioReqDTO {
    private String tipoPessoa;
    private String cpf;
    private String cnpj;
    private String codigoRntrc;
}
