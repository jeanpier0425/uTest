#language: es

Característica: prueba

  Esquema del escenario: : prueba sophos
    Dado abro la pagina
    Cuando me quiero registrar con los datos personales
      | firstname   | lastname   | email   | month   | day   | year   |
      | <firstname> | <lastname> | <email> | <month> | <day> | <year> |
    Y Adiciono mi ciudad de destino <city>


    Ejemplos:
      | firstname | lastname | email          | month | day | year |city|
      | jhon      | smith    | jhon@gmail.com | March | 3   | 1980 |Medellín, Antioquía, Colombia|