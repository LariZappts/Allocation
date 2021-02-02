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
public class FaixaValorDTO {
    private Integer codFaixaValor;
    private String desFaixaValor;
    private Integer vlrFaixaInicial;
    private Integer vlrFaixaFinal;
}
