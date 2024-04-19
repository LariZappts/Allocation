# new feature
# Tags: optional

Feature: Validação Allocation

  Scenario: Validação da api Get Client
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de /client
    Then valido o status 200 apresentado

  Scenario Outline: Validação da api Get ClienteId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <ClienteId>
    Then valido o status 200 apresentado

    Examples:
      | ClienteId  |
      | /client/1  |
      | /client/2  |
      | /client/3  |
      | /client/4  |
      | /client/5  |
      | /client/6  |
      | /client/7  |
      | /client/8  |
      | /client/9  |
      | /client/10 |
      | /client/11 |
      | /client/12 |

  Scenario: Validação da api Get User
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de /user
    Then valido o status 200 apresentado

  Scenario Outline: Validação da api Get UserId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <UserId>
    Then valido o status 200 apresentado

    Examples:
      | UserId    |
      | /user/17  |
      | /user/60  |
      | /user/50  |
      | /user/56  |
      | /user/61  |
      | /user/31  |
      | /user/46  |
      | /user/44  |
      | /user/33  |
      | /user/16  |
      | /user/57  |
      | /user/59  |

  Scenario Outline: Validação da api Get UserPermissionsId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <UserPermissionsId>
    Then valido o status 200 apresentado

    Examples:
      | UserPermissionsId    |
      | /user/permissions/17 |
      | /user/permissions/60 |
      | /user/permissions/50 |
      | /user/permissions/56 |
      | /user/permissions/61 |
      | /user/permissions/31 |
      | /user/permissions/46 |
      | /user/permissions/44 |
      | /user/permissions/33 |
      | /user/permissions/16 |
      | /user/permissions/57 |
      | /user/permissions/59 |

  Scenario: Validação da api Get Skill
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de /skill
    Then valido o status 200 apresentado

  Scenario Outline: Validação da api Get SkillId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <SkillId>
    Then valido o status 200 apresentado

    Examples:
      | SkillId  |
      | /skill/1 |
      | /skill/3 |
      | /skill/4 |
      | /skill/5 |

  Scenario: Validação da api Get Position
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de /position
    Then valido o status 200 apresentado

  Scenario Outline: Validação da api Get PositionId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <PositionId>
    Then valido o status 200 apresentado

    Examples:
      | PositionId   |
      | /position/85 |
      | /position/86 |
      | /position/87 |
      | /position/50 |
      | /position/51 |
      | /position/52 |
      | /position/53 |
      | /position/54 |
      | /position/55 |
      | /position/56 |
      | /position/57 |
      | /position/58 |

  Scenario: Validação da api Get Technology
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de /technology
    Then valido o status 200 apresentado

  Scenario Outline: Validação da api Get TechnologyId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <TechnologyId>
    Then valido o status 200 apresentado

    Examples:
      | TechnologyId   |
      | /technology/1  |
      | /technology/2  |
      | /technology/3  |
      | /technology/4  |
      | /technology/5  |
      | /technology/6  |
      | /technology/7  |
      | /technology/8  |
      | /technology/9  |
      | /technology/10 |
      | /technology/11 |
      | /technology/12 |

  Scenario Outline: Validação da api Get Chapter
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Chapter>
    Then valido o status 200 apresentado

    Examples:
      | Chapter                  |
      | /chapter?relations=true  |
      | /chapter?relations=false |

  Scenario Outline: Validação da api Get ChapterId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Chapter>
    Then valido o status 200 apresentado

    Examples:
      | Chapter    |
      | /chapter/1 |
      | /chapter/2 |
      | /chapter/3 |
      | /chapter/4 |
      | /chapter/5 |
      | /chapter/6 |
      | /chapter/7 |
      | /chapter/8 |
      | /chapter/9 |

  Scenario Outline: Validação da api Get Project
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Project>
    Then valido o status 200 apresentado

    Examples:
      | Project                  |
      | /project?relations=true  |
      | /project?relations=false |

  Scenario Outline: Validação da api Get ProjectId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Project>
    Then valido o status 200 apresentado

    Examples:
      | Project     |
      | /project/88 |
      | /project/27 |
      | /project/54 |
      | /project/26 |
      | /project/34 |
      | /project/47 |
      | /project/21 |
      | /project/51 |
      | /project/33 |

  Scenario Outline: Validação da api Get Technologies-Chapter
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <TechnologiesChapter>
    Then valido o status 200 apresentado

    Examples:
      | TechnologiesChapter                   |
      | /technologies-chapter?relations=true  |
      | /technologies-chapter?relations=false |

  Scenario Outline: Validação da api Get Technologies-Chapter/TechnologiesId-ChapterId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <TechnologiesChapter>
    Then valido o status 200 apresentado

    Examples:
      | TechnologiesChapter                       |
      | /technologies-chapter/1/4?relations=true  |
      | /technologies-chapter/1/1?relations=true  |
      | /technologies-chapter/1/17?relations=true |
      | /technologies-chapter/2/5?relations=true  |
      | /technologies-chapter/2/4?relations=true  |
      | /technologies-chapter/2/3?relations=true  |
      | /technologies-chapter/2/2?relations=true  |
      | /technologies-chapter/3/15?relations=true |

  Scenario Outline: Validação da api Get Collaborator
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Collaborator>
    Then valido o status 200 apresentado

    Examples:
      | Collaborator                  |
      | /collaborator?relations=true  |
      | /collaborator?relations=false |

  Scenario Outline: Validação da api Get CollaboratorId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <CollaboratorId>
    Then valido o status 200 apresentado

    Examples:
      | CollaboratorId    |
      | /collaborator/369 |
      | /collaborator/331 |
      | /collaborator/308 |
      | /collaborator/345 |
      | /collaborator/306 |
      | /collaborator/375 |