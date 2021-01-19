# new feature
# Tags: optional

Feature: Validation Mensagem Retorno

  Scenario Outline: Validação de dados de Entrada
    Given que realizo uma requisicao POST no Telerisco https://apipreqa.telerisco.com.br
    And preencho body de requisicao com as seguintes informacoes <origemConsultas>, <cnpjCertificadoDigital>, <cnpjClienteContrato>, <cnpjEmbarcador>, <cnpjFilialCliente>, <cpfUsuario>, <tipoVeiculo>
    And motoristaReqDTO <cpfmotoristaReqDTO>, <reTokenmotoristaReqDTO>, <codigoTokenmotoristaReqDTO>
    And proprietarioReqDTO <tipoPessoaproprietarioReqDTO>, <cpfproprietarioReqDTO>, <cnpjproprietarioReqDTO>, <codigoRntrcproprietarioReqDTO>
    And veiculoReqDTOS <placaveiculoReqDTOS>, <reSenhaveiculoReqDTOS>, <codigoSenhaveiculoReqDTOS>
    And cidadeOrigem <ufcidadeOrigem>, <cidadecidadeOrigem>
    And cidadeDestino <ufcidadeDestino>, <cidadecidadeDestino>
    And dadosViagemReqDTO <codigoMercadoriadadosViagemReqDTO>, <faixaCarregamentodadosViagemReqDTO>
    And envio a requisição
    Then valido o <status> apresentado

  Examples:
    | origemConsultas | cnpjCertificadoDigital | cnpjClienteContrato | cnpjEmbarcador | cnpjFilialCliente | cpfUsuario  | tipoVeiculo | cpfmotoristaReqDTO | reTokenmotoristaReqDTO | codigoTokenmotoristaReqDTO | tipoPessoaproprietarioReqDTO | cpfproprietarioReqDTO | cnpjproprietarioReqDTO | codigoRntrcproprietarioReqDTO | placaveiculoReqDTOS | reSenhaveiculoReqDTOS | codigoSenhaveiculoReqDTOS | ufcidadeOrigem | cidadecidadeOrigem | ufcidadeDestino | cidadecidadeDestino | codigoMercadoriadadosViagemReqDTO | faixaCarregamentodadosViagemReqDTO | status|
    | 1               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 2               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 3               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 4               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 5               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 6               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 7               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 8               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 9               | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
    | 10              | 00634453000170         | 43244631000169      | 49475833000106 | 43244631000169    | 42545410829 | 1           | 52674702010        |                        |                            | F                            | 98437953006           |                        |                               | VAN1818             | 0                     |                           | SP             | SANTOS             | RJ              | NITEROI             | 21                                | 2                                  | 200   |
  ##Teste Campo cnpjCertificadoDigital
    |                 |                        |                     |                |                   |             |             |                    |                        |                            |                              |                       |                        |                               |                     |                       |                           |                |                    |                 |                     |                                   |                                    |       |











