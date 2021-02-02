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
public class Periodicidade {
    private String codUsuario;
    private String dhrAlter;
    private Integer codPeriodicidade;
    private String desPeridiocidade;
}
