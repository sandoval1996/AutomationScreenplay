Feature: Realizar apertura de nueva cuenta
  Yo como usuario
  Necesito abrir una nueva cuenta
  verificar que esta salga en el resumen de cuenta


  Scenario Outline: Realizar apertura de nueva cuenta
    Given Deseo ir a la pagina ParaBank
    When  realizar el registro de la cuenta <firstname>, <lastname>,<adress>, <city>, <state>, <zipcode>, <phone>, <ssn>, <username>, <password>, <rPassword>
    And  loguearse con usuario <user> y password <pass>
    Then verificar el numero de la cuenta en el resumen de la cuenta

    Examples:
      |firstname|lastname  |adress                 |city  |state  |zipcode   |phone      |ssn       |username  |password|rPassword|user      |pass    |
      |"jhon"   |"sandoval"|"calle 1 b oeste #67-89"|"cali"|"78999"|"3192"    |"319285789"|"7548"    |"jfs7548"|"123456"|"123456" |"jfs7548"|"123456"|