package cucumber.metodo.response;

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
public class ResultadoResDTO {
    private Integer codigo;
    private String categoria;
    private String mensagem;
    private String protocolo;
    private String advertencia;
    private Validade validade;

}
