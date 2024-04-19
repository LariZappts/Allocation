package cucumber.steps;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.config.Config;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.springframework.http.HttpMethod.GET;


@Slf4j
public class ConsultaStep {

    private ResponseEntity<String> response;
    private TestRestTemplate template;
    private String urll;
    private String endpoint;
    private ObjectMapper objectMapper;


    @Before
    public void before() {
        objectMapper = new ObjectMapper();
        template = new TestRestTemplate();
    }

    @Given("acesso (.*)$")
    public void AcessarURL(final String url)  {
        this.urll = url;
    }

    @And("realizo uma requisicao GET na api de (.*)")
    public void facoUmGETNaApiDeClientes(final String api) throws JsonProcessingException {

        final var httpHeaders = new HttpHeaders();

        httpHeaders.setBearerAuth(Config.TOKEN);
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        final var httpEntity = new HttpEntity<>(null, httpHeaders);
        this.endpoint = urll.concat(api);

        template = new TestRestTemplate(TestRestTemplate.HttpClientOption.SSL);
        response = template.exchange(this.endpoint, GET, httpEntity, String.class);

        System.out.println("--------------------");
    }

    @Then("valido o status (.*) apresentado")
    public void validoOStatusApresentado(final int Status) {
        assertThat("Status code expected is " + Status, Status, equalTo(response.getStatusCodeValue()));
    }

    @And("realizo uma requisicao GET na api (.*), (.*)")
    public void realizoUmaRequisicaoGETNaApiChairIdAllocationStatus(final String api,final String api2) throws JsonProcessingException {

        final var httpHeaders = new HttpHeaders();

        httpHeaders.setBearerAuth(Config.TOKEN);
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        final var httpEntity = new HttpEntity<>(null, httpHeaders);
        this.endpoint = urll.concat(api+api2);

        template = new TestRestTemplate(TestRestTemplate.HttpClientOption.SSL);
        response = template.exchange(this.endpoint, GET, httpEntity, String.class);

        System.out.println("--------------------");
    }
}