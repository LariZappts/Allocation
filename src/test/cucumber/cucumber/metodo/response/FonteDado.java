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
public class FonteDado {
    private Integer idFonteDado;
    private String desFonteDado;
    private Integer numNivelCongela;
    private String codUsuarioFD;
    private String dhrAlterFD;
}
