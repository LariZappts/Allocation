package cucumber.steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.metodo.CondicaoMotorista.CondicaoMotorista;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.springframework.http.HttpMethod.POST;


public class GetHealthStep {

    private ResponseEntity<String> response;
    private TestRestTemplate template;
    private String url;
    private String endpoint;
    private CondicaoMotorista condicaoMotorista;


    @Before
    public void before() {
        template = new TestRestTemplate();
    }

    @Given("que realizo uma requisicao em POST (.*)")
    public void QueRealizoUmaRequisicaoEmPOST(final String url) {
        this.url = url;
    }

    @Given("preencho o body com as seguintes informacoes (.*), (.*), (.*)")
    public void PreenchoOBodyComAsSeguintesInformacoes(
            final String cnpjCertificadoDigital, final String cnpjClienteContrato, final String cpf) throws JsonProcessingException{

        condicaoMotorista = CondicaoMotorista
                .builder()
                .cnpjCertificadoDigital(cnpjCertificadoDigital)
                .cnpjClienteContrato(cnpjClienteContrato)
                .cpf(cpf)
                .build();

        final var httpHeaders = new HttpHeaders();
        httpHeaders.setBasicAuth("telerisco-sistema","a4d9bd9b-ea5c-47fa-8f68-dca0563a83be");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        String writeValueAsString = new ObjectMapper().writeValueAsString(condicaoMotorista);
        final var httpEntity = new HttpEntity<Object>(writeValueAsString, httpHeaders);
        final var endpoint = url.concat("/condicao-motorista");

        response = template.exchange(endpoint, POST, httpEntity, String.class);

        System.out.println("--------------------");
        System.out.println(response);
    }

    @Then("valido o (.*) exibido")
    public void ValidoOStatusEAMensagemExibida(final int Status) {
        assertThat("Status code expected is " + Status, Status, equalTo(response.getStatusCodeValue()));
    }

}

