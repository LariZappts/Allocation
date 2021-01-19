package cucumber.steps;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.metodo.CondicaoMotorista.CondicaoMotorista;
import cucumber.metodo.OrigemConsulta.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import org.junit.Before;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.springframework.http.HttpMethod.POST;


public class ConsultaStep {

    private ResponseEntity<String> response;
    private TestRestTemplate template;
    private String url;
    private String endpoint;
    private CondicaoMotorista condicaoMotorista;
    private OrigemConsulta origemConsulta;
    private MotoristaReqDTO motoristaReqDTO;
    private ProprietarioReqDTO proprietarioReqDTO;
    private List<VeiculoReqDTOS> veiculoReqDTOS = new ArrayList<>();
    private DadosViagemReqDTO dadosViagemReqDTO;
    private CidadeOrigem cidadeOrigem;
    private CidadeDestino cidadeDestino;

    @Before
    public void setUp() throws Exception {
        try {
            //RestAssured.port = port;
            RestAssured.useRelaxedHTTPSValidation();
            RestAssured.config().getSSLConfig().with().keyStore("classpath:src/test/cucumber/cucumber/steps/dogtag_HomologAWS_00634453000170 (4).p12", "sWa010l06");
        } catch (Exception ex) {
            System.out.println("Error while loading keystore >>>>>>>>>");
            ex.printStackTrace();
        }
    }

    @Given("que realizo uma requisicao POST no Telerisco (.*)")
    public void queRealizoUmaRequisicaoPOSTNoTeleriscoHttpsApipreqaTeleriscoComBr(final String url) {
        this.url = url;
    }

    @And("preencho body de requisicao com as seguintes informacoes (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
    public void preenchoBodyDeRequisicaoComAsSeguintesInformacoesOrigemConsultaCnpjCertificadoDigitalCnpjClienteContratoCnpjEmbarcadorCnpjFilialClienteCpfUsuarioTipoVeiculo
            (final String origemConsultas, final String cnpjCertificadoDigital, final String cnpjClienteContrato,
             final String cnpjEmbarcador, final String cnpjFilialCliente, final String cpfUsuario, final String tipoVeiculo) {

        origemConsulta = OrigemConsulta
                .builder()
                .origemConsulta(origemConsultas)
                .cnpjCertificadoDigital(cnpjCertificadoDigital)
                .cnpjClienteContrato(cnpjClienteContrato)
                .cnpjEmbarcador(cnpjEmbarcador)
                .cnpjFilialCliente(cnpjFilialCliente)
                .cpfUsuario(cpfUsuario)
                .tipoVeiculo(tipoVeiculo)
                .build();
    }

    @And("motoristaReqDTO (.*), (.*), (.*)")
    public void motoristareqdtoCpfmotoristaReqDTOReTokenmotoristaReqDTOCodigoTokenmotoristaReqDTO
            (final String cpfmotoristaReqDTO, final String reTokenmotoristaReqDTO, final String codigoTokenmotoristaReqDTO) {

        motoristaReqDTO = MotoristaReqDTO
                .builder()
                .cpf(cpfmotoristaReqDTO)
                .reToken(reTokenmotoristaReqDTO)
                .codigoToken(codigoTokenmotoristaReqDTO)
                .build();
    }

    @And("proprietarioReqDTO (.*), (.*), (.*), (.*)")
    public void proprietarioreqdtoTipoPessoaproprietarioReqDTOCpfproprietarioReqDTOCnpjproprietarioReqDTOCodigoRntrcproprietarioReqDTO
            (final String tipoPessoaproprietarioReqDTO, final String cpfproprietarioReqDTO, final String cnpjproprietarioReqDTO, final String codigoRntrcproprietarioReqDTO) {

        proprietarioReqDTO = ProprietarioReqDTO
                .builder()
                .tipoPessoa(tipoPessoaproprietarioReqDTO)
                .cpf(cpfproprietarioReqDTO)
                .cnpj(cnpjproprietarioReqDTO)
                .codigoRntrc(codigoRntrcproprietarioReqDTO)
                .build();
    }

    @And("veiculoReqDTOS (.*), (.*), (.*)")
    public void veiculoreqdtosPlacaveiculoReqDTOSReSenhaveiculoReqDTOSCodigoSenhaveiculoReqDTOS
            (final String placaveiculoReqDTOS, final String reSenhaveiculoReqDTOS, final String codigoSenhaveiculoReqDTOS) {

        veiculoReqDTOS.add(VeiculoReqDTOS
                .builder()
                .placa(placaveiculoReqDTOS)
                .reSenha(reSenhaveiculoReqDTOS)
                .codigoSenha(codigoSenhaveiculoReqDTOS)
                .build());
    }

    @And("cidadeOrigem (.*), (.*)")
    public void cidadeorigemUfcidadeOrigemCidadecidadeOrigem
            (final String ufcidadeOrigem, final String cidadecidadeOrigem) {

        cidadeOrigem = CidadeOrigem
                .builder()
                .uf(ufcidadeOrigem)
                .cidade(cidadecidadeOrigem)
                .build();
    }

    @And("cidadeDestino (.*), (.*)")
    public void cidadedestinoUfcidadeDestinoCidadecidadeDestino
            (final String ufcidadeDestino, final String cidadecidadeDestino) {

        cidadeDestino = CidadeDestino
                .builder()
                .uf(ufcidadeDestino)
                .cidade(cidadecidadeDestino)
                .build();
    }

    @And("dadosViagemReqDTO (.*), (.*)")
    public void dadosviagemreqdtoCodigoMercadoriadadosViagemReqDTOFaixaCarregamentodadosViagemReqDTO
            (final String codigoMercadoriadadosViagemReqDTO, final String faixaCarregamentodadosViagemReqDTO) {

        dadosViagemReqDTO = DadosViagemReqDTO
                .builder()
                .codigoMercadoria(codigoMercadoriadadosViagemReqDTO)
                .faixaCarregamento(faixaCarregamentodadosViagemReqDTO)
                .build();
    }


    @And("envio a requisição")
    public void envioARequisição() throws JsonProcessingException {

        origemConsulta.setMotoristaReqDTO(motoristaReqDTO);
        veiculoReqDTOS.forEach(i ->i.setProprietarioReqDTO(proprietarioReqDTO));
        origemConsulta.setVeiculoReqDTOS(veiculoReqDTOS);
        dadosViagemReqDTO.setCidadeOrigem(cidadeOrigem);
        dadosViagemReqDTO.setCidadeDestino(cidadeDestino);
        origemConsulta.setDadosViagemReqDTO(dadosViagemReqDTO);


        final var httpHeaders = new HttpHeaders();
        httpHeaders.setBasicAuth("telerisco-sistema","a4d9bd9b-ea5c-47fa-8f68-dca0563a83be");
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        String writeValueAsString = new ObjectMapper().writeValueAsString(origemConsulta);
        final var httpEntity = new HttpEntity<Object>(writeValueAsString, httpHeaders);
        final var endpoint = url.concat("/apiconsulta/consulta/internal");

        template = new TestRestTemplate(TestRestTemplate.HttpClientOption.SSL);
        response = template.exchange(endpoint, POST, httpEntity, String.class);

        System.out.println("--------------------");
        System.out.println(response);
    }



    @Then("valido o (.*) apresentado")
    public void validoOStatusApresentado(final int Status) {
        assertThat("Status code expected is " + Status, Status, equalTo(response.getStatusCodeValue()));
    }
}
