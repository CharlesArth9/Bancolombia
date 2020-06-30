@registro
Feature: Realizar registro en la pagina de practica de automatizacion
  Deseo registrarme en la pagina para practicar el patron de diseño screenplay

  @exitoso
  Scenario Outline: registrarse en la pagina exitosamente
    Given Carlos ingresa a la pagina de practica de automatizacion
    When Carlos se registra con la siguiente informacion
      | name   | lastname   | email   | day   | mouth   | year   |
      | <name> | <lastname> | <email> | <day> | <mouth> | <year> |

    Then Carlos verifica que el registro fue correcto

    Examples:
      | name   | lastname | email          | day | mouth | year |
      | Carlos | Mestra   | jose@gmail.com | 1   | June  | 1990 |
