@claseUno
Feature: Reserva de Habitacion

  @happyPath
  Scenario: Happy path
    Given El usuario abre la pagina https://automationintesting.online
    And El usuario hace click en el boton let me hack
    When El usuario llena el formulario
      | NAME           | EMAIL                  | TELEFONO    | SUBJECT           | DESCRIPTION                                     |
      | DON TEO KILLER | DONTEOKILLER@GMAIL.COM | 12345678912 | DONTEO DEATH NOTE | THIS IS A LETTER TO LET YOU KNOW YOU GON DIE MF |
    And El usuario hace click en el boton submit
    Then El usuario verifica el mensaje de exito Thanks for getting in touch DON TEO KILLER!

  @happyPathOutline
  Scenario Outline: Happy path Outline
    Given El usuario abre la pagina https://automationintesting.online
    And El usuario hace click en el boton let me hack
    When El usuario llena el formulario
      | NAME   | EMAIL   | TELEFONO   | SUBJECT   | DESCRIPTION   |
      | <NAME> | <EMAIL> | <TELEFONO> | <SUBJECT> | <DESCRIPTION> |
    And El usuario hace click en el boton submit
    Then El usuario verifica el mensaje de exito Thanks for getting in touch <NAME>!
    Examples:
      | NAME            | EMAIL                  | TELEFONO    | SUBJECT           | DESCRIPTION                                     |
      | DON TEO KILLER  | DONTEOKILLER@GMAIL.COM | 12345678912 | DONTEO DEATH NOTE | THIS IS A LETTER TO LET YOU KNOW YOU GON DIE MF |
      | DON TEO KILLER2 | DONTEOKILLER@GMAIL.COM | 12345678912 | DONTEO DEATH NOTE | THIS IS A LETTER TO LET YOU KNOW YOU GON DIE MF |
      | DON TEO KILLER3 | DONTEOKILLER@GMAIL.COM | 12345678912 | DONTEO DEATH NOTE | THIS IS A LETTER TO LET YOU KNOW YOU GON DIE MF |
      | DON TEO KILLER4 | DONTEOKILLER@GMAIL.COM | 12345678912 | DONTEO DEATH NOTE | THIS IS A LETTER TO LET YOU KNOW YOU GON DIE MF |
      | DON TEO KILLER5 | DONTEOKILLER@GMAIL.COM | 12345678912 | DONTEO DEATH NOTE | THIS IS A LETTER TO LET YOU KNOW YOU GON DIE MF |
      | DON TEO KILLER6 | DONTEOKILLER@GMAIL.COM | 12345678912 | DONTEO DEATH NOTE | THIS IS A LETTER TO LET YOU KNOW YOU GON DIE MF |


