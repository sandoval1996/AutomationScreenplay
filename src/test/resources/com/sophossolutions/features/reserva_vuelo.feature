Feature: Reserva de vuelos despegar
  Yo como estudiante
  Necesito realizar una reserva de vuelo
  para aprender automatizar

  Scenario: Reserva de vuelo
    Given necesito reservar un vuelo
    When Seleciono "Medellin" y "Cali"
    And  ingresa fechas "27/11/2021" y "30/11/2021"
    Then valido que el vuelo selecionado esta entre "Medellin - Cali"