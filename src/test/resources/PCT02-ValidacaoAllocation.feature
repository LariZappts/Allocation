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

  Scenario Outline: Validação da api Get Chair
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Chair>
    Then valido o status 200 apresentado

    Examples:
      | Chair                  |
      | /chair?relations=true  |
      | /chair?relations=false |

  Scenario Outline: Validação da api Get ChairId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <ChairId>
    Then valido o status 200 apresentado

    Examples:
      | ChairId                  |
      | /chair/20?relations=true |
      | /chair/25?relations=true |
      | /chair/26?relations=true |
      | /chair/27?relations=true |
      | /chair/11?relations=true |

  Scenario Outline: Validação da api Get Chair Id Able-Collaborator
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <ChairIdAbleCollaborator>
    Then valido o status 200 apresentado

    Examples:
      | ChairIdAbleCollaborator     |
      | /chair/20/able-collaborator |
      | /chair/25/able-collaborator |
      | /chair/26/able-collaborator |
      | /chair/27/able-collaborator |
      | /chair/11/able-collaborator |

  Scenario Outline: Validação da api Get Chair Id Allocation-status
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api <ChairId>, <AllocationStatus>
    Then valido o status 200 apresentado

    Examples:
      | ChairId   | AllocationStatus                  |
      | /chair/20 | /allocation-status?relations=true |
      | /chair/25 | /allocation-status?relations=true |
      | /chair/26 | /allocation-status?relations=true |
      | /chair/27 | /allocation-status?relations=true |
      | /chair/11 | /allocation-status?relations=true |

  Scenario Outline: Validação da api Get Chair-ChapterId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api <ChairChapter>, <OrderBy>
    Then valido o status 200 apresentado

    Examples:
      | ChairChapter     | OrderBy             |
      | /chair/chapter/1 | ?orderBy=id         |
      | /chair/chapter/1 | ?orderBy=title      |
      | /chair/chapter/1 | ?orderBy=allocation |

  Scenario Outline: Validação da api Get ChairClient-ChapterId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api <ChairClient>, <OrderBy>
    Then valido o status 200 apresentado

    Examples:
      | ChairClient      | OrderBy                            |
      | /chair/client/1? | relations=true&orderBy=id          |
      | /chair/client/1? | relations=true&orderBy=title       |
      | /chair/client/1? | relations=true&orderBy=allocation  |
      | /chair/client/1? | relations=false&orderBy=id         |
      | /chair/client/1? | relations=false&orderBy=title      |
      | /chair/client/1? | relations=false&orderBy=allocation |

  Scenario Outline: Validação da api Get Chair-Skils
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <ChairSkils>
    Then valido o status 200 apresentado

    Examples:
      | ChairSkils                   |
      | /chair-skills?relations=true |
      | /chair-skills?relations=true |

  Scenario Outline: Validação da api Get Chair-Skils-Id
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <ChairSkilsid>
    Then valido o status 200 apresentado

    Examples:
      | ChairSkilsid     |
      | /chair-skills/22 |
      | /chair-skills/20 |

  Scenario Outline: Validação da api Get Seniority
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Seniority>
    Then valido o status 200 apresentado

    Examples:
      | Seniority  |
      | /seniority |

  Scenario Outline: Validação da api Get SeniorityId
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <SeniorityId>
    Then valido o status 200 apresentado

    Examples:
      | SeniorityId  |
      | /seniority/1 |
      | /seniority/2 |
      | /seniority/3 |
      | /seniority/4 |
      | /seniority/5 |
      | /seniority/6 |
      | /seniority/7 |

  Scenario Outline: Validação da api Get Allocation-Status
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <allocation-status>
    Then valido o status 200 apresentado

    Examples:
      | allocation-status  |
      | /allocation-status |

  Scenario Outline: Validação da api Get Allocation-Status-Id
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <allocation-status-id>
    Then valido o status 200 apresentado

    Examples:
      | allocation-status-id |
      | /allocation-status/1 |
      | /allocation-status/2 |
      | /allocation-status/3 |
      | /allocation-status/4 |
      | /allocation-status/5 |
      | /allocation-status/6 |
      | /allocation-status/7 |

  Scenario Outline: Validação da api Get Salles-Status
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Salles-Status>
    Then valido o status 200 apresentado

    Examples:
      | Salles-Status  |
      | /salles-status |

  Scenario Outline: Validação da api Get Salles-Status-Id
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Salles-Status-Id>
    Then valido o status 200 apresentado

    Examples:
      | Salles-Status-Id  |
      | /salles-status/1  |
      | /salles-status/2  |
      | /salles-status/3  |
      | /salles-status/4  |
      | /salles-status/5  |
      | /salles-status/6  |
      | /salles-status/7  |
      | /salles-status/8  |
      | /salles-status/9  |
      | /salles-status/10 |
      | /salles-status/11 |
      | /salles-status/12 |
      | /salles-status/13 |
      | /salles-status/14 |
      | /salles-status/15 |

  Scenario Outline: Validação da api Get Collaborator-Status
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <collaborator-status>
    Then valido o status 200 apresentado

    Examples:
      | collaborator-status  |
      | /collaborator-status |

  Scenario Outline: Validação da api Get Collaborator-Status-Id
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <collaborator-status-id>
    Then valido o status 200 apresentado

    Examples:
      | collaborator-status-id |
      | /collaborator-status/1 |
      | /collaborator-status/2 |
      | /collaborator-status/3 |
      | /collaborator-status/4 |
      | /collaborator-status/5 |

  Scenario Outline: Validação da api Get Auth-me
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Auth-me>
    Then valido o status 200 apresentado

    Examples:
      | Auth-me  |
      | /auth/me |

  Scenario Outline: Validação da api Get Permission
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Permission>
    Then valido o status 200 apresentado

    Examples:
      | Permission  |
      | /permission |

  Scenario Outline: Validação da api Get Permission-Id
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <PermissionId>
    Then valido o status 200 apresentado

    Examples:
      | PermissionId  |
      | /permission/1 |
      | /permission/2 |
      | /permission/3 |
      | /permission/4 |
      | /permission/5 |
      | /permission/6 |
      | /permission/7 |
      | /permission/8 |
      | /permission/9 |

  Scenario Outline: Validação da api Get Role
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Role>
    Then valido o status 200 apresentado

    Examples:
      | Role  |
      | /role |

  Scenario Outline: Validação da api Get Role-Id
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <RoleId>
    Then valido o status 200 apresentado

    Examples:
      | RoleId   |
      | /role/1  |
      | /role/12 |
      | /role/32 |
      | /role/33 |

  Scenario Outline: Validação da api Get Historic
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <Historic>
    Then valido o status 200 apresentado

    Examples:
      | Historic                  |
      | /historic?relations=true  |
      | /historic?relations=false |

  Scenario Outline: Validação da api Get Historic-Id
    Given acesso http://allocation-back-116610402.us-east-1.elb.amazonaws.com
    And realizo uma requisicao GET na api de <HistoricId>
    Then valido o status 200 apresentado

    Examples:
      | HistoricId                  |
      | /historic/1?relations=true  |
      | /historic/1?relations=false |