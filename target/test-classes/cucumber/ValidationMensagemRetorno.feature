# new feature
# Tags: optional

Feature: Validation Mensagem Retorno

  Scenario Outline: CPNJ Certificado Digital
    Given que realizo uma requisicao em POST https://apipreqa.telerisco.com.br/apiconsulta/internal
    And preencho o body com as seguintes informacoes <cnpjCertificadoDigital>, <cnpjClienteContrato>, <cpf>
    Then valido o <status> exibido

    Examples:
      | cnpjCertificadoDigital | cnpjClienteContrato | cpf         | status |
      | 00634453000170         | 00634453000170      | 15871086071 | 200    |
      | 00634453000170         | 00634453000170      | 1587108607- | 400    |
