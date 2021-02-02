package cucumber.metodo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProprietarioResDTO {
    private String cpf;
    private String cnpj;
    private String nome;
    private String codigoRntrc;
    private String situacaoRntrc;
    private String dataValidadeRntrc;
    private List<String> detalheResDTOS;
    private String imagemResDTOS;
}
