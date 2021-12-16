Feature: Compra vestidos
  Yo como usuario
  Necesito comprar 2 vestidos  de talla y color de preferencia

  Scenario: Comprar vestidos de tallar y color de preferencia
    Given Necesito buscar un vestido negro
    When Agregar vestidos de color y talla de preferencia
    Then Valido que el vestido sea agregado al carrito de compras